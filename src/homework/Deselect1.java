package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement list = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
	Select sc=new Select(list);
	Thread.sleep(2000);
	
	sc.deselectByIndex(2);
	
	//java.lang.UnsupportedOperationException
	
}
}
