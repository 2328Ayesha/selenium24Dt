package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//get (url)
		driver.get("https://demo.nopcommerce.com/");
		
		//manage
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		//get title
		String title = driver.getTitle();
		System.out.println("get page title =:"+title);
		Thread.sleep(2000);
		
		//get current url
		String curntUrl = driver.getCurrentUrl();
		System.out.println("get page current url =:"+curntUrl);
		Thread.sleep(2000);
		
		//get page source
		String pagesource = driver.getPageSource();
		System.out.println("get page source =:"+pagesource);
		Thread.sleep(2000);
		
		//close window
		driver.close();
		
		//close all open tabs
		driver.quit();
		
	}
}
