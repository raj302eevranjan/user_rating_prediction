/**
 * @author
 */
package com.admin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Unintersted_Items extends HttpServlet
{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException
	{
		
		RequestDispatcher rd=null;
	
		try
		{
			
			 if(request.getParameter("submit").equals("Display"))
				{
					
					
						rd=request.getRequestDispatcher("/admin_jsp/unintersting_items.jsp");
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
