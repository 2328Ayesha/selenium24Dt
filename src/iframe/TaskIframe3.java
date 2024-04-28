package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskIframe3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement ele = driver.findElement(By.xpath("(//iframe)[1]"));
    driver.switchTo().frame(ele);
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//a[@href='/selenium/index.htm']")).click();
    Thread.sleep(2000);
    
    driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
    Thread.sleep(2000);
    
    WebElement text = driver.findElement(By.xpath("//h1[text()='Selenium Tutorial']"));
    System.out.println(text.getText());
	
}
}
