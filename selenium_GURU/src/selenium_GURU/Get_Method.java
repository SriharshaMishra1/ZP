package selenium_GURU;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sriharsha\\eclipse-(cucumber)\\selenium_GURU\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Google"))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		/*int linkname=driver.findElements(By.tagName("a")).size();
		System.out.println(linkname);*/
		
		/*int link_count=driver.findElements(By.tagName("a")).size();
		System.out.println(link_count);*/
		
		List<WebElement> list=driver.findElements(By.xpath("//a"));
		int count=list.size();
		System.out.println(count);
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			String link_name=list.get(i).getText();
			System.out.println(link_name);
			
			
		}
		for(int j=0;j<list.size();j++)
		{
			String link_name1=list.get(5).getText();
		System.out.println("6 no link is "+link_name1);
		break;
	}
		
		
}
}
