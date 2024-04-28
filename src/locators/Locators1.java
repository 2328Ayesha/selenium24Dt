package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("gender-female")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.name("FirstName")).sendKeys("ayesha");
	Thread.sleep(2000);
	
	driver.findElement(By.id("LastName")).sendKeys("khan");
	Thread.sleep(2000);
	
	//driver.findElement(By.id("Company")).sendKeys("")
	
	
	
	
	
	
	
	
}
}
