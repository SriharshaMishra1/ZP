package WebTable;
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

import selenium_GURU.FileUtils;
public class Helper {
	public static WebDriver driver;
	public FileUtils flib = new FileUtils();

	@BeforeClass
	public void Bc() throws Throwable {
		System.out.println("=====lunch Browser======");
		Properties pobj = flib.getProperties();
		String browsername = pobj.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", " ./chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		else if (browsername.equals("ie")) {
			System.setProperty("webdriver.iedriver", "./IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void Bm() throws Throwable {
		System.out.println("====login====");
		Properties pobj = flib.getProperties();
		driver.get(pobj.getProperty("url"));
		driver.findElement(By.name("user_name")).sendKeys(pobj.getProperty("username"));
		driver.findElement(By.name("user_password")).sendKeys(pobj.getProperty("password"));
		Thread.sleep(4000);
		driver.findElement(By.id("submitButton")).click();
	}

	@AfterMethod
	public void Am() {
		System.out.println("======logout======");
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
	}

	@AfterClass
	public void Ac() {
		System.out.println("====closeBrowser======");
		driver.close();
	}

}


