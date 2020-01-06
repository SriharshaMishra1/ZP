package WebTable;


	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class WebTable_new {
		public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sriharsha\\eclipse-(cucumber)\\selenium_GURU\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath(".//*[@id='form']/div/div[2]/input")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='form']/div/div[4]/input")).sendKeys("tiger");
		driver.findElement(By.xpath(".//*[@id='submitButton']")).click();
		
		//driver.findElement(By.xpath(""));
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[8]/a")).click();;
		
		/*
		WebElement wb=driver.findElement(By.xpath("//table[contains(@class,'lvt ')]/tbody/tr[3][@id='row_346']/td[4]/a[text()='mishra']"));
		    System.out.println(wb.getText());;
		    wb.click();             
		     Thread.sleep(2000);
		     driver.navigate().back();
		     Thread.sleep(2000);
		    WebElement wb1=driver.findElement(By.xpath("//table[contains(@class,'lvt ')]/tbody/tr[7]/td[1]/input[@type='checkbox']"));
		  //  wb1.click();
*/		
		Thread.sleep(2000);
		//its a link ok
		List<WebElement>column= driver.findElements(By.xpath("//table[contains(@class,'lvt ')]/tbody//input[@type='checkbox']"));
		for(int i=1;i<=column.size();i++)
		{                  
			
			if(i==6){
				driver.findElement(By.xpath("//table[contains(@class,'lvt ')]/tbody/tr["+i+"]/td[1]/input[@type='checkbox']")).click();
			}
			
			if(i==9) {
				driver.findElement(By.xpath("//table[contains(@class,'lvt ')]/tbody/tr["+i+"]/td[1]/input[@type='checkbox']")).click();
			}
			//table[contains(@class,'lvt ')]/tbody//a
			/*System.out.println(column.get(i).getText());
		     String str=	column.get(i).getText();
		      column.get(i).click();*/
			
		      
		      }
			/*if(str.equalsIgnoreCase("sree@gmail.com"))
			{
				column.get(i).click();
				break;
			}*/
		/*List<WebElement>column1= driver.findElements(By.xpath("//table[contains(@class,'lvt ')]/tbody//input[@type='checkbox']"));
		for(int i=9;i<=9;i++)
		{                                                   //table[contains(@class,'lvt ')]/tbody//a
			System.out.println(column1.get(i).getText());
		     String str1=	column1.get(i).getText();
		      column1.get(i).click();*/
		      
		      }
		
		
		}


