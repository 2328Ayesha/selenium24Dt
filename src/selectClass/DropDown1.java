package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//*[@name='DateOfBirthDay']"));
		Select sc=new Select(day);
		sc.selectByIndex(8);
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//*[@name='DateOfBirthMonth']"));
		Select sc1=new Select(month);
		sc1.selectByValue("2");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//*[@name='DateOfBirthYear']"));
		Select sc2=new Select(year);
		sc2.selectByVisibleText("1918");
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
