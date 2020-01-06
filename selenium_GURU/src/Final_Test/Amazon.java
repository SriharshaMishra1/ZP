package Final_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sriharsha\\eclipse-(cucumber)\\selenium_GURU\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	WebElement wb=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	wb.sendKeys("iphone");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath("//*[text()='64 GB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Simple Mobile - Apple iPhone 11 (64GB) - White']")).click();
		/*WebDriverWait wait=new WebDriverWait(driver, 10);
		WebElement wc=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Simple Mobile - Apple iPhone 11 (64GB) - White']")));;
		wc.click();*/
		String x="//span[text()='Apple iPhone XR (128GB) - Black']/../../../../../../../div[2]/div/div/div/div/div/a/span[@class='a-price']/span[2]/span[2]";
		driver.findElement(By.xpath(x)).getText();
	}

}
