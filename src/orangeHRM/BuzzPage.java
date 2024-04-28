package orangeHRM;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuzzPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
//loginpage		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
//buzz
		driver.findElement(By.xpath("//span[text()='Buzz']")).click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
//buzz		
		driver.findElement(By.xpath("(//button[@class='oxd-glass-button'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='orangehrm-buzz-post-modal-header-text']//textarea[@placeholder=\"What's on your mind?\"]")).sendKeys("Hi");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//div[@class='oxd-file-div oxd-file-div--active']"));
		ele.click();
		Thread.sleep(4000);
		ele.sendKeys("C:\\Users\\DTLP112\\Pictures");
		ele.submit();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Share Photos']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='orangehrm-buzz-post-modal-header-text']//textarea[@placeholder=\"What's on your mind?\"]")).sendKeys("Hi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-images orangehrm-photo-upload-icon']")).click();
        driver.switchTo().activeElement().sendKeys("C:\\Users\\DTLP112\\Pictures");
        
	    driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-buzz-post-modal-actions']//button[1]")).click();
		//driver.close();
		
	}
}
