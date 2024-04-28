package homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectclassOtherMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	Actions act=new Actions(driver);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	
	WebElement list = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
	Thread.sleep(2000);
	
	Select sc=new Select(list);
	sc.selectByValue("2");
	Thread.sleep(2000);
	
//isMultiple	
	boolean listboxstatus = sc.isMultiple();
	System.out.println(listboxstatus);
	
	System.out.println("===============================================");

//getOpetion	
	List<WebElement> alloption = sc.getOptions();
	for(WebElement option:alloption) {
		System.out.println(option.getText());
	}
	
	System.out.println("================================================");
	
//getAllselectedOpetion	
	List<WebElement> all = sc.getAllSelectedOptions();
	for(WebElement temp:all) {
		System.out.println(temp.getText());
	}
}
}
