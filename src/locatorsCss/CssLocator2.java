package locatorsCss;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[href='prod.html?idp_=1']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a.btn.btn-success.btn-lg[href='#']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a#cartur")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button.btn.btn-success")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("ask");
		driver.findElement(By.id("country")).sendKeys("india");
		driver.findElement(By.id("city")).sendKeys("pune");
		driver.findElement(By.id("card")).sendKeys("1234");
		driver.findElement(By.id("month")).sendKeys("Apr");
		driver.findElement(By.id("year")).sendKeys("2004");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button.btn.btn-primary[onclick='purchaseOrder()']")).click();
		Thread.sleep(2000);
		
		
		
		
		
}
		
}
