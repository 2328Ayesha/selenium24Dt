package homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chroem.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
	
		WebElement mouseOver = driver.findElement(By.xpath("//li[@class='vl-flyout-nav__js-tab']/a[text()='Electronics']"));
		act.moveToElement(mouseOver).perform();
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//nav[@class='vl-flyout-nav__sub-cat-col']"));
		for(WebElement temp:list) {
			System.out.println(temp.getText());
			
		}

	}

}
