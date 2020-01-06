package Final_Test;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_Control {
	public static void main(String[] args) throws Throwable {
	WebDriver driver=new FirefoxDriver();
	//driver.manage().window().maximize();
	driver.get("http://www.amazon");
	Dimension d=new Dimension(100,300);
	driver.manage().window().setSize(d);
	
	
	
}
}
