package Final_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sriharsha\\eclipse-(cucumber)\\selenium_GURU\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("https://my.naukri.com/");	
		WebElement wb = driver.findElement(By.xpath("//div[text()='Jobs']"));
		Actions act=new Actions(driver);
		act.moveToElement(wb);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register Now")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();	//driver.get("https://my.naukri.com/account/createaccount?othersrcp=16201&err=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='expCont']/button[text()='I am a Professional']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='uploadCV']")).sendKeys("C:\\Users\\sriharsha\\Desktop\\Sriharsha Mishra_3 years_exp.manual_automation_testing.docx");;
		
		
		
	}
}
