package com.prediction;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.dao.AdminDAO;
import com.dao.UserDao;

public class Prepare_Predection_Datset
{
	static String davalue="";
	static String pathval="";
	public static void prepareData_Item_ranking(int cat_id,String root)
	{
		
	
		String sb=UserDao.select_m_odrer_item(cat_id);
		
		
		
		boolean flag=Prepare_Predection_Datset.writeintofile(sb,root+"/Item_Hist_rate"); 
		if(flag)
		{
		   System.out.println("====File write successfull=======");	
		}
		else
		{
			 System.out.println("====File write unsuccessfull=======");	
		}
		
	}
	
	
	public static void prepareData_cat_Item_Name(int cat_id,String root)
	{
		
	
		String sb=UserDao.select_List_item_Name(cat_id);
		
	
		
		boolean flag=Prepare_Predection_Datset.writeintofile(sb,root+"/Item_Name");  
		if(flag)
		{
		   System.out.println("====File write successfull=======");	
		}
		else
		{
			 System.out.println("====File write unsuccessfull=======");	
		}
		
	}
	
	
	
	
	public static boolean writeintofile(String content,String name)
	{
		boolean flag=false;
		
		
		
        BufferedWriter writer = null;
        try
        {
            writer = new BufferedWriter( new FileWriter( name+".csv"));
            writer.write(content);
         flag=true;
        }
        catch ( IOException e)
        {
        	flag=false;
        }
        finally
        {
            try
            {
                if ( writer != null)
                writer.close( );
            }
            catch ( IOException e)
            {
            	flag=false;
            }
        }
		
		 
		return flag;
		
	
	}

	
	public static void prepare_csv_data(int cat_id,String root)
	{
		prepareData_Item_ranking(cat_id,root);
		prepareData_cat_Item_Name(cat_id,root);
	}
	
	public static void main(String[] args) {
		
		prepare_csv_data(3,"");
		
	}
}
