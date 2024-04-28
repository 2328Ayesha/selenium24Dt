package windowHandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Open New Tabbed Windows ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		Thread.sleep(1000);
		Set<String> window = driver.getWindowHandles();
		for(String id1:window) {
			System.out.println(id1);
		}
		ArrayList<String> al=new ArrayList<String>(window);
		driver.switchTo().window(al.get(1));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		Thread.sleep(5000);
		
		driver.quit();
	}
}
