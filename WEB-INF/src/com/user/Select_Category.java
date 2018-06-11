package com.user;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.prediction.Prepare_Predection_Datset;

public class Select_Category extends HttpServlet 
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		RequestDispatcher rd=null;
		HttpSession ses=request.getSession();
		 if(request.getParameter("submit").equals("Display"))
		{
			
			
				rd=request.getRequestDispatcher("/user_jsp/select_category.jsp");
				try {
					rd.forward(request, response);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		}
		 else if(request.getParameter("submit").equals("Show_Products"))
			{
				
				String cat_code=request.getParameter("cat_code");
					rd=request.getRequestDispatcher("/user_jsp/view_category.jsp?cat_code="+cat_code+"");
					try {
						rd.forward(request, response);
					} catch (ServletException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		 
		 
		 
		 else if(request.getParameter("submit").equals("product_details"))
			{
				
				String item_code=request.getParameter("item_code");
				String cat_id=request.getParameter("cat_code");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String root=request.getRealPath("dataset");
				Prepare_Predection_Datset.prepare_csv_data(Integer.parseInt(cat_id),root);
				System.out.println("item_code "+item_code);
					rd=request.getRequestDispatcher("/user_jsp/product_details.jsp?item_code="+item_code+"&cat_id="+cat_id+"");
					try {
						rd.forward(request, response);
					} catch (ServletException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		 
		 
		 else if(request.getParameter("submit").equals("Add_Cart"))
			{
				String user_id=ses.getAttribute("name").toString();
				String item_code=request.getParameter("item_code");
				String item_name=request.getParameter("item_name");
				String item_prize=request.getParameter("prize");
				/*String qty=request.getParameter("Qty");*/
				String cat_code=request.getParameter("cat_code");
				
				//double total_cost=Double.parseDouble(item_prize)*Double.parseDouble(qty);
				ArrayList list=new ArrayList<>();
				list.add(user_id);
				list.add(item_name);
				list.add(item_code);
				list.add(cat_code);
				//list.add(item_prize);
				//list.add(qty);
				//list.add(total_cost);
				System.out.println("list  "+list);
				
			boolean	flag=UserDao.add_To_Cart(list);
				
					rd=request.getRequestDispatcher("/user_jsp/view_cart.jsp");
					try {
						rd.forward(request, response);
					} catch (ServletException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				
			}
		 
		 
		 
		 
		 
		 else if(request.getParameter("submit").equals("ViewCart"))
			{
				
					rd=request.getRequestDispatcher("/user_jsp/view_cart.jsp");
					try {
						rd.forward(request, response);
					} catch (ServletException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				
			}
		 
		 
		 else if(request.getParameter("submit").equals("Buy"))
			{
			 String user_id=ses.getAttribute("name").toString();
				String cart_id=request.getParameter("cart_id");
				
				String cat_id=request.getParameter("cat_id");
				
				String item_id=request.getParameter("item_id");
				
				String user_rate=request.getParameter("user_rate");
				//String item_prize=request.getParameter("item_prize");
				
				UserDao.update_User_cart_status(cart_id);
				
				
				UserDao.add_To_morder(item_id, user_rate,user_id,cat_id);
				
				String avg=UserDao.select_Avg_item_rate(item_id);
				
				UserDao.update_item_review_no(item_id,avg);
				
					rd=request.getRequestDispatcher("/user_jsp/view_cart.jsp?no=1");
					try {
						rd.forward(request, response);
					} catch (ServletException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			}
		 
		 else if(request.getParameter("submit").equals("Remove"))
			{
				String cart_id=request.getParameter("cart_id");
				
				UserDao.delete_cart(cart_id);
					rd=request.getRequestDispatcher("/user_jsp/view_cart.jsp?no=2");
					try {
						rd.forward(request, response);
					} catch (ServletException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				
			}
	
	}
}
