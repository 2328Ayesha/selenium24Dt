package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Deselect2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	Actions act=new Actions(driver);
	act.sendKeys(Keys.PAGE_DOWN).perform();
	Thread.sleep(2000);
	
	WebElement multi = driver.findElement(By.xpath("//select[@id='cars']"));
	Thread.sleep(2000);
	
	Select sc=new Select(multi);
	sc.deselectByValue("");
	driver.close();
	
	//org.openqa.selenium.NoSuchElementException
	
}
}
