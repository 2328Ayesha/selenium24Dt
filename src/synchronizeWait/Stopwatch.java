package synchronizeWait;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Stopwatch {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//implicit wait for 10 seconds		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

//stopwatch for using observation purpose		
		Stopwatch watch = null;
		
		Stopwatch Stopwatch = null;
		watch=Stopwatch;
			
		driver.findElement(By.xpath("//(//a[text()='START SELLING'])[3]")).click();
		
		
		System.out.println(watch.elapsed(TimeUnit.SECONDS)+"seconds");
			
		}

	private String elapsed(TimeUnit seconds) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
