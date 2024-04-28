package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chroem.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		
		WebElement doubleclik = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		act.doubleClick(doubleclik).perform();
		Thread.sleep(2000);
		
		WebElement rightclik = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		act.contextClick(rightclik).perform();
		Thread.sleep(2000);
		
		WebElement clik = driver.findElement(By.xpath("//button[text()='Click Me']"));
		act.click(clik).perform();
		
		driver.close();
		
		
	}
}
