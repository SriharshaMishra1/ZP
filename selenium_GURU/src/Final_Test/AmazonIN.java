package Final_Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonIN {

	public static void main(String[] args) throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		// driver.findElement(By.xpath("
		WebElement wb = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		wb.sendKeys("i phone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(6000);

		// unable to click 4GB RAM
		//div[contains(@class,'navigation-checkbox aok-float-left')]/../../../../../../div[6]/ul[8]/li/span/a/div/label/input)[1]
		// i am taking xpath with in a string
		//String x = "//div[contains(@class,'navigation-checkbox aok-float-left')]/../../../../../../div[6]/ul[8]/li/span/a/div[1]/following-sibling::span";
		//String xx="(.//*[@id='filters']/div/span[text()='RAM']/../following-sibling::ul[1]/li[1]/span/a/div/label/input[@type='checkbox'])[1]";
		Actions act1=new Actions(driver);
		List<WebElement>w=driver.findElements(By.xpath(".//*[@id='filters']/div/span[text()='RAM']/../following-sibling::ul[1]/li/span/a"));
		for(int i=0;i<5;i++) {
			System.out.println(w.get(i).getText());
			act1.moveToElement(w.get(i)).build().perform();
			act1.moveToElement(w.get(i)).click().perform();
			break;
		}
		
		
		/*WebElement wc=driver.findElement(By.xpath(xx));
		 Actions act=new Actions(driver);
			
			act.moveToElement(wc).click().perform();*/
		/**/
		
		
		
		// its using explicitly wait

		
		 /* WebDriverWait wait=new WebDriverWait(driver, 20);
		  WebElement wcc=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xx)));
		  Actions act=new Actions(driver);
			
			act.moveToElement(wcc).click().perform();*/
		 
		 

		// its nornam xpath

		// driver.findElement(By.xpath(x)).click();

		// its applying if the element is not seleted then it is click automatically

		/*
		 * List<WebElement> list=driver.findElements(By.xpath(x)); for(WebElement
		 * wd:list) { if(wd.isSelected()) { System.out.println("Already selected"); }
		 * else { wb.click();; } }
		 */

	}
}
