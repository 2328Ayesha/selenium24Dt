package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandles2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chroem.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act1=new Actions(driver);
		act1.sendKeys(Keys.ARROW_DOWN).perform();
		
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		
		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
		Thread.sleep(2000);
		
		String text1 = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(text1);
		Thread.sleep(2000);
		
		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(driver.getWindowHandles().toArray()[3].toString());
		Thread.sleep(2000);
		
//		String te = driver.findElement(By.xpath("//body")).getText();
//		System.out.println(te);
//		Thread.sleep(2000);
		
		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
