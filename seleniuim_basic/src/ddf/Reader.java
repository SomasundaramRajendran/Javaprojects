package ddf;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reader 
{

	
	public static void main(String[] args) throws IOException 
	{
			
		File a= new File("C:\\Users\\Murugan\\Desktop\\data.xlsx");
		FileInputStream b =new FileInputStream(a);
		
		XSSFWorkbook c = new XSSFWorkbook(b);
		XSSFSheet d = c.getSheet("Sheet1");
		
		String e=d.getRow(4).getCell(0).getStringCellValue();
		System.out.println(e);
		
		
		int f=d.getLastRowNum()+1;
		System.out.println(f);
		

	}

}
