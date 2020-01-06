package Com.QSPIDER.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFile{

	
	public static void main(String[] args) throws Exception 
	{
		
		File src=new File("./data/Testdata.properties");
		FileInputStream fis=new FileInputStream(src);
		Properties pobj=new Properties();
		pobj.load(fis);
		
		String url=pobj.getProperty("URL");
         System.out.println(url);
		
         String un=pobj.getProperty("username");
         System.out.println(un);
         
         String pwd=pobj.getProperty("password");
         System.out.println(pwd);
	}
}
