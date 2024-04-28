package homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chroem.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement focus1 = driver.findElement(By.xpath("(//iframe)[1]"));
	driver.switchTo().frame(focus1);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@class=\"external-link\"][text()=' Selenium Tutorial']")).click();
	Thread.sleep(2000);
	
	driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
	Thread.sleep(2000);
	
	List<WebElement> list = driver.findElements(By.xpath("//div[@class='center-aligned tutorial-menu']/form/button"));
	for(WebElement temp:list) {
	System.out.println(temp.getText());
	}
	

	
	
	
}
}
