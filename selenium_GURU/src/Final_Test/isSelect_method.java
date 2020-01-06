package Final_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class isSelect_method {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
driver.get("http://localhost/login.do");
		
		String username="admin";
		String password="manager";
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath(".//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='loginButton']/div")).click();
		/*click to Setting icon*/
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='TASKS']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Projects & Customers")).click();
	/*	Thread.sleep(2000);
		String str="//table[@class='active_customers_projects listTable withRoundCorners']/tbody/tr[*]/td[6]/input";
		List<WebElement> list=driver.findElements(By.xpath(str));
		for(WebElement wb:list)
		{
			if(wb.isSelected())
			{
				System.out.println("already selected");
			}
			else
			{
				
				wb.click();
				String str1=wb.getText();
				System.out.println(str1);
			}
		}*/
		String expected="HDFC";
		
	      Select sel=new Select(driver.findElement(By.xpath("//table/tbody/tr/td/div/select[@class='controlBorder']")));
	     /* List<WebElement> web=sel.getOptions();
	      for(int i=0;i<web.size();i++){
	       //String actual=web.get(i).getText();
	       if(web.get(i).getText().equals(expected)){
	        sel.selectByVisibleText(web.get(i).getText());
	        
	       }*/
	      List<WebElement> list=sel.getOptions();
	      for(int i=0;i<list.size();i++){
	       String actoption=list.get(i).getText();
	       System.out.println(actoption.contains("HDFC"));
	    
	      }

}}