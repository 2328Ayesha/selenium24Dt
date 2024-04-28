package synchronizeWait;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class ExplicitWait {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//Explicit wait for 10 second
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		 Stopwatch watch = null;
		
		try {
			watch=Stopwatch.createStarted();
			  WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='START SELLING'])[3]")));
			element.click();
			
			
		//driver.findElement(By.xpath("//(//a[text()='START SELLING'])[3]")).click();
		}
		catch(Exception e)
		{
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS)+"seconds");
			
		}
		
		
		
		
	}
}
