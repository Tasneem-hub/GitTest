import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\DriverDownload\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://the-internet.herokuapp.com/windows");
	  driver.findElement(By.linkText("Click Here")).click();
	  Set<String> window =driver.getWindowHandles();
	  Iterator<String>it = window.iterator();
	  String parent = it.next();
	  String child = it.next();
	  
	  driver.switchTo().window(child);
	  System.out.println(driver.findElement(By.cssSelector(".example")).getText());
	  driver.switchTo().window(parent);
	  System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
	  
	  
	  
	  
	  

	  
	  

	}

}
