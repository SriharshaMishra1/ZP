package WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sriharsha\\eclipse-(cucumber)\\selenium_GURU\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@class='picker-first2']/div/following-sibling::button[1]")).click();
	List<WebElement> list=	driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table//td"));
		for(int i=0;i<=list.size();i++)               
		{
		String dates=list.get(i).getText();              
		System.out.println(dates);
		if(dates.equalsIgnoreCase("15"))
		{
			list.get(i).click();
			break;
		}
		}
	}
}
