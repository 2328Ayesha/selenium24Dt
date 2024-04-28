package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(2000);
	
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	driver.findElement(By.name("login-button")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Sauce Labs Backpack")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.className("shopping_cart_link")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("checkout")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("first-name")).sendKeys("ayesha");
	driver.findElement(By.id("last-name")).sendKeys("khan");
	driver.findElement(By.id("postal-code")).sendKeys("11667");
	Thread.sleep(2000);
	
	driver.findElement(By.id("continue")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("finish")).click();
	Thread.sleep(2000);
	
	driver.close();
	
	
}
}
