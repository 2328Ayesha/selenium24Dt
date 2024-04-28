package kingTask24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraAdd2Product {
	public static void main(String[] args) {       
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");   
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
       driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("chain");     
       driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();        
       driver.findElement(By.xpath("//span[text()='498']")).click(); 
       
       driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());  
       driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
       
       driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
       
       driver.findElement(By.xpath("//span[text()='331']")).click(); 
       driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());       
       driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
       
       driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
       
       driver.findElement(By.xpath("//span[text()='574']")).click();
       driver.switchTo().window(driver.getWindowHandles().toArray()[3].toString());       
       driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
	}
}
