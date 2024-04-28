package getWindowHandles;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebay {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
//first product		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("samsung");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Samsung Galaxy S21 5G Unlocked 128GB']")).click();
		Thread.sleep(2000);
		
		String mainwin = driver.getWindowHandle();
		
		Set<String> ids = driver.getWindowHandles();
	    for(String id:ids) {
	    	System.out.println(id);
	    }
		ArrayList<String> al=new ArrayList<String>(ids);
		driver.switchTo().window(al.get(1));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(mainwin);
		Thread.sleep(2000);
		
//second product	
		
		driver.findElement(By.xpath("//span[text()='Samsung Galaxy S10 S10e S10+ Plus 128GB 512GB Unlocked Verizon T-Mobile AT&T ']")).click();
		Thread.sleep(2000);
		
		Set<String> ids1 = driver.getWindowHandles();
	    for(String id2:ids1) {
	    	System.out.println(id2);
	    	driver.switchTo().window(id2);
	    }
	
		Thread.sleep(2000);
		
		WebElement drpdwn = driver.findElement(By.xpath("//select[@id='x-msku__select-box-1000']"));
		Select sc=new Select(drpdwn);
		sc.selectByVisibleText("Samsung Galaxy S10");
		Thread.sleep(3000);
		
		WebElement drpdwn1 = driver.findElement(By.xpath("(//select[@class='x-msku__select-box'])[2]"));
		Select sc1=new Select(drpdwn1);
		sc1.selectByVisibleText("T-Mobile");
		Thread.sleep(3000);
		
		WebElement drpdwn2 = driver.findElement(By.xpath("(//select[@class='x-msku__select-box'])[3]"));
		Select sc2=new Select(drpdwn2);
		sc2.selectByVisibleText("128 GB");
		Thread.sleep(3000);
		
		WebElement drpdwn3 = driver.findElement(By.xpath("(//select[@class='x-msku__select-box'])[4]"));
		Select sc3=new Select(drpdwn3);
		sc3.selectByVisibleText("Black");
		Thread.sleep(3000);
		
		WebElement drpdwn5 = driver.findElement(By.xpath("(//select[@class='x-msku__select-box'])[5]"));
		Select sc5=new Select(drpdwn5);
		sc5.selectByVisibleText("Open Box");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
