package selenium_GURU;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class FileUtils {
      
       public String filepath="./data/commonData.properties";
       
       String excelpath="C:\\Users\\sriharsha\\eclipse-(cucumber)\\selenium_GURU\\src\\TestData(Final).xlsx";
       
	public Properties getProperties() throws Exception
	{
		//File src=new File(filepath);
		FileInputStream fis=new FileInputStream(filepath);
		Properties pobj=new Properties();
		pobj.load(fis);
		return pobj;
		
	}

	public String getReadExcel(String sheetName,int row,int column) throws Exception
	{
		//File src=new File(excelpath);
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		String data=sh.getRow(row).getCell(column).getStringCellValue();
			return data;
	}
	
	public void getWriteExcel(String sheetName,int row,int column,String data) throws Exception
	{
		File src=new File(excelpath);
		FileInputStream fis=new FileInputStream(src);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		sh.getRow(row).createCell(column).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(src);
		wb.write(fos);
		wb.close();
	}
	public int getRowcount(String sheetName) throws Throwable {
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		int row=wb.getSheet(sheetName).getLastRowNum();
		return row;
		
	}

	
}

