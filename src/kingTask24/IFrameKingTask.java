package kingTask24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameKingTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
//1frame		
	    WebElement frame1 = driver.findElement(By.xpath("(//frame)[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("here add my first text");
		
		driver.switchTo().defaultContent();
//2frame
		WebElement frame2 = driver.findElement(By.xpath("(//frame)[2]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("second text add");
		
//3frame	
		driver.switchTo().defaultContent();
		
	    WebElement frame3 = driver.findElement(By.xpath("(//frame)[3]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("third text");
		
//google form
		Thread.sleep(5000);
		WebElement inside = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(inside);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[3]")).click();
		
		driver.findElement(By.xpath("//div[@class='MocG8c HZ3kWc mhLiyf LMgvRb KKjvXb DEh1R']")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[3]/div/div/div[2]/div/div[2]/div[3]/span")).click();
//next page		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/input"));
		ele.click();
		ele.sendKeys("testing");
		
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("text");
		
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		
//4frame
		driver.switchTo().defaultContent();
		
		WebElement frame4 = driver.findElement(By.xpath("(//frame)[4]"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("four text");
		
	}
}
