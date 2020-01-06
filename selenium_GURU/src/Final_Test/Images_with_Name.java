package Final_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Images_with_Name {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://in.yahoo.com/");
		List<WebElement> list=driver.findElements(By.xpath("//img"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Link name"+i+" "+list.get(i).getAttribute("src"));;
			//System.out.println(i+ " "+list.get(i).getText()); only for visible text
		}
	}
}
