package keyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
	
		input1.sendKeys("welcome to selenium");
		
        Actions act=new Actions(driver);
        
//cnt+A        
	act.keyDown(Keys.CONTROL);
	
	act.sendKeys("a");
	
	act.keyUp(Keys.CONTROL);
	
	act.perform();
	
	
//cnt+c
act.keyDown(Keys.CONTROL);
	
	act.sendKeys("c");
	
	act.keyUp(Keys.CONTROL);
	
	act.perform();
	
	
//TAB - shift to input2 box
	act.sendKeys(Keys.TAB);
	
	act.perform();
	
	
//cnt+v
act.keyDown(Keys.CONTROL);
	
	act.sendKeys("v");
	
	act.keyUp(Keys.CONTROL);
	
	act.perform();
	
	
	driver.close();
	
	
	
}
}
