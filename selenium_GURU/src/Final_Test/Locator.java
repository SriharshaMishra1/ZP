package Final_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator {
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8888/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		WebElement wb=driver.findElement(By.xpath("//*[@type='password']"));
		wb.sendKeys("tiger");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
		
		
	}

}
