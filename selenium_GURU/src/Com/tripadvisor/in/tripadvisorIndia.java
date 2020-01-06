package Com.tripadvisor.in;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tripadvisorIndia {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*Maximize the window */
		driver.manage().window().maximize();
		/*webElement Time*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*Enter url*/
		driver.get("https://www.tripadvisor.in/");
		
		Thread.sleep(2000);
		/*Click on search*/
		try {
		//type2
			System.out.println("its coming");
		driver.findElement(By.xpath("//div[@title='Search']/span[1]")).click();
		}
		catch(Throwable t)
		{
			
		}
		/*Search ClubMahindra*/
		String TourPlaceName="club mahindra";
		/*Press enter*/ 
		driver.findElement(By.xpath("//input[@id='mainSearch' and (@type='search')]")).sendKeys(TourPlaceName,Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.xpath(""));
		/*Click On Club Mahindra Link*/
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Club Mahindra Madikeri, Coorg']")).click();
		/*Thread.sleep(2000);
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		Thread.sleep(3000);
				
		WebElement element=driver.findElement(By.xpath("//a[text()='Write a review']"));
		element.click();
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView(true);",element);
				Thread.sleep(3000);
				driver.close();
				driver.switchTo().window(parent);
				Thread.sleep(3000);
	     int count=0;
	     String win = driver.getWindowHandle();
	     ArrayList<String> allWindows = new ArrayList<String> (driver.getWindowHandles());
	     driver.switchTo().window(allWindows.get(1));
	        Thread.sleep(6000);
   driver.findElement(By.xpath("//div[@id='REVIEW_TITLE']/input[@name='ReviewTitle']")).sendKeys("its good");*/
		
		//Brook Stone Villas 
		Thread.sleep(3000);
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
	WebElement element=	driver.findElement(By.xpath("(//div[@class='cross-sells-items-large-Detail__detail--MMR_o'])[1]/div[1][text()='Brook Stone Villas By Rai Hospitality & Resorts']"));
	element.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parent);
		
		
		//Hotel Coorg International
		Thread.sleep(3000);
		 int count1=0;
	     String win1 = driver.getWindowHandle();
	     ArrayList<String> allWindows1 = new ArrayList<String> (driver.getWindowHandles());
	     driver.switchTo().window(allWindows1.get(1));
	        Thread.sleep(6000);
	        WebElement element1=driver.findElement(By.xpath("//div[@class='cross-sells-items-large-Detail__title--29XIN'][contains(text(),'Hotel Coorg International')]"));
	    	element1.click();
	    JavascriptExecutor js1=(JavascriptExecutor)driver;
	    js1.executeScript("arguments[0].scrollIntoView(true);",element1);
	    
	  
		//1st parent bana
	    //then window ku handle kara
	    Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parent);//parent hela
		ArrayList<String> allWindows2 = new ArrayList<String> (driver.getWindowHandles());
	     driver.switchTo().window(allWindows2.get(1));//window handle hela
	        Thread.sleep(6000);
		//scroll down
	    //click on hotel vasathi
	    WebElement element2=driver.findElement(By.xpath("//div[contains(text(),'Vasathi')]"));
	    element2.click();
	    JavascriptExecutor js2=(JavascriptExecutor)driver;
	    js2.executeScript("arguments[0].scrollIntoView(true);",element2);
	        
		/*String exp="CLUB MAHINDRA MADIKERI, COORG - Resort Reviews, Photos, Rate Comparison - TripAdvisor";
	    String title=	driver.getTitle();
	   System.out.println(title);*/
		/*List<String> list=new ArrayList<String>(set);
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='REVIEW_TITLE']/input[@name='ReviewTitle']")).sendKeys("its good");;*/
		
	    Thread.sleep(6000);
        WebElement element3=driver.findElement(By.xpath("//a[@class='ui_button primary']"));
    	element3.click();
    JavascriptExecutor js3=(JavascriptExecutor)driver;
    js1.executeScript("arguments[0].scrollIntoView(true);",element3);
		//x=314,y=291
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parent);//parent hela x328 y358        314,291//span[@id='bubble_rating']
		ArrayList<String> allWindows3 = new ArrayList<String> (driver.getWindowHandles());
	     driver.switchTo().window(allWindows3.get(1));
		WebElement slider=driver.findElement(By.xpath("//span[@id='bubble_rating']"));
		Actions act=new Actions(driver);
		act.moveByOffset(325, 329).release().build().perform();
		
		
		
		
		
	}
}
