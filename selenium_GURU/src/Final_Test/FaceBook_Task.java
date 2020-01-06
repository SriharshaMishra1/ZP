package Final_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook_Task {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sriharsha\\eclipse-(cucumber)\\selenium_GURU\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	/*First Name ,Edit Box should contains Placeholder*/
	String str=driver.findElement(By.xpath("//input[@aria-label='First name']")).getAttribute("aria-label");
	System.out.println(str);
	
	/*check image is displayed or not*/
	boolean b=driver.findElement(By.xpath("//img[contains(@src,'OBaVg52wtTZ.png')]")).isDisplayed();
	System.out.println(b);
    /*Location and size*/
	
}
}
