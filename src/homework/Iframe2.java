package homework;
// org.openqa.selenium.ElementClickInterceptedException
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement focus = driver.findElement(By.xpath("(//iframe)[2]"));
	driver.switchTo().frame(focus);
	Thread.sleep(2000);
	
	Actions act=new Actions(driver);
	act.sendKeys(Keys.PAGE_DOWN).perform();
	Thread.sleep(3000);
	
	act.sendKeys(Keys.PAGE_DOWN).perform();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("/html/body/div/header/div[3]/a")).click();
	
	
	
	
	
	
	
	
}
}
