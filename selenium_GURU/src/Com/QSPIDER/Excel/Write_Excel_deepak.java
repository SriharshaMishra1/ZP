package Com.QSPIDER.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_Excel_deepak {

	
	public static void main(String[] args) throws Exception {
		
		File src=new File("E:\\ExcelSheet\\TestData(Final).xlsx");
		FileInputStream fis=new FileInputStream(src);
		
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheetAt(0);
		sh.getRow(0).createCell(2).setCellValue("Sriharsha Mishra");
		FileOutputStream fos=new FileOutputStream(src);
		wb.write(fos);
		wb.close();
	}
}
