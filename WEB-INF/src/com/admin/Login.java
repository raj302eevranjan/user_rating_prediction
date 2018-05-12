package com.admin;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.dao.AdminDAO;


public class Login extends HttpServlet 
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		
		try
		{
			HttpSession ses=request.getSession();
			String name=request.getParameter("adminid");
			String pass=request.getParameter("password");
			
			System.out.println("user name "+name);
			
           AdminDAO adminDAO=AdminDAO.getInstance();
			
			boolean result=adminDAO.checkAdmin(name, pass);
		
			if(result)
			{
				ses.setAttribute("name", name);
				
				RequestDispatcher rd=request.getRequestDispatcher("/admin_jsp/admin_home.jsp");
				rd.forward(request, response);
			}
			else
				response.sendRedirect("index.html");
		}
		catch(Exception e)
		{
			System.out.println("Opps's Error is in AdminLogin Servlet......"+e);
			
		}
	}
}
