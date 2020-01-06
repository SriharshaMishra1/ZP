package WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_VTiger {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sriharsha\\eclipse-(cucumber)\\selenium_GURU\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath(".//*[@id='form']/div/div[2]/input")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='form']/div/div[4]/input")).sendKeys("tiger");
		driver.findElement(By.xpath(".//*[@id='submitButton']")).click();
		
		//driver.findElement(By.xpath(""));
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[8]/a")).click();;
		
		
		
		List<WebElement>list=driver.findElements(By.xpath("//table[contains(@class,'lvt small')]/tbody/tr"));
		
	       int row=	list.size();
		System.out.println(row);
		
		List<WebElement>list1=	driver.findElements(By.xpath("//table[contains(@class,'lvt small')]/tbody//td"));
		       int column=list1.size();
		System.out.println(column);
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
			{
				System.out.print(driver.findElement(By.xpath("table[1]/tbody[1]/tr[5]/td[4]")).getText()+" ");
			}
			System.out.println();
		}
		
	}

}
