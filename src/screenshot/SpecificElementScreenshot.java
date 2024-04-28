package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SpecificElementScreenshot {
public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		Thread.sleep(2000);
		
		File src = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		
		File desti = new File("C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Screenshot\\ele.jpg");
		
		FileHandler.copy(src, desti);
	
		driver.close();
		
		
	}
}
