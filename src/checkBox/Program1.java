package checkBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-lg'])[1]")).click();
		Thread.sleep(3000);
		
		WebElement name = driver.findElement(By.xpath("//*[@id='userSelect']"));
		Select sc=new Select(name);
		Thread.sleep(3000);
		sc.selectByVisibleText("Hermoine Granger");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='btn btn-default']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@ng-click='deposit()']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@type='number']")).sendKeys("1000");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@ng-click='withdrawl()']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@type='number']")).sendKeys("500");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.findElement(By.xpath("(//*[@class='btn btn-lg tab'])[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='btn logout']")).click();
		Thread.sleep(3000);
		
		driver.close();
	}
}
