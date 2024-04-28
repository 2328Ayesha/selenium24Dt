package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopup2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='card-body']/h5[text()='Alerts, Frame & Windows']")).click();
		Thread.sleep(2000);
		
		Actions act1=new Actions(driver);
		act1.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@class='menu-list']/li/span[text()='Alerts']")).click();
		Thread.sleep(2000);
		
		Actions act2=new Actions(driver);
		act2.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(4000);
		
		driver.switchTo().alert().sendKeys("as");
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
