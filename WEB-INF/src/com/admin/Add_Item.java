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
public class Add_Item extends HttpServlet
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
	                    	 
	                    
				  	           c_name=AdminDAO.getCategoryName(list.get(0).toString());
				  	           
				  	           
				  	           
	                    	 
	                    	 root = request.getRealPath("")+"\\"+c_name.trim()+"\\Item_Images\\";
	                         
	                    	
	                    	
	                    	 
	                    	 Files.createDirectories(Paths.get(root));
	                    	
	                    	 
			                filepath = root+fileName;
			  	             File f1=new File(filepath);
			  	             item.write(f1);
			  	             System.out.println("File Writing is compleated...");
			  	           
			  	             list.add(fileName);
			  	         
			  	         
	                    }
	                        
  	                }
  	               flag= AdminDAO.add_Item(list);
  	              
                    
  	                
	  	            if(flag)
	  				{
	  	            	
	  	            	rd=request.getRequestDispatcher("/admin_jsp/add_item.jsp?no=1");
						rd.forward(request, response);
	  				}
	  				else
	  				{
	  					rd=request.getRequestDispatcher("/admin_jsp/add_item.jsp?no=0");
						rd.forward(request, response);
	  				}
  	                
  	         
  	                
	  	          
				}
 	            catch (Exception e)
 	            {
					System.out.println("Opps,Exception While Creating The File : " );
					e.printStackTrace();
				}
 			}
			
			else if(request.getParameter("submit").equals("Display"))
				{
					
					
						rd=request.getRequestDispatcher("/admin_jsp/add_item.jsp");
						rd.forward(request, response);
					
					
				}
			
			
			else if(request.getParameter("submit").equals("View"))
			{
				
				
					rd=request.getRequestDispatcher("/admin_jsp/select_category.jsp");
					rd.forward(request, response);
				
				
			}
			
			else if(request.getParameter("submit").equals("Delete"))
			{
				
				String id=request.getParameter("item_id");
				 flag=AdminDAO.delete_Item_Details(id);
				 if(flag)
				 {
					rd=request.getRequestDispatcher("/admin_jsp/view_items.jsp?no=3");
					rd.forward(request, response);
				 }
				 else
				 {
					rd=request.getRequestDispatcher("/admin_jsp/view_items.jsp");
					rd.forward(request, response);
				
				 }
			}
			
			else if(request.getParameter("submit").equals("Edit"))
			{
				
				String id=request.getParameter("item_id");
				
				
					rd=request.getRequestDispatcher("/admin_jsp/edit_item.jsp?item_id="+id+"");
					rd.forward(request, response);
				 
			}
			
			else if(request.getParameter("submit").equals("Show_Products"))
			{
				String cat_code=request.getParameter("cat_code");
				
					rd=request.getRequestDispatcher("/admin_jsp/view_items.jsp?cat_code="+cat_code+"");
					rd.forward(request, response);
				
				
			}	
			
			
			
			else if(request.getParameter("submit").equals("UN_ADD"))
			{
				String cat_code=request.getParameter("cat_code");
				String Item_Name=request.getParameter("Item_Name");
				
				String item_code=request.getParameter("item_id");
				String Item_Category_Name=request.getParameter("Item_Category");
				
				String Item_prize=request.getParameter("Item_prize");
				
				AdminDAO.add_unintresting_Item(Item_Name, item_code, Item_Category_Name, cat_code, Item_prize);
				
				AdminDAO.update_Item_UNINT_status(item_code);
				
					rd=request.getRequestDispatcher("/admin_jsp/unintersting_items.jsp?cat_code="+cat_code+"");
					rd.forward(request, response);
				
				
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Opps,Exception In Admin==>SearchFileAction Servlet : ");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	

}
