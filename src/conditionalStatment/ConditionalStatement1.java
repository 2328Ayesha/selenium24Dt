package conditionalStatment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalStatement1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.id("Newsletter"));
		Thread.sleep(3000);
		
		if(((ele.isDisplayed()==true && ele.isSelected()==true ))&& (ele.isEnabled()==true))
		{
			
			ele.click();
		}
		
		
		driver.close();
		
		
		
		
		
	}
}
