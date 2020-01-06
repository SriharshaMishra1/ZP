package WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public final class LatestCalender {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sriharsha\\eclipse-(cucumber)\\selenium_GURU\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      
		
		/*login to Flight*/	
		driver.get("https://www.makemytrip.com/flights/");
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		
		int monthcount=0;
		while(monthcount<=12)
		{
			
			try {
				String date="//div[@class='DayPicker-Months']/div[2]/div[3]/div[3]/div[2][@aria-label='Mon Oct 12 2020']/div[1]/p";
				driver.findElement(By.xpath(date)).click();
				break;
			}
			catch(Throwable t)
			{
				String next="//span[@aria-label='Next Month']";
				
				driver.findElement(By.xpath(next)).click();
				
				monthcount++;
			}
		}
		
		
	}

}
