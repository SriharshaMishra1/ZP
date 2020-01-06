package Final_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewCalender {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sriharsha\\eclipse-(cucumber)\\selenium_GURU\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		
		/*click On depart Date*/
	driver.findElement(By.xpath("//div[@class='picker-first2']/div/following-sibling::button[1]")).click();
		int monthcount=0;
		while(monthcount<12)
		{
			try {
				/*select Date*/
				String Date="//div[@id='ui-datepicker-div']//div[2]/table/tbody/tr[3]/td[@data-month='2']/a[text()='15']";
				
				driver.findElement(By.xpath(Date)).click();
				break;
			}
			catch(Throwable t)
			{
				/*Click On Next Button*/
				
				String Next="//div[@id='ui-datepicker-div']/div[2]/div[1]/a[contains(@class,'ui-datepicker') and @title='Next']";
				System.out.println("handled");
				driver.findElement(By.xpath(Next)).click();
				monthcount++;
			}
		}
		driver.quit();
}
}