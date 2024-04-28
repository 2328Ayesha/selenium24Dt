package windowHandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
		Thread.sleep(3000);
		
		
		Set<String> id = driver.getWindowHandles();
		for(String win:id) {
			System.out.println(win);
		}
		ArrayList<String> al=new ArrayList<String>(id);
		driver.switchTo().window(al.get(0));
		//Thread.sleep(3000);
		
		
	    driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']"));
	    Thread.sleep(3000);
//	    driver.findElement(By.xpath("//button[@onclick='newwindow()']")).click();
//		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		Set<String> id = driver.getWindowHandles();
//		for(String win:id) {
//			System.out.println(win);
//		}
//		
//		ArrayList<String> al=new ArrayList<String>(id);
//		driver.switchTo().window(al.get(0));
//		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@onclick='newwindow()']")).click();
//		Thread.sleep(2000);
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
//		Thread.sleep(3000);
		
		driver.quit();
		
	}
}
