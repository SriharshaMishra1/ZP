package Com.QSPIDER.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium_GURU.FileUtils;

public class DataIntoPropertiesFile {

	public static void main(String[] args) throws Exception {
		                                                        
		FileUtils flib=new FileUtils();
		Properties pobj=flib.getProperties();
		String path=pobj.getProperty("ChromeDriverPath");
		String url=pobj.getProperty("url");
		
		String un=pobj.getProperty("username");
		String pwd=pobj.getProperty("password");
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.name("user_name")).sendKeys(un);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		
		
		
		
		
		
	}
}
