package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	Thread.sleep(1000);
//single frame	
	driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
	Thread.sleep(1000);
	
	driver.switchTo().frame("singleframe");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iframe");
	Thread.sleep(2000);

	driver.switchTo().parentFrame();
	Thread.sleep(2000);
	
//Iframe with in an Iframe	
	driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	Thread.sleep(2000);
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
	Thread.sleep(2000);
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']")));
	Thread.sleep(1000);
	
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("software testing");
	Thread.sleep(3000);
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
