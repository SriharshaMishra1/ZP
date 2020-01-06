package selenium_GURU;

import Com.VSS.ExcelFiles.ExcelDataConfig;

public class Call_Excell_Library {

	
	public static void main(String[] args) throws Exception {
		
		/*ExcelDataConfig excel=new ExcelDataConfig("E:\\\\ExcelSheet\\\\TestData(Final).xlsx");
		
		System.out.println(excel.getExcelReadData(0, 9, 0));*/
		
		
		FileUtils flib=new FileUtils();
		System.out.println(flib.getReadExcel("Sheet1", 10, 0));;
		
		//flib.getWriteExcel("Sheet1", 6, 0, "Baba");
	}
}
