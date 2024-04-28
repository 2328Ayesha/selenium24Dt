package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightLeftAction {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);

	Actions act=new Actions(driver);
	
//left click
	
	WebElement leftclick = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	act.doubleClick(leftclick).perform();
	Thread.sleep(2000);
	
	driver.switchTo().alert().accept();

//right click	
	
	WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
	act.contextClick(rightclick).perform();
	Thread.sleep(2000);
	
	WebElement close = driver.findElement(By.xpath("//span[text()='Quit']"));
	act.contextClick(close).perform();
	Thread.sleep(2000);
	
	driver.switchTo().alert().accept();
	
	Thread.sleep(2000);
	
	driver.close();
	
}
}
