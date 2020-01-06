package Com.QSPIDER.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel_deepak {

	public static void main(String[] args) throws Exception {
		
		File src=new File("E:\\ExcelSheet\\TestData(Final).xlsx");
		FileInputStream fis=new FileInputStream(src);
		
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheetAt(0);
		String data=sh.getRow(7).getCell(0).getStringCellValue();
		System.out.println(data);
	}
}
