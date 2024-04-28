package kingTask24;
//org.openqa.selenium.StaleElementReferenceException
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EBayGetTextTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	System.out.println("*****Electronics*******");	
		WebElement ele = driver.findElement(By.xpath("//div[@id='vl-flyout-nav']/ul/li/a[text()='Electronics']"));
		Actions act =new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
		
		List<WebElement> electronic = driver.findElements(By.xpath("//div[@class='vl-flyout-nav__sub-cats']/nav/ul"));
		for(WebElement print:electronic) 
		{
			System.out.println(print.getText());
		}
		
	System.out.println("******Motors******");	
	WebElement ele1 = driver.findElement(By.xpath("//div[@id='vl-flyout-nav']/ul/li/a[text()='Motors']"));
	Actions act1 =new Actions(driver);
	act1.moveToElement(ele1).perform();
	Thread.sleep(3000);
	
	List<WebElement> motor = driver.findElements(By.xpath("//div[@class='vl-flyout-nav__sub-cats']/nav/ul"));
	for(WebElement print2:motor) 
	{
		System.out.println(print2.getText());
	}
	
	System.out.println("******Fashion******");	
	WebElement ele2 = driver.findElement(By.xpath("//div[@id='vl-flyout-nav']/ul/li/a[text()='Fashion']"));
	Actions act2 =new Actions(driver);
	act2.moveToElement(ele2).perform();
	Thread.sleep(3000);
	
	List<WebElement>  fashion= driver.findElements(By.xpath("//div[@class='vl-flyout-nav__sub-cats']/nav/ul"));
	for(WebElement print3:fashion) 
	{
		System.out.println(print3.getText());
	}
	System.out.println("******Collectible & Art******");	
	WebElement ele3 = driver.findElement(By.xpath("//div[@id='vl-flyout-nav']/ul/li/a[text()='Collectibles and Art']"));
	Actions act3 =new Actions(driver);
	act3.moveToElement(ele3).perform();
	Thread.sleep(3000);
	
	List<WebElement> art = driver.findElements(By.xpath("//div[@class='vl-flyout-nav__sub-cats']/nav/ul"));
	for(WebElement print4:art) 
	{
		System.out.println(print4.getText());
	}
	
	System.out.println("******Sports******");	
	WebElement ele4 = driver.findElement(By.xpath("//div[@id='vl-flyout-nav']/ul/li/a[text()='Sports']"));
	Actions act4 =new Actions(driver);
	act4.moveToElement(ele4).perform();
	Thread.sleep(3000);
	
	List<WebElement> sport = driver.findElements(By.xpath("//div[@class='vl-flyout-nav__sub-cats']/nav/ul"));
	for(WebElement print5:sport) 
	{
		System.out.println(print5.getText());
	}
	
	System.out.println("******Health and Beuty******");	
	WebElement ele5 = driver.findElement(By.xpath("//div[@id='vl-flyout-nav']/ul/li/a[text()='Health & Beauty']"));
	Actions act5 =new Actions(driver);
	act5.moveToElement(ele5).perform();
	Thread.sleep(3000);
	
	List<WebElement> beauty = driver.findElements(By.xpath("//div[@class='vl-flyout-nav__sub-cats']/nav/ul"));
	for(WebElement print6:beauty) 
	{
		System.out.println(print6.getText());
	}
	
	System.out.println("******Indestriul Equipment******");	
	WebElement ele6 = driver.findElement(By.xpath("//div[@id='vl-flyout-nav']/ul/li/a[text()='Industrial equipment']"));
	Actions act6 =new Actions(driver);
	act6.moveToElement(ele6).perform();
	Thread.sleep(3000);
	
	List<WebElement> equpe= driver.findElements(By.xpath("//div[@class='vl-flyout-nav__sub-cats']/nav/ul"));
	for(WebElement print7:equpe) 
	{
		System.out.println(print7.getText());
	}
	
	System.out.println("******Home & Garden******");	
	WebElement ele7 = driver.findElement(By.xpath("//div[@id='vl-flyout-nav']/ul/li/a[text()='Home & Garden']"));
	Actions act7 =new Actions(driver);
	act7.moveToElement(ele7).perform();
	Thread.sleep(3000);
	
	List<WebElement> home= driver.findElements(By.xpath("//div[@class='vl-flyout-nav__sub-cats']/nav/ul"));
	for(WebElement print7:home) 
	{
		System.out.println(print7.getText());
	}
		
	System.out.println("******sell******");	
	WebElement ele8 = driver.findElement(By.xpath("//div[@id='vl-flyout-nav']/ul/li/a[text()='Sell']"));
	Actions act8 =new Actions(driver);
	act8.moveToElement(ele8).perform();
	Thread.sleep(3000);
	
	List<WebElement> sell= driver.findElements(By.xpath("//div[@class='vl-flyout-nav__sub-cats']/nav/ul"));
	for(WebElement print8:sell) 
	{
		System.out.println(print8.getText());
	}
		
		
		
		
	}
}
