package dailytask24;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntraa {
  public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
//first bag		
	    driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("bag");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//h4[text()='15 Inch Laptop Overnighter-45L']")).click();
	    Thread.sleep(1000);
	    
	    String mainwin = driver.getWindowHandle();
	    
	   Set<String> ids = driver.getWindowHandles();
	    for(String id:ids) {
	    	System.out.println(id);
	    }
		ArrayList<String> al=new ArrayList<String>(ids);
		driver.switchTo().window(al.get(1));
	   Thread.sleep(1000);
	   
	   driver.switchTo().window(mainwin);
	   Thread.sleep(1000);
	    
	   driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
	   Thread.sleep(1000);
//second bag	
	   Set<String> ids1 = driver.getWindowHandles();
	   for(String id2:ids1) {
	    	System.out.println(id2);
	    	driver.switchTo().window(id2);
	    }
	   
	   driver.findElement(By.xpath("//h4[text()='Paris Hard Trolley Bag']")).click();
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
	   Thread.sleep(1000);
	   
	}	
}
