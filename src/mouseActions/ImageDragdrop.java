package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImageDragdrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		Thread.sleep(2000);
		
		WebElement drag = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='trash']"));
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(drag, drop).release(drop).perform();
		Thread.sleep(2000);
		
		driver.close();
	}
}
