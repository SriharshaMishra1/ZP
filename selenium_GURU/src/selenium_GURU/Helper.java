package selenium_GURU;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Helper {

	public static WebDriver driver;
	public static FileUtils flib=new FileUtils();
   
	@BeforeClass
	public void BC() throws Throwable
	{
		System.out.println("====Lunch Browser=====");
		Properties pobj=flib.getProperties();
		String browsername=pobj.getProperty("browser");
		String chromepath=pobj.getProperty("ChromeDriverPath");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					chromepath);
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "./IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void BM() throws Exception
	{
		System.out.println("====login====");
		Properties pobj = flib.getProperties();
		String url=pobj.getProperty("url");
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(pobj.getProperty("username"));
		driver.findElement(By.name("user_password")).sendKeys(pobj.getProperty("password"));
		Thread.sleep(4000);
		driver.findElement(By.id("submitButton")).click();
	}
	@AfterMethod
	public void AM()
	{
		System.out.println("====logout====");
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
	}
	@AfterClass
	public void AC()
	{
		System.out.println("===Browser closed====");
		driver.close();
	}
}
