package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act=new Actions(driver);

//right click action
		act.contextClick(rightclick).perform();
	
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		
	}
}
