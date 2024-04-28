package kingTask24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextTaskPopulation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.worldometers.info/#google_vignette");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> alllist = driver.findElements(By.xpath("//div[@class='counter-group']"));
		for(WebElement temp:alllist) {
			System.out.println(temp.getText());
		}
		
		
		
		
		
	}
}
