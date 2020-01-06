package Com.QSPIDER.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NumericValue_ExcelSheet {

	public static void main(String[] args) throws Exception {
		File src=new File("E:\\ExcelSheet\\TestData(Final).xlsx");
		FileInputStream fis=new FileInputStream(src);
		
		Workbook wb=WorkbookFactory.create(fis);
       int sh=(int)wb.getSheetAt(0).getRow(13).getCell(0).getNumericCellValue();
		/*int data=(int) sh.getRow(13).getCell(0).getNumericCellValue();
		System.out.println(data);*/
	}
}
