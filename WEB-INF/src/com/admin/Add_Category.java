package com.admin;




import java.io.IOException;

import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AdminDAO;



public class Add_Category extends HttpServlet 
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException
	{

		try
		{
			RequestDispatcher rd=null;
			HttpSession ses=null;
			ses=request.getSession();
			boolean flag=false;
			String subreq=request.getParameter("submit");
			System.out.println("88888"+subreq);
			if(subreq.equals("Add"))
			{
				
				String Category_Name = request.getParameter("Category_Name");
				String Category_Short_Name = request.getParameter("Category_Short_Name");
				
				
				flag=AdminDAO.add_Category(Category_Name,Category_Short_Name);
				if(flag)
				{
					rd=request.getRequestDispatcher("/admin_jsp/add_category.jsp?no=1");
					rd.forward(request, response);
				}
				
			}
			else if(subreq.equals("Edit"))
			{
				
				String id=request.getParameter("Cid");
				System.out.println("ready to delete "+id);
				ses.setAttribute("cid", id);
				rd=request.getRequestDispatcher("/admin_jsp/edit_category.jsp");
				rd.forward(request, response);
			
			}
			
			else if(subreq.equals("Delete"))
			{
				
				String id=request.getParameter("Cid");
			 flag=AdminDAO.delete_category_Details(id);
			 if(flag)
			 {
				rd=request.getRequestDispatcher("/admin_jsp/add_category.jsp?no=3");
				rd.forward(request, response);
			 }
			}
			else if(subreq.equals("update"))
			{
				String cid=ses.getAttribute("cid").toString();
				System.out.println("ready to delete "+cid);
				String Category_Name=request.getParameter("Category_Name");
				String Category_Short_Name=request.getParameter("Category_Short_Name");
				
			 flag=AdminDAO.updatee_CategoryDetails(cid, Category_Name,Category_Short_Name); 
			 if(flag)
			 {
				rd=request.getRequestDispatcher("/admin_jsp/add_category.jsp?no=2");
				rd.forward(request, response);
			 }
			}
			
			
			
			else if(subreq.equals("Display"))
			{
				
				
					rd=request.getRequestDispatcher("/admin_jsp/add_category.jsp");
					rd.forward(request, response);
				
				
			}
			
			
			
			
			
			
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("Opps's Error is in Admin UserList Servlet......"+e);
			
		}
	}
}
