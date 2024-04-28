package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminPage {
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
		
//Admin
		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		Thread.sleep(2000);
		
		WebElement clik = driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[1]"));
		clik.click();
	
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
		Thread.sleep(3000);
		
		
		
}	
}
