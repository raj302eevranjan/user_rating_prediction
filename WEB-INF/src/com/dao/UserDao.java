/**
 * 
 */
package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author bharath
 *
 */
public class UserDao 
{
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	private static UserDao userDAO=null;
	public UserDao()
	{
		
	}
	public static UserDao getInstance()
	{
		if(userDAO == null)
		{
			userDAO= new UserDao();
		}
		return userDAO;
	}
	public int checkUser(String uname,String pass)
	{
		int  id=0;
		
		try
		{
			DAO dao=DAO.getInstance();
			
			connection=dao.connector();
			
			statement = connection.createStatement();
			
			
	
			resultSet = statement.executeQuery("select * from m_user where u_name='"+uname+"' and u_pass='"+pass+"'");
			
		
			while(resultSet.next())
			{
				id=resultSet.getInt(1);
			}
			System.out.println("Admin Login Status : "+id);
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminrDAO-->checkAdmin(String admin,String pass): "+ e);
		}
		return id;
	}
	
	
	public  boolean ChangePass1(String name,String pwd)
	{
		
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			String sql = "update m_user set u_pass = '"+pwd+"' where u_name = '"+name+"' ";
			
		 statement.executeUpdate(sql);
			
			
			 
			System.out.println("Password Updated Successfully......");
		}
		catch(Exception e)
		{
			System.out.println("Exception in --> "+ e);
		}
		return true;
		
	}
	
	public static boolean register(String title,String uname,String pass, String email,String dob) 
	{
		boolean flag = false;
		int i = 0;
		String sql = "";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="insert into m_user(title,u_name,u_mail,u_pass,dob)values('"+title+"','"+uname+"','"+email+"','"+pass+"','"+dob+"')";
			i = statement.executeUpdate(sql);
			
			if(i>0)
			{
				flag = true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in register ");
			e.printStackTrace();
		}
		return flag;
	}
	
	public static  ResultSet slect_User()
	{
		boolean flag=false;
		
		try
		{
			DAO dao=DAO.getInstance();
			
			connection=dao.connector();
			
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user");
			
			
		
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminrDAO-->checkAdmin(String admin,String pass): "+ e);
		}
		return resultSet;
	}
	
	
	
	
	
	
	
	
	
	public static  boolean add_To_Cart(ArrayList list)
	{
		boolean flag=false;
		String sql = "";
		int i=0;
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "insert into m_cart(user_id,mov_name,mov_code,cat_code) values('"+list.get(0)+"','"+list.get(1)+"','"+list.get(2)+"','"+list.get(3)+"')";
			
			System.out.println(sql);
			i = statement.executeUpdate(sql);
			if(i>0)
			{
				flag=true;
			}
			System.out.println("Add User Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminDAO==>addUserDetails() : ");
			e.printStackTrace();
		}
		return flag;
		
	}
	
	
	
	public static ResultSet get_Cart_Details()
	{
		String sql="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select * from m_cart where del_status='pending'";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return resultSet;
	}
	
	
	public static boolean update_User_cart_status(String c_id) 
	{
		String sql="";
		String sql1="";
		boolean flag=false;
		try
		{
			int freqno=0;
			DAO dao=DAO.getInstance();
			
			
			connection=dao.connector();
			statement = connection.createStatement();
			sql1="update  m_cart set del_status='delivered' where crt_id="+c_id+"";
			int i=statement.executeUpdate(sql1);	
			
			if(i>0)
			{
				flag=true;
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return flag;	
		
	}
	
	
	
	public static boolean delete_cart(String c_id) 
	{
		String sql="";
		String sql1="";
		boolean flag=false;
		try
		{
			int freqno=0;
			DAO dao=DAO.getInstance();
			
			
			connection=dao.connector();
			statement = connection.createStatement();
			sql1="delete  from m_cart  where crt_id="+c_id+"";
			int i=statement.executeUpdate(sql1);	
			
			if(i>0)
			{
				flag=true;
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return flag;	
		
	}
	
	
	public static  boolean add_To_morder(String item_id,String user_rate,String user_id,String cat_id)
	{
		boolean flag=false;
		String sql = "";
		int i=0;
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "insert into m_order(item_id,user_rate,user_id,cat_code) values('"+item_id+"','"+user_rate+"','"+user_id+"','"+cat_id+"')";
			
			System.out.println(sql);
			i = statement.executeUpdate(sql);
			if(i>0)
			{
				flag=true;
			}
			System.out.println("Add User Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminDAO==>addUserDetails() : ");
			e.printStackTrace();
		}
		return flag;
		
	}
	
	
	public static boolean update_item_review_no(String item_id,String rating) 
	{
		String sql="";
		String sql1="";
		boolean flag=false;
		try
		{
			int freqno=0;
			DAO dao=DAO.getInstance();
			
			
			connection=dao.connector();
			statement = connection.createStatement();
			sql1="update  m_item set revw_no=revw_no+1,rating='"+rating+"' where movie_id="+item_id+"";
			int i=statement.executeUpdate(sql1);	
			
			if(i>0)
			{
				flag=true;
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return flag;	
		
	}
	
	
	
	public static ArrayList<Integer> select_UNINT_Item_Details(String id,String prize,String item)
	{
		String sql="";
		ArrayList<Integer> un_item=new ArrayList<Integer>();
		double high=0;
		double les=0;
		if(Double.parseDouble(prize)==5)
		{
		 high=Double.parseDouble(prize)+0;
		}
		if(Double.parseDouble(prize)==5)
		{
		 les=Double.parseDouble(prize)-1;
		}
		 if(Double.parseDouble(prize)<4)
		{
			high=Double.parseDouble(prize)+0.5;
		}
		 if(Double.parseDouble(prize)<4)
			{
				les=Double.parseDouble(prize)-0.5;
			}
		
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select item_code from un_item_list where cat_code='"+id+"' and item_prize BETWEEN "+les+" AND "+high+" and item_code!='"+item+"' limit 3";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
			while(resultSet.next())
			{
				un_item.add(resultSet.getInt(1));
			}
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return un_item;
	}

	
	
	public static String select_user_Recent_item(String userid)
	{
		String sql="";
		String recitem="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select cat_code,prize from m_order where user_id='"+userid+"' order by order_id  DESC limit 1";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
			while(resultSet.next())
			{
				recitem=resultSet.getString(1);
			}
			
			System.out.println("rec "+recitem);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return recitem;
	}

	
	public static String select_m_odrer_item(int catid)
	{
		String sql="";
		StringBuilder sb=new StringBuilder();
		
		String recitem="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select * from m_order where cat_code='"+catid+"' order by user_id";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
			while(resultSet.next())
			{
				sb.append(resultSet.getString(5));
				sb.append(",");
				sb.append(resultSet.getString(2));
				sb.append(",");
				sb.append(resultSet.getString(3));
				 sb.append(System.lineSeparator());
			}
			
			System.out.println("rec "+recitem);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	public static String select_List_item_Name(int catid)
	{
		String sql="";
		StringBuilder sb=new StringBuilder();
		
		String recitem="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select * from m_item where cat_code='"+catid+"'";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
			while(resultSet.next())
			{
				sb.append(resultSet.getString(1));
				sb.append(",");
				sb.append("|");
				sb.append(resultSet.getString(2));
				 sb.append(System.lineSeparator());
			}
			
			System.out.println("rec "+recitem);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	
	
	
	public static String select_Avg_item_rate(String item_id)
	{
		String sql="";
		String avg_rate="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select avg(user_rate) from m_order where item_id='"+item_id+"'";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
			while(resultSet.next())
			{
				avg_rate=resultSet.getString(1);
			}
			
			System.out.println("rec "+avg_rate);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return avg_rate;
	}
	
}
