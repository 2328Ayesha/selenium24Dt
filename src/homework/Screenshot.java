package homework;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://seleniumbase.io/demo_page");
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File desti = new File("C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Screenshot\\homework.jpg");
	
	FileHandler.copy(src,desti);
	
	driver.close();
	
	
	
	
	
	
	
}
}
