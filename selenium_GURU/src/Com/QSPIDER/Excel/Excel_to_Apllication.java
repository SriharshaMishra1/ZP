package Com.QSPIDER.Excel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.VSS.ExcelFiles.ReadAllRowData;
import selenium_GURU.FileUtils;

public class Excel_to_Apllication{
	@DataProvider
	public Object[][] getdata(int rowCount) throws Throwable{
	FileUtils flib=new FileUtils();
	flib.getRowcount("sheet1");
	Object[][] objArr=new Object[rowCount][2];
	 for(int i=0;i<rowCount;i++)
	 {
		 objArr[i][0]=flib.getReadExcel("Sheet1", i, 0);
		 objArr[i][1]=flib.getReadExcel("Sheet1", i, 0);
	 }
	return objArr;
	
	}
}
