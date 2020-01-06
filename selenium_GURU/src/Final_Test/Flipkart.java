package Final_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
	WebElement wb=	driver.findElement(By.xpath("//input[@type='text']"));
	wb.sendKeys("i phone 10");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	//Howmany Showing Results
	WebElement wc=driver.findElement(By.xpath("//span[contains(text(),'Showing 1 – 24 of 175')]"));
	System.out.println(wc.getText());
	
	
	}
}
