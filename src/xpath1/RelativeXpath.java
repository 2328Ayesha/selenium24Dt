package xpath1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='login2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='loginusername']")).sendKeys("ask");
		driver.findElement(By.xpath("//*[@id='loginpassword']")).sendKeys("xyz111@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@onclick='logIn()']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[@class='close'])[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='hrefch'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@onclick='addToCart(1)']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='cartur']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='btn btn-success']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("name")).sendKeys("ask");
		driver.findElement(By.id("country")).sendKeys("india");
		driver.findElement(By.id("city")).sendKeys("pune");
		driver.findElement(By.id("card")).sendKeys("123as");
		driver.findElement(By.id("month")).sendKeys("Jan");
		driver.findElement(By.id("year")).sendKeys("1999");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@onclick='purchaseOrder()']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='confirm btn btn-lg btn-primary']")).click();
		Thread.sleep(2000);
		
		
		
	}
}
