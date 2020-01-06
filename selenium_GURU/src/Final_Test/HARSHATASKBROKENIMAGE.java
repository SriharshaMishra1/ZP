package Final_Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HARSHATASKBROKENIMAGE {

WebDriver driver;
@BeforeTest
public void setup() throws Exception {
driver=new FirefoxDriver();    
 driver.get("http://the-internet.herokuapp.com/broken_images");
 driver.manage().window().maximize();
 Thread.sleep(2000);
}

@Test
public void Save_Image() throws IOException, InterruptedException, AWTException {

//Right click on Image using contextClick() method.
 
Actions action= new Actions(driver);

//Locate Image

WebElement Image =driver.findElement(By.xpath("//body//img[3]"));
 
action.contextClick(Image).build().perform();

Thread.sleep(3000);
 
 //To perform press shift + v keyboard button action.

Robot robot = new Robot();

robot.keyPress(KeyEvent.VK_DOWN);

Thread.sleep(2000);

robot.keyPress(KeyEvent.VK_DOWN);

Thread.sleep(2000);

robot.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(2000);
robot.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(2000);
robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(2000);
 
//	action.sendKeys(Keys.SHIFT, "v").build().perform();

 Thread.sleep(3000);
 
 // To press D key.
 
 robot.keyPress(KeyEvent.VK_E);
 
 // To press : key.
 
 robot.keyPress(KeyEvent.VK_SHIFT);
 
 robot.keyPress(KeyEvent.VK_SEMICOLON);
 
 robot.keyRelease(KeyEvent.VK_SHIFT);
 
 // To press \ key.
 
 robot.keyPress(KeyEvent.VK_BACK_SLASH);
 
 // To press "test" key one by one.
 
 robot.keyPress(KeyEvent.VK_T);
 
 robot.keyPress(KeyEvent.VK_E);
 
 robot.keyPress(KeyEvent.VK_S);
 
 robot.keyPress(KeyEvent.VK_T);
 
 // To press Save button.
 
 robot.keyPress(KeyEvent.VK_ENTER);  
 
 System.out.println("Unbroken image is saved in E drive");
 
 for (WebElement image : driver.findElements(By.cssSelector("img")))
 	{
 	    isImageBroken(image);
 	}
 	}
 	 
 	public static void isImageBroken(WebElement image) throws InterruptedException
 	{
 	    if (image.getAttribute("naturalWidth").equals("0"))
 	    {
 	        System.out.println(image.getAttribute("outerHTML") + " is broken.");
 	    }
 	    
}
 	 
}



