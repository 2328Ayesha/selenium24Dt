package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//navigate.to(url)
		driver.navigate().to("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//forword
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//navigate.to(url)
		driver.navigate().to("https://www.snapdeal.com");
		Thread.sleep(2000);
		
		//backward
		driver.navigate().back();
		Thread.sleep(2000);
		
		//refresh
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//close
		driver.close();
		
		
		
		
		
		
		
		
		
	}
}
