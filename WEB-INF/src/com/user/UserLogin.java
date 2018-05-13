package com.user;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.dao.AdminDAO;
import com.dao.UserDao;


public class UserLogin extends HttpServlet 
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		
		try
		{
			HttpSession ses=request.getSession();
			
			 UserDao udao=UserDao.getInstance();
			 RequestDispatcher rd=null;
			String submit=request.getParameter("submit");
			
			System.out.println(" submit"+submit);
			
			
			
			if(submit.equals("Register"))
			{
				
				String title=request.getParameter("Title");
				String name=request.getParameter("user_name");
				String pass=request.getParameter("user_password");
				String email=request.getParameter("user_email");
				String DOB=request.getParameter("DOB");
				
				boolean result=udao.register( title,name, pass, email,DOB);
				
				if(result)
				{
					
					rd=request.getRequestDispatcher("index.html?no=2");
			    	rd.forward(request, response);
				}
				
				
			}
			
			
			else if(submit.equals("SignIn"))
			{
			
			
			String username=request.getParameter("userid");
			String user_pass=request.getParameter("password");
          
			
			int result=udao.checkUser(username, user_pass);
			System.out.println(result);
			int cat_code=udao.get_most_rated_cat_code(result);

			System.out.println("the most rated category code id : "+cat_code);
		
			if(result>0)
			{
				ses.setAttribute("name", result);
				
				rd=request.getRequestDispatcher("/user_jsp/show_all_movies.jsp?cat_code="+cat_code+""); 
				rd.forward(request, response);
			}
			else
			{
				response.sendRedirect("index.html?no=2");
			}
		}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Opps's Error is in AdminLogin Servlet......"+e);
			
		}
		
		
	}
}
