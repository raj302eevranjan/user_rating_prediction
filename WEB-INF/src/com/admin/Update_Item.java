/**
 * @author
 */
package com.admin;

import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.dao.AdminDAO;




@SuppressWarnings("serial")
public class Update_Item extends HttpServlet
{
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		boolean flag = false;
		String s = "",fileName="",ext="",filepath = "",root = "";
		 String c_name="";
		
		@SuppressWarnings("rawtypes")
		ArrayList list =  new ArrayList();
		ResultSet rs = null;
		RequestDispatcher rd = null;
		HttpSession session = request.getSession();
		
		try 
		{
			
		
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			if(isMultipart)
 			{
 				FileItemFactory factory = new DiskFileItemFactory();
 	            ServletFileUpload upload = new ServletFileUpload(factory);
 	            
 	            try 
 	            {
 	            	@SuppressWarnings("rawtypes")
					List items = upload.parseRequest(request);
  	                @SuppressWarnings("rawtypes")
					Iterator iterator = items.iterator();
  	                while (iterator.hasNext()) 
  	                {
  	                	FileItem item = (FileItem) iterator.next();
  	                	
  	                	
	                    if (item.isFormField()) 
	                    {
	                    	s = item.getString();
	                    	list.add(s);//All Form Field Values
	                    	
	                    }
	                    
	                    else 
	                    {
	                    	 System.out.println("====else======");
	                    	 
	                    	 fileName = item.getName();
	                    	 if(fileName!="")
		                    		ext=fileName.substring(fileName.lastIndexOf(".")+1,fileName.lastIndexOf(""));
	                    	 
	                    
				  	           c_name=list.get(0).toString();
				  	           
				  	           
				  	           
	                    	 
	                    	 root = request.getRealPath("")+"\\"+c_name.trim()+"\\Item_Images\\";
	                         
	                    	
	                    	
	                    	 
	                    	 Files.createDirectories(Paths.get(root));
	                    	
	                    	 
			                filepath = root+fileName;
			  	             File f1=new File(filepath);
			  	             item.write(f1);
			  	             System.out.println("File Writing is compleated...");
			  	           
			  	             list.add(fileName);
			  	         
			  	         
	                    }
	                        
  	                }
  	                System.out.println("list "+list);
  	               flag= AdminDAO.Update_Item(list);
  	              
                    
  	                
	  	            if(flag)
	  				{
	  	            	
	  	            	
	  	            	rd=request.getRequestDispatcher("/admin_jsp/view_items.jsp?no=2");
						rd.forward(request, response);
	  				}
	  				else
	  				{
	  					rd=request.getRequestDispatcher("/admin_jsp/view_items.jsp?no=0");
						rd.forward(request, response);
	  				}
  	                
  	         
  	                
	  	          
				}
 	            catch (Exception e)
 	            {
					System.out.println("Opps,Exception While Creating The File : " );
					e.printStackTrace();
				}
 			}
			
		}
		catch (Exception e) 
		{
			System.out.println("Opps,Exception In Admin==>SearchFileAction Servlet : ");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	

}
