package synchronizeWait;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class FluentWaitProgram {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//Fluent wait for 10 second
		
		Wait <WebDriver> wait=new FluentWait<WebDriver>(driver)
				                                               .withTimeout(Duration.ofSeconds(10))
		                                                       .pollingEvery(Duration.ofSeconds(2))
		                                                       .withMessage("this is custom massage")
		                                                       .ignoring(NoSuchElementException.class);
		
		
		  WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='START SELLING'])[3]")));
			element.click();
		

		
	}
}
