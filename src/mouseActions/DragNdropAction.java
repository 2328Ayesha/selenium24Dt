package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNdropAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act =new Actions(driver);
		
		WebElement drag = driver.findElement(By.xpath("//img[@id='angular']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droparea']"));
		Thread.sleep(1000);
		
		act.dragAndDrop(drag, drop).release(drop).build().perform();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		
	}
}
