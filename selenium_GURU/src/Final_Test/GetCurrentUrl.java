package Final_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sriharsha\\eclipse-(cucumber)\\selenium_GURU\\geckodriver.exe");
		driver.navigate().to("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Google"))
		{
			System.out.println("verified");
		}
		else
		{
			System.out.println("fail");
		}
	System.out.println(driver.getCurrentUrl());
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.get("https://www.yahoo.com");
	driver.navigate().back();
	Thread.sleep(2000);
	driver.close();
	}
}
