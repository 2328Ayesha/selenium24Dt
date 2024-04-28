package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class AtomaticNameGenerateSS {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String name = RandomString.make(6);
		
		Date d=new Date();
		String timestamp = d.toString().replace(' ','_').replace(':','_');
		
	    File desti = new File("C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Screenshot\\"+timestamp+name+".jpg");
		
	    FileHandler.copy(src, desti);
	    
	    driver.close();
		
		
		
		
		
		
		
	}
}
