package Com.VSS.ExcelFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllRowData {

	public static void main(String[] args) throws Throwable {
		
		File src=new File("./src/TestData(Final).xlsx");
		FileInputStream fis=new FileInputStream(src);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		int rowCount=sh.getLastRowNum();
		System.out.println(rowCount);
		
		for(int i=0;i<=rowCount;i++)
		{
			String col0=sh.getRow(i).getCell(0).getStringCellValue();
			
			String col1=sh.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(col0+"\t"+col1);
			
		}
		
	}
	
}

