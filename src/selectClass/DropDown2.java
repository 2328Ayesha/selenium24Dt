package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/tutor_connect/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='accent-nav']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='accent-nav__item'])[3]")).click();
		Thread.sleep(2000);
		
		
		
		
		
}
}
