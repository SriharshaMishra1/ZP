package Com.QSPIDER.Excel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import selenium_GURU.FileUtils;

public class excel_data {
	@Test(dataProvider="getData")
	public void addTocart(String Pname,String qty)
	{
		System.out.println("login==>>"+Pname+"==>>"+qty);
	}
	
		@DataProvider
		public Object[][] getdata() throws Throwable{
		FileUtils flib=new FileUtils();
		int rowCount=flib.getRowcount("sheet1");
		Object[][] objArr=new Object[rowCount][2];
		 for(int i=0;i<rowCount;i++)
		 {
			objArr[i][0]=flib.getReadExcel("Sheet2", i, 0); ;
			 objArr[i][1]=flib.getReadExcel("Sheet2", i, 1);
		 }
		return objArr;
		
		
	}
	
}
