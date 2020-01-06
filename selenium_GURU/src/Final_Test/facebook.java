package Final_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sriharsha\\eclipse-(cucumber)\\selenium_GURU\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		String wb=driver.findElement(By.name("firstname")).getAttribute("aria-label");
		System.out.println(wb);
		//location and size:
		
		WebElement wb1=driver.findElement(By.xpath("//img[contains(@src,'OBaVg52wtTZ.png')]"));
		boolean imj=wb1.isDisplayed();;
		System.out.println(imj);
	Point loc=wb1.getLocation();
	System.out.println(loc.getX());
	System.out.println(loc.getY());
	
	Dimension size=wb1.getSize();
	System.out.println(size.width);
	
	}
}
