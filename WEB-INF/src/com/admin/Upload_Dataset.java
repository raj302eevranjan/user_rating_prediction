
package com.admin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
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
public class Upload_Dataset extends HttpServlet
{
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		boolean flag = false;
		int patientId=0,doctorId=0;
		String s = "",fileName="",ext="",filepath = "",root = "",inFilePath = "",outFilePath = "";
		@SuppressWarnings("rawtypes")
		ArrayList list =  new ArrayList();
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
	                    	 fileName = item.getName();
	                    	 if(fileName!="")
		                    		ext=fileName.substring(fileName.lastIndexOf(".")+1,fileName.lastIndexOf(""));
	                    	 
	                    	 root = request.getRealPath("")+"\\dataset\\";
	                    	 File f = new File(root);
	                    	 if(!f.exists())
	                   		 f.mkdir();
	                    	 
			                 filepath = root+fileName;
			  	             File f1=new File(filepath);
			  	             item.write(f1);
			  	             flag = true;
			  	             System.out.println("File Created Successfully......");
			  	             session.setAttribute("file_name",fileName);
			  	             session.setAttribute("file_ext",ext);
	                    }
	                        
  	                }
  	                
  	                
  	              boolean flag2=	Excellread.readexcell(filepath);
  	              AdminDAO.update_no();
  	                System.out.println("Form Fields :\n"+list);
  	               
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
			System.out.println("Opps,Exception While Creating The File : " );
			e.printStackTrace();
		}
		

			/*if(flag2)
			{
				 rd=request.getRequestDispatcher("/res/JSP/Admin/upload_dataset.jsp?no=1");
				rd.forward(request, response);
			}
			else
			{
				rd=request.getRequestDispatcher("/res/JSP/Admin/upload_dataset.jsp?no=2");
				rd.forward(request, response);
			}*/
			
		
		
		}
}

