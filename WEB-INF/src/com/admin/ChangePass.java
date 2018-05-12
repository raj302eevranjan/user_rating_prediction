/**
 * 
 */
package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.*;


/**
 * @author bharath

 
 */
public class ChangePass extends HttpServlet 
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException 
	{
		
		try
		{
			
			
				if(request.getParameter("submit").equals("Change_Password"))
				{
				
				String pass=request.getParameter("opass");
				String npass=request.getParameter("npass");
				String cpass=request.getParameter("cpass");
				String admin="admin";
				request.setAttribute("admin", admin);
				System.out.println("pass "+pass);
				System.out.println("npass "+npass);
				System.out.println("admin "+admin);
				
				boolean result=AdminDAO.loginCHK1(admin, pass);
				if(result)
				{
					
					if(npass.equals(cpass))
					{
						
						result=AdminDAO.ChangePass1(admin, cpass);
						if(result)
						{
							
							RequestDispatcher rd=request.getRequestDispatcher("/admin_jsp/changepass.jsp?no=1");
							rd.forward(request, response);
						}
						else
						{
							RequestDispatcher rd=request.getRequestDispatcher("/admin_jsp/changepass.jsp?no=3");
							rd.forward(request, response);
						}
					}
					else
					{
						RequestDispatcher rd=request.getRequestDispatcher("/admin_jsp/changepass.jsp?no=2");
						rd.forward(request, response);
					}
				}
				else
				{
					RequestDispatcher rd=request.getRequestDispatcher("/admin_jsp/changepass.jsp?no=2");
					rd.forward(request, response);
				
				}
				}
				
				
				else if(request.getParameter("submit").equals("change"))
				{
					RequestDispatcher rd=request.getRequestDispatcher("/admin_jsp/changepass.jsp");
					rd.forward(request, response);
				}
		}
		catch(Exception e)
		{
			System.out.println("Opps's Error is in Admin ChangePass Servlet......"+e);		
	}
		
	}
}
