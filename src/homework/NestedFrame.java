package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chroem.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement focus = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(focus);
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		
	    driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		String txt = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println(txt);
		
		
	}
}
