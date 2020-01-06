package Com.VSS.ExcelFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/*
 * 
 * @precondition=must be import APACHE POI Library
 * 
 */
public class ReadData_from_Excel {

	public static void main(String[] args) throws Exception {
		
		File src=new File("E:\\ExcelSheet\\TestData(Final).xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheetNumber=wb.getSheetAt(0);
		
		
		
		String data=sheetNumber.getRow(5).getCell(1).getStringCellValue();
		
		System.out.println("Excel data value is ====>>>"+data);
		
		
		String data1=sheetNumber.getRow(5).getCell(0).getStringCellValue();
		
		System.out.println("Excel data value is ====>>>"+data1);
		
		
		
		
		
		
		
		
		
		
		
	}
}
