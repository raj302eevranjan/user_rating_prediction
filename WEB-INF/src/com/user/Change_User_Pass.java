/**
 * 
 */
package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.SeekableByteChannel;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.*;


/**
 * @author bharath

 
 */
public class Change_User_Pass extends HttpServlet 
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException 
	{
		
		try
		{
			HttpSession ses=request.getSession();
			
				if(request.getParameter("submit").equals("Change_Password"))
				{
					String user_id=ses.getAttribute("name").toString();
				String pass=request.getParameter("opass");
				String npass=request.getParameter("npass");
				String cpass=request.getParameter("cpass");
			
			
				System.out.println("pass "+pass);
				System.out.println("npass "+npass);
				System.out.println("cpass "+cpass);
				UserDao udao=UserDao.getInstance();
				int result=udao.checkUser(user_id, pass);
				
				if(result>0)
				{
					
					if(npass.equals(cpass))
					{
						
					boolean	flg=udao.ChangePass1(user_id, cpass);
						if(flg)
						{
							
							RequestDispatcher rd=request.getRequestDispatcher("/user_jsp/changepass.jsp?no=1");
							rd.forward(request, response);
						}
						else
						{
							RequestDispatcher rd=request.getRequestDispatcher("/user_jsp/changepass.jsp?no=3");
							rd.forward(request, response);
						}
					}
					else
					{
						RequestDispatcher rd=request.getRequestDispatcher("/user_jsp/changepass.jsp?no=2");
						rd.forward(request, response);
					}
				}
				else
				{
					RequestDispatcher rd=request.getRequestDispatcher("/user_jsp/changepass.jsp?no=2");
					rd.forward(request, response);
				
				}
				}
				
				
				else if(request.getParameter("submit").equals("change"))
				{
					RequestDispatcher rd=request.getRequestDispatcher("/user_jsp/changepass.jsp");
					rd.forward(request, response);
				}
		}
		catch(Exception e)
		{
			System.out.println("Opps's Error is in Admin ChangePass Servlet......"+e);		
	}
		
	}
}
