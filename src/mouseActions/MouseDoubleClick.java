package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame("iframeResult");
		
		WebElement filed = driver.findElement(By.xpath("//input[@id='field1']"));
		filed.clear();
		filed.sendKeys("software testing");
		
		Thread.sleep(2000);
		
		WebElement leftclick = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(leftclick).perform();
		
		Thread.sleep(2000);
	}
}
