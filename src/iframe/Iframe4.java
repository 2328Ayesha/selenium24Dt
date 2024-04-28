package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.tutorialspoint.com/selenium/practice/nestedframes.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement ele = driver.findElement(By.xpath("//iframe"));
	driver.switchTo().frame(ele);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@class='external-link']")).click();
	Thread.sleep(2000);
	
	driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
	Thread.sleep(2000);
	
	WebElement text = driver.findElement(By.xpath("//div[@id='mainContent']/h1"));
	System.out.println(text.getText());
	Thread.sleep(2000);
	
	driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
	Thread.sleep(2000);
	
	WebElement text2 = driver.findElement(By.xpath("//div[@class='col-md-8 col-lg-8 col-xl-8']/h1[@class='mb-3 fw-normal border-bottom text-left pb-2 mb-4']"));
	System.out.println(text2.getText());
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()=' Modal Dialogs']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[text()='Small Modal']")).click();
	Thread.sleep(2000);
	
	WebElement text3 = driver.findElement(By.xpath("//h5[@id='exampleModalToggleLabel']"));
	System.out.println(text3.getText());
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[text()='Close']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[text()='Small Modal']")).click();
	Thread.sleep(2000);
	
	WebElement text4 = driver.findElement(By.xpath("//div[@class='modal-body']"));
	System.out.println(text4.getText());
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[text()='Close']")).click();
	Thread.sleep(2000);
	
	//driver.close();
}
}
