package homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='accordion-button collapsed'][text()=' Widgets']")).click();
	Thread.sleep(4000);
	
	Actions act=new Actions(driver);
	act.sendKeys(Keys.PAGE_DOWN).perform();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[@id='collapseFour']/div/ul/li/a[text()=' Select Menu']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//span[text()='Please select...']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[text()='Movies, Music & Games']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[text()='Electronics & Computers']")).click();
	Thread.sleep(2000);
	
	driver.close();
	
	
	
	
	
	
	}
}
