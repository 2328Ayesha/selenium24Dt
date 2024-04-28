package dailytask24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMinfoPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//login page		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='My Info']")).click();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
//information		
		driver.findElement(By.name("firstName")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("ayesha");
		Thread.sleep(2000);
		
		driver.findElement(By.name("middleName")).sendKeys("ismail");
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastName")).sendKeys("khan");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("112233");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("001122");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]")).sendKeys("as1233");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]")).click();
		Thread.sleep(2000);
//submit		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		
		
		
	}
}
