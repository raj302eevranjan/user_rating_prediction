package com.admin;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.dao.AdminDAO;






public class Excellread 
{
public static boolean readexcell(String path)
{
	
	ArrayList userid=new ArrayList<>();
	ArrayList product_id=new ArrayList<>();
	
	ArrayList rating=new ArrayList<>();
	
	
	boolean flag=false;
	try
    {
		Thread.sleep(1000);
        FileInputStream file = new FileInputStream(new File(path));

        XSSFWorkbook workbook = new XSSFWorkbook(file); //Read the Excel Workbook in a instance object    
        
        //Workbook workbook = new HSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();
        Row row = null;
        while (rowIterator.hasNext()) 
        {
            row = rowIterator.next();
            //For each row, iterate through all the columns
            
            
            //loc_id.add(row.getCell(0));
           DataFormatter d=new DataFormatter();
            userid.add(d.formatCellValue(row.getCell(0)));
            product_id.add(d.formatCellValue(row.getCell(1)));
            rating.add(d.formatCellValue(row.getCell(2)));
            
           
            	if(row.equals(null))
            	{
            		System.out.println("--------------");
            		break;
            	}          
        }
        
        for(int i=0;i<userid.size();i++)
        {
        
        	flag=AdminDAO.add_To_dataset(product_id.get(i).toString(), rating.get(i).toString(), userid.get(i).toString());
        }
       
    } 
    catch (Exception e1) 
    {
        e1.printStackTrace();
    }
	return flag;
}




public static boolean readexcell_mov_list(String path)
{
	
	ArrayList mov_id=new ArrayList<>();
	ArrayList mov_name=new ArrayList<>();
	
	ArrayList year=new ArrayList<>();
	ArrayList cat_code=new ArrayList<>();
	
	
	boolean flag=false;
	try
    {
		Thread.sleep(1000);
        FileInputStream file = new FileInputStream(new File(path));

        XSSFWorkbook workbook = new XSSFWorkbook(file); //Read the Excel Workbook in a instance object    
        
        //Workbook workbook = new HSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();
        Row row = null;
        while (rowIterator.hasNext()) 
        {
            row = rowIterator.next();
            //For each row, iterate through all the columns
            
            
            //loc_id.add(row.getCell(0));
           DataFormatter d=new DataFormatter();
            mov_id.add(d.formatCellValue(row.getCell(0)));
            mov_name.add(d.formatCellValue(row.getCell(1)));
            year.add(d.formatCellValue(row.getCell(2)));
           cat_code.add(d.formatCellValue(row.getCell(3)));
           
            	if(row.equals(null))
            	{
            		System.out.println("--------------");
            		break;
            	}
           
        }
        
       
        
     
        
        
       
            
        
        
        for(int i=0;i<mov_id.size();i++)
        { 
        	Thread.sleep(100);
        	flag=AdminDAO.add_To_mov_list_dataset(mov_id.get(i).toString(), mov_name.get(i).toString(), year.get(i).toString(),cat_code.get(i).toString());
        }
    } 
    catch (Exception e1) 
    {
        e1.printStackTrace();
    }
	return flag;
}

}
