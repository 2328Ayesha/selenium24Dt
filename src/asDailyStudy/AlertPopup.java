package asDailyStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
//alert	
    driver.findElement(By.xpath("//button[@onclick='showAlert()']")).click();
    Thread.sleep(2000);
    String text = driver.switchTo().alert().getText();
    System.out.println(text);
    Thread.sleep(2000);
    driver.switchTo().alert().accept();	
    Thread.sleep(2000);
    
//alert with 5 sec    
    driver.findElement(By.xpath("//button[@onclick='myMessage()']")).click();
    Thread.sleep(5000);
    driver.switchTo().alert().accept();
    Thread.sleep(2000);
    
//confirm ok&cancle    
    driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();
    Thread.sleep(2000);
    driver.switchTo().alert().accept();
    Thread.sleep(2000);
    WebElement text1 = driver.findElement(By.xpath("//div[@id='desk'][text()='You pressed OK!']"));
    System.out.println(text1);
    driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();
    Thread.sleep(2000);
    driver.switchTo().alert().dismiss();
    Thread.sleep(2000);
    WebElement text2 = driver.findElement(By.xpath("//div[@id='desk'][text()='You pressed Cancel!']"));
    System.out.println(text2);
    Thread.sleep(2000);
    
//prompt alert box    
    driver.findElement(By.xpath("//button[@onclick='myPromp()']")).click();
    Thread.sleep(2000);
    String str="ayesha";
    driver.switchTo().alert().sendKeys(str);
    Thread.sleep(5000);
    driver.switchTo().alert().accept();
    Thread.sleep(2000);
    
	
	
	
	
}
}
