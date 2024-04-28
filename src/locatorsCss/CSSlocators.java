package locatorsCss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CSSlocators {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdrver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("a.ico-register")).click();
	Thread.sleep(2000);
	
    driver.findElement(By.id("gender-female")).click();
    driver.findElement(By.id("FirstName")).sendKeys("aayesha");
    driver.findElement(By.id("LastName")).sendKeys("khan");
    Thread.sleep(2000);
	 
	driver.findElement(By.cssSelector("#Email")).sendKeys("askfgh2@gmail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("#Company")).sendKeys("dts");
	Thread.sleep(2000);

    driver.findElement(By.cssSelector("#Password")).sendKeys("as12345");
    driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("as12345");
    Thread.sleep(2000);

    driver.findElement(By.cssSelector("#register-button")).click();
    Thread.sleep(2000);
   
    driver.findElement(By.cssSelector(".buttons")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.cssSelector("ul.top-menu.notmobile>li:nth-of-type(6)")).click();
    Thread.sleep(2000);
}
}
