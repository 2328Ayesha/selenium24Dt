package xpath1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sign-username']")).sendKeys("ayesha221");
		driver.findElement(By.xpath("//*[@id='sign-password']")).sendKeys("123@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='hrefch'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='cartur']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='btn btn-success']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("ask");
		driver.findElement(By.id("country")).sendKeys("india");
		driver.findElement(By.id("city")).sendKeys("pune");
		driver.findElement(By.id("card")).sendKeys("123as");
		driver.findElement(By.id("month")).sendKeys("Jan");
		driver.findElement(By.id("year")).sendKeys("1999");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class=\"sa-confirm-button-container\"]")).click();
		Thread.sleep(3000);
	}
}
