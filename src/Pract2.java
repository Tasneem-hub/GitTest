import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\DriverDownload\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement columnDriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		for (int i=1 ;i <columnDriver.findElements(By.tagName("a")).size();i++ )
		{
			String enterk= Keys.chord(Keys.CONTROL,Keys.ENTER);
		    columnDriver.findElements(By.tagName("a")).get(i).sendKeys(enterk);
		    Thread.sleep(5000L);
		}   
		
		Set <String> hand= driver.getWindowHandles();
		Iterator <String>it = hand.iterator();
		
		while (it.hasNext())
		{
		  driver.switchTo().window(it.next());
		  System.out.println(driver.getTitle()); 
		  
		}
		    
	    }

}
