package Com.VSS.ExcelFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_All_ExcelData {

	public static void main(String[] args) throws Exception {
		
		//store the file
		File src=new File("E:\\ExcelSheet\\TestData(Final).xlsx");
		//load the file   
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
	
		   XSSFSheet sheetName=wb.getSheet("sheet1");
		//print all the data from excel sheet
		
	int lastRow=sheetName.getLastRowNum();
		System.out.println(lastRow);
		
		
		
		for(int i=0;i<=lastRow;i++)
		{
			
		String alldata=	sheetName.getRow(i).getCell(0).getStringCellValue();
			System.out.println(alldata);
			
			
			String alldata1=	sheetName.getRow(i).getCell(1).getStringCellValue();
			System.out.println(alldata+"\t"+alldata1);
		}
		
		
		wb.close();
			
		
		
	}
}
