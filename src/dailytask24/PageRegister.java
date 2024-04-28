package dailytask24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PageRegister {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("ayesha");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("khan");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("pune");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("asb123@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("123456");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[normalize-space()='Arabic']")).click();
	    Thread.sleep(1000);
		
		WebElement skil = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
		Select sc=new Select(skil);
		sc.selectByIndex(8);
		Thread.sleep(2000);
		
//		WebElement contry = driver.findElement(By.xpath("(//div[@class='col-md-4 col-xs-4 col-sm-4'])[10]"));
//		Select sc1=new Select(contry);
//		sc1.selectByIndex(4);
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("as12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("as12");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("C://Users//DTLP112//Downloads");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
