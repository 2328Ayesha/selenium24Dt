package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chroem.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement focus = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(focus);
		Thread.sleep(2000);
		
		WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(text.getText());
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		WebElement temp = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(temp);
		Thread.sleep(2000);
		
		WebElement text2 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(text2.getText());
		
		
	}
}
