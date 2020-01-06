package Final_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Class {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost:8888/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	WebElement wb=driver.findElement(By.xpath("//*[@type='password']"));
	wb.sendKeys("tiger");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Contacts")).click();
	WebElement wb1=driver.findElement(By.xpath("//select[@name='search_field']"));
	Thread.sleep(2000);
	Select sel =new Select(wb1);
	sel.selectByVisibleText("First Name");
	Thread.sleep(2000);
	sel.selectByIndex(4);
	Thread.sleep(2000);
	sel.selectByValue("lastname");
	
	
	List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox' and @id='selectCurrentPageRec']"));
	Thread.sleep(2000);
	boolean multiple=sel.isMultiple();
	if(multiple)
	{
		for(int i=0;i<list.size();i++)
		{
			sel.selectByIndex(i);
		}
	}
	
	
}
}
