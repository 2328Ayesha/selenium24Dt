package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement desktopMenu = driver.findElement(By.xpath("//a[text()='Desktops']"));
		Thread.sleep(3000);
		WebElement macMenu = driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		
		act.moveToElement(desktopMenu).moveToElement(macMenu).click().perform();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
	}
}
