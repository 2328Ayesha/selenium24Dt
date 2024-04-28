package iframe;
//https://docs.google.com/forms/u/0/d/e/1FAIpQLSewol-SkpRKaRdrhYTRDmmle9-7qfnVNtO-CJIjqNqeH4n3zg/formResponse
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//a[normalize-space()='Single Iframe']")).click();
	//switch to iframe
driver.switchTo().frame("SingleFrame");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("testdata");
	//come out from the iframe
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
//driver.switchTo().frames(framename);
//driver.switchTo().frame(indexNumber);
//driver.switchTo().frame(driver.findElement(By.xpath("...")));
//
//driver.switchTo().defaultcontent();
	
	
	
	
	}	
	
}
