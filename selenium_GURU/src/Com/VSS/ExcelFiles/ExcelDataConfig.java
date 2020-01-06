package Com.VSS.ExcelFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	/*
	 * its a library for Excel Data to Reuse it
	 * 
	 */
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelDataConfig(String excelpath)
	
	{
		
	try {
		File src=new File(excelpath);
		
		FileInputStream fis=new FileInputStream(src);
		
		wb=new XSSFWorkbook(fis);
		
		
	      } 
	catch (Exception e) 
	{
		System.out.println(e.getMessage());	
	}
	
	}
	
	public String getExcelReadData(int sheetnumber,int rowNumber,int columnNumber)
	{
		sheet1=wb.getSheetAt(sheetnumber);
		String data=sheet1.getRow(rowNumber).getCell(columnNumber).getStringCellValue();
		return data;
		
	}
	


}
