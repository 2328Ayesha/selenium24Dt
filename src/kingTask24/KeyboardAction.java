package kingTask24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {
	public static void main(String[] args) {       
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");   
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
        Actions act=new Actions(driver);
        
       act.sendKeys("handbag").perform();
       driver.findElement(By.xpath("//a[@class='desktop-submit']"));
       act.click().perform();
       
        
        
        
	}
}
