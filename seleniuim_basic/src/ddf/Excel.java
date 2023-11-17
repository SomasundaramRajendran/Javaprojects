package ddf;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel
{
	File a;
	FileInputStream b;
	
    XSSFWorkbook c; 
	XSSFSheet d;
	
	public Excel(String excelpath) throws IOException
	{
		a=new File(excelpath);
		
		b= new FileInputStream(a);
		
		c=new XSSFWorkbook(b);
	}
	
    public String getsheet(String sheetname, int r, int c1)
    {
    	d=c.getSheet(sheetname);
    	String g=d.getRow(r).getCell(c1).getStringCellValue();
    	return g;
    }
	
    public int getrow(String sheetname)
    {
    	d=c.getSheet(sheetname);
    	int i=d.getLastRowNum();
    	i=i+1;
    	return i;
    }
	public int getcolumn(String sheetname)
	{
		d=c.getSheet(sheetname);
		
		short h=d.getRow(0).getLastCellNum();
		
		return h;
	}
	
	
	
	
	
	
	
	
	
	
}
