package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropMouse {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chroem.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		WebElement drag = driver.findElement(By.xpath("//img[@id='angular']"));
		Thread.sleep(2000);
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='droparea']"));
		Thread.sleep(2000);
		
		act.dragAndDrop(drag, drop).release().build().perform();
		Thread.sleep(2000);
		
		driver.close();
	}
}
