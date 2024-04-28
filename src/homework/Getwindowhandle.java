package homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary'][text()='New Tab']")).click();
		
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='external-link']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='New Window']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='external-link']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
		Thread.sleep(2000);
		
		driver.close();
		
		
	}
}
