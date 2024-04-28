package dailytask24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemoSite {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://artoftesting.com/samplesiteforselenium");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("software testing");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@id='idOfButton']")).click();
	Thread.sleep(2000);
	
	WebElement doubleclick = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
	Actions act=new Actions(driver);
	act.doubleClick(doubleclick).perform();
	Thread.sleep(2000);
	
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='female']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@class='Automation']")).click();
	Thread.sleep(2000);
	
	WebElement dropdwn = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
	Select sc=new Select(dropdwn);
	sc.selectByVisibleText("Performance Testing");
	Thread.sleep(2000);
	
	WebElement click = driver.findElement(By.xpath("//button[@onclick='generateAlertBox()']"));
	act.click(click).perform();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	
	WebElement click2 = driver.findElement(By.xpath("//button[@onclick='generateConfirmBox()']"));
	act.click(click2).perform();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	
	WebElement drag = driver.findElement(By.xpath("//img[@id='myImage']"));
	WebElement drop = driver.findElement(By.xpath("//div[@id='targetDiv']"));
	Thread.sleep(2000);
	act.dragAndDrop(drag, drop).release().perform();
	Thread.sleep(2000);
	
	
	driver.close();
	
	
}
}
