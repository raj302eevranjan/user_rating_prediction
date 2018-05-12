/**
 * 
 */
package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;





import com.dao.DAO;


public class AdminDAO
{
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	private static AdminDAO adminDAO=null;
	private static int[][] res=new int[150000][2];
	private AdminDAO()
	{
		
	}
	public static AdminDAO getInstance()
	{
		if(adminDAO == null)
		{
			adminDAO= new AdminDAO();
		}
		return adminDAO;
	}
	public boolean checkAdmin(String admin,String pass)
	{
		boolean flag=false;
		
		try
		{
			DAO dao=DAO.getInstance();
			
			connection=dao.connector();
			
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_admin where adminid='"+admin+"' and password='"+pass+"'");
			
			while(resultSet.next())
			{
				flag=true;
			}
			System.out.println("Admin Login Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Exception in AdminrDAO-->checkAdmin(String admin,String pass): "+ e);
		}
		return flag;
	}
	
	
	
	
	
	
	

	
	
	
	
	
	public static  boolean add_Category(String cat_name,String cat_srt_name)
	{
		boolean flag=false;
		String sql = "";
		int i=0;
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "insert into m_category(cat_name,cat_shortname) values('"+cat_name+"','"+cat_srt_name+"')";
			
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
	
	
	
	
	
	
/* Get Profile Details (Starts) */
	
	public static ResultSet getProfile(String username)
	{
		String sql="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select * from m_admin where adminid='"+username+"'";
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
	
	/* Get Profile Details (Ends) */
	
	public static boolean loginCHK1(String name, String pass) 
	{
		boolean flag=false;
		try
		{
			DAO database=DAO.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_admin where adminid='"+name+"' and password='"+pass+"'");
			while(resultSet.next())
			{
				flag=true;
			}
			System.out.println("Admin Login Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO.loginCHK()....."+e);
		}
		return flag;
	}
	public boolean editProfile(String [] s) 
	{
		boolean flag=false;
		String sql = "";
		try
		{   
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "update m_admin set name='"+s[1]+"',address='"+s[2]+"',phone='"+s[3]+"',email='"+s[4]+"' where id='"+s[0]+"'";
			System.out.println("******* Edit Profile Info *********\n");
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("Admin Edit Profile Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-editProfile() :");
			e.printStackTrace();
		}
		return flag;
	}
	public boolean chnagePass(int id,String cpass) 
	{
		boolean flag=false;
		String sql = "";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "update m_admin set password='"+cpass+"' where id='"+id+"'";
			System.out.println("******* Change Password Info *********\n");
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("Admin Change Pass Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-chnagePass() : ");
			e.printStackTrace();
		}
		return flag;
	}
	
	
/* Get Server Details (Starts) */
	
	
	
	public static ResultSet getUsers( )
	{
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_user ");
		}
		catch(Exception e)
		{
			System.out.println("Exception in adminDAO-->getUsers(): "+ e);
		}
		return resultSet;
	}
	
	
	

	
	
	public String getReview_toadmin()
	{
		String review="";
		String sql = "";
		try
		{
			StringBuffer sb=new StringBuffer();
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql = "select review_comment from m_review";
			System.out.println("****** Get Department Name By Id *******");
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
			while(resultSet.next())
			{
				review=resultSet.getString(1);
				sb.append(review);
				sb.append("~");
				
			}
			review=sb.toString();
			System.out.println("Review : " + review);
			connection.close();
			statement.close();
			resultSet.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception in adminDAO-->getDepartmentName(int id): ");
			e.printStackTrace();
		}
		return review;
	}
	
	public static boolean ChangePass1(String name,String pwd)
	{
		
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			String sql = "update m_admin set password = '"+pwd+"' where adminid = '"+name+"' ";
			
		 statement.executeUpdate(sql);
			
			
			 
			System.out.println("Password Updated Successfully......");
		}
		catch(Exception e)
		{
			System.out.println("Exception in --> "+ e);
		}
		return true;
		
	}
	
	
	public static ResultSet getReview()
	{
		String sql="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select * from m_data2 ";
			System.out.println("******* Domain Info *********\n");
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getDepartmentDetails(): ");
			e.printStackTrace();
		}
		return resultSet;
	}
	
	public static ResultSet getRequest()
	{
		String sql="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select * from m_prediction where pre_status=pending ";
			System.out.println("******* Domain Info *********\n");
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getDepartmentDetails(): ");
			e.printStackTrace();
		}
		return resultSet;
	}
	
	public static ResultSet getCategory_Details()
	{
		String sql="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select * from m_category";
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
	
	public static ResultSet getCategoryDetails(String cid)
	{
		String sql="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select * from m_category where cat_code='"+cid+"'";
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
   
	
	
	
	
	
	
	
	public static String getCategoryName(String cid)
	{
		String sql="";
		String cat_name="";
		try
		{
			DAO dao=DAO.getInstance();
			connection=dao.connector();
			statement = connection.createStatement();
			sql="select cat_name from m_category where cat_code='"+cid+"'";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
			
			while(resultSet.next())
			{
				cat_name=resultSet.getString(1);
			}
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile(): ");
			e.printStackTrace();
		}
		return cat_name;
	}
   
	
	







public static boolean delete_category_Details(String cid)
{
	String sql="";
	boolean flag=false;
	int i=0;
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		sql="delete from m_category where cat_code='"+cid+"'";
		System.out.println(sql);
		i = statement.executeUpdate(sql);
		
		if(i>0)
		{
			flag=true;
		}
		connection.close();
		statement.close();
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in UserDAO-getProfile(): ");
		e.printStackTrace();
	}
	return flag;
}


public static boolean delete_Item_Details(String cid)
{
	String sql="";
	boolean flag=false;
	int i=0;
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		sql="delete from m_item where item_code='"+cid+"'";
		System.out.println(sql);
		i = statement.executeUpdate(sql);
		
		if(i>0)
		{
			flag=true;
		}
		connection.close();
		statement.close();
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in UserDAO-getProfile(): ");
		e.printStackTrace();
	}
	return flag;
}


public static boolean updatee_CategoryDetails(String cid,String cat_name,String cat_shrt_name)
{
	String sql="";
	boolean flag=false;
	int i=0;
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		sql="update m_category set cat_name='"+cat_name+"',cat_shortname='"+cat_shrt_name+"'  where cat_code='"+cid+"'";  
		System.out.println(sql);
		i = statement.executeUpdate(sql);
		
		if(i>0)
		{
			flag=true;
		}
		
		connection.close();
		statement.close();
		
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in UserDAO-getProfile(): ");
		e.printStackTrace();
	}
	return flag;
}





public static  boolean add_Item(ArrayList list)
{
	boolean flag=false;
	String sql = "";
	int i=0;
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		sql = "insert into m_item(movie_name,cat_code,year,movie_image_name) values('"+list.get(1)+"','"+list.get(0)+"','"+list.get(2)+"','"+list.get(3)+"')";
		
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




public static  boolean Update_Item(ArrayList list)
{
	boolean flag=false;
	String sql = "";
	int i=0;
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		sql = "update  m_item set item_name='"+list.get(1)+"',item_stock='"+list.get(2)+"',item_price='"+list.get(3)+"',item_image_name='"+list.get(6)+"',color='"+list.get(4)+"' where item_code='"+list.get(5)+"'";
		
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







public static ResultSet get_Item_Details()
{
	String sql="";
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		sql="select * from m_item";
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



public static ResultSet get_Item_Details(String id)
{
	String sql="";
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		sql="select * from m_item where movie_id='"+id+"'";
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

public static ResultSet get_selected_category_Item_Details(String id)
{
	String sql="";
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		sql="select * from m_item where cat_code='"+id+"' order by revw_no desc";
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



public static ResultSet get_selected_category_Item_Details_withou_un()
{
	String sql="";
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		sql="select * from m_item  where unitem_status='false' and revw_no=0";
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




public static boolean add_unintresting_Item(String item_name,String item_code,String cat_name, String cat_code,String item_prize)
{
	boolean flag = false;
	int i = 0;
	String sql = "";
	try
	{
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		sql="insert into un_item_list(item_name,item_code,cat_name,cat_code,item_prize)values('"+item_name+"','"+item_code+"','"+cat_name+"','"+cat_code+"','"+item_prize+"')";
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



public static boolean update_Item_UNINT_status(String c_id) 
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
		sql1="update  m_item set unitem_status='true' where movie_id="+c_id+"";
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


public static  boolean add_To_dataset(String item_id,String user_rate,String user_id)
{
	boolean flag=false;
	String sql = "",sql1="";
	int i=0,mid=0,rat=0,rvn=0;
	try
	{
		String op=select_item_code_prize(item_id);
		
		System.out.println("op "+op);
		
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		sql = "insert into m_order(item_id,user_rate,user_id,cat_code) values('"+item_id+"','"+user_rate+"','"+user_id+"','"+op+"')";
		
		System.out.println(sql);
		i = statement.executeUpdate(sql);
		if(i>0)
		{
			flag=true;
			mid=Integer.parseInt(item_id);
			rat=Integer.parseInt(user_rate);
			res[mid][0]+=rat;
			res[mid][1]++;
		}
		System.out.println("Add User Status : "+flag);
		connection.close();
	}
	catch(Exception e)
	{
		System.out.println("Exception in AdminDAO==>addUserDetails() : ");
		e.printStackTrace();
	}
	return flag;
	
}

public static void update_no()
{  int i=0,k=0,l=0;
   double rat=0.0;
   boolean flag=false;
   String sql="",sql1="";
   for(i=0;i<150000;++i)
   {if(res[i][0]!=0)
      {rat=(double)res[i][0]/(double)res[i][1];
       try
       {
  		//String op=select_item_code_prize(item_id);
  		
  		//System.out.println("op "+op);
  		
  		DAO dao=DAO.getInstance();
  		connection=dao.connector();
  		statement = connection.createStatement();
  		//Thread.sleep(1000);
  		sql = "update m_item set rating='"+rat+"' where movie_id="+i+"";
  		sql1= "update m_item set revw_no="+res[i][1]+" where movie_id="+i+"";
  		System.out.println(sql);
  		k = statement.executeUpdate(sql);
  		l = statement.executeUpdate(sql1);
  		if(k>0 && l>0)
  		{
  			flag=true;
  			
  		}
  		System.out.println("Final Status : "+flag);
  		connection.close();
  	   }
       catch(Exception e)
   	   {
   		System.out.println("Exception in AdminDAO==>addUserDetails() : ");
   		e.printStackTrace();
   	   }
      }
   }
}


public static  boolean add_To_mov_list_dataset(String mov_id,String mov_name,String year,String cat_code )
{
	boolean flag=false;
	String sql = "";
	int i=0;
	try
	{
		
		
	
		
		DAO dao=DAO.getInstance();
		connection=dao.connector();
		statement = connection.createStatement();
		//Thread.sleep(1000);
		sql = "insert into m_item(movie_id,movie_name,cat_code,year) values('"+mov_id+"','"+mov_name+"','"+cat_code+"','"+year+"')";
		
		System.out.println(sql);
		i = statement.executeUpdate(sql);
		if(i>0)
		{
			flag=true;
		}
		System.out.println("Add User Status : "+flag);
		connection.close();
	}
	catch(Exception e)
	{
		System.out.println("Exception in AdminDAO==>addUserDetails() : ");
		e.printStackTrace();
	}
	return flag;
	
}

public static String select_item_code_prize(String item_id)
{
	boolean flag=false;
	String op="";
	try
	{
		DAO dao=DAO.getInstance();
		
		connection=dao.connector();
		
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select cat_code from m_item where movie_id='"+item_id+"'" );
		System.out.println("select cat_code from m_item where item_code='"+item_id+"'" );
		while(resultSet.next())
		{
			op=resultSet.getString(1);
		}
		System.out.println("Admin Login Status : "+flag);
		connection.close();
	}
	catch(Exception e)
	{
		System.out.println("Exception in AdminrDAO-->checkAdmin(String admin,String pass): "+ e);
	}
	return op;
}
}
