package Final_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Link {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon");
		driver.findElement(By.linkText("Sell")).click();
		Thread.sleep(2000);
		//driver.navigate().back();
		//Partial LinkText
		driver.findElement(By.partialLinkText("Cards")).click();;
		List<WebElement> linkname=driver.findElements(By.tagName("a"));
		System.out.println(linkname.size());;
		for(int i=0;i<linkname.size();i++)
		{
			System.out.println(i+" linkname is "+linkname.get(i).getText());		
		}
	}
}
