package kingTask24;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopclues {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://m.shopclues.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//search		
		driver.findElement(By.xpath("//input[@id='search_input_field']")).sendKeys("iphone");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
//first product		
		driver.findElement(By.xpath("//div[text()='Refurbished Apple Iphone 7 2 Gb RAM 32Gb ROM Single Sim Smartphone']")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//a[@id='add_cart']")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
//second product
		driver.findElement(By.xpath("//div[text()='(Refurbished) Apple Iphone 7 2 Gb RAM 32Gb ROM Single Sim Smartphone - Superb Condition, Like New']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Add To Cart']")).click();
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//span[@id='cart_count']")).click();
	    Thread.sleep(2000);
	    
	    
	    driver.close();
	    
		
		
	
	}
}
