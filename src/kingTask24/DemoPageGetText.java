package kingTask24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoPageGetText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://ultimateqa.com/complicated-page");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement hover = driver.findElement(By.xpath("//ul[@id='menu-main-menu']/li/a[text()='Education']"));
		Actions act=new Actions(driver);
		act.moveToElement(hover).perform();
		Thread.sleep(3000);
		
		System.out.println("***********Education**************");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='sub-menu']/li"));
		for(WebElement temp:list) {
			System.out.println(temp.getText());
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Automation Exercises'])[1]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Big page with many elements']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='et_pb_contact_name_0']")).sendKeys("ayesha");
		driver.findElement(By.xpath("//input[@id='et_pb_contact_email_0']")).sendKeys("as123@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='et_pb_contact_message_0']")).sendKeys("i automate this demopage");
		driver.findElement(By.xpath("(//input[@class='input et_pb_contact_captcha'])[1]")).sendKeys("24");
		driver.findElement(By.xpath("(//button[@class='et_pb_contact_submit et_pb_button'])[1]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='A_toggle']")).click();
		WebElement text = driver.findElement(By.xpath("//div[text()='Inside of toggle']"));
	    System.out.println(text.getText());
	    
		
	}
}
