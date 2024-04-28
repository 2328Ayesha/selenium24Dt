package xpath1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.demoblaze.com/index.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/nav/div/ul/li[5]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/input")).sendKeys("aarti singh");
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/input")).sendKeys("123@aarti");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
	Thread.sleep(2000);
	
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[1]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div/div/h4/a")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
	Thread.sleep(2000);
	
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/nav/div/div/ul/li[4]/a")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/button")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("name")).sendKeys("ask");
	driver.findElement(By.id("country")).sendKeys("india");
	driver.findElement(By.id("city")).sendKeys("pune");
	driver.findElement(By.id("card")).sendKeys("123as");
	driver.findElement(By.id("month")).sendKeys("Jan");
	driver.findElement(By.id("year")).sendKeys("1999");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
	Thread.sleep(3000);
	
	
	
	
}
}
