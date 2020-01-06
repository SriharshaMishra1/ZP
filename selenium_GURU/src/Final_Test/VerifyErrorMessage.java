package Final_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class VerifyErrorMessage {

	WebDriver driver;
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @id='identifierId']")).sendKeys("sri@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(3000);
	WebElement wb=	driver.findElement(By.xpath("//div[@class='o6cuMc']"));
	//System.out.println(expresult);
	String actual=wb.getText();
	System.out.println(actual);
	String expresult="Couldn't find your Google Account";
	
	if(expresult.equals(actual))
	{
		System.out.println("error msg displayed");
	}
	
	else {
		System.out.println("error msg Notdisplayed");
	}
	
	//step#2
	Assert.assertEquals(actual, expresult);
	System.out.println("pass 2d");
	//step#3
	Assert.assertTrue(actual.contains("Couldn't find"));
	System.out.println("pass 3rd");
	
	
	String actcolor=wb.getCssValue("color");
	String expcolor="rgba(217, 48, 37, 1)";
	System.out.println(actcolor);
	if(expcolor.equals(actcolor))
	{
		System.out.println("color verifid");
	}
	else
	{
		System.out.println("color notverifid");
	}
	}
}
