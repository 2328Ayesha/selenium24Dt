package kingTask24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(2000);
	
	WebElement ele = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
	//ele.click();
	Select sct=new Select(ele);
    //sct.selectByIndex(2);
    //Thread.sleep(2000);
    //sct.deselectByIndex(2);
    Thread.sleep(2000);
    sct.getFirstSelectedOption();
    
    Thread.sleep(2000);
    //sct.deselectAll();
    
	
	//driver.close();
	
}
}
