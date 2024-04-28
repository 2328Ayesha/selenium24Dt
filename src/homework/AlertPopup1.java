package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@onclick='showAlert()']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@onclick='myMessage()']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//button[@onclick='myPromp()']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("as");
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
