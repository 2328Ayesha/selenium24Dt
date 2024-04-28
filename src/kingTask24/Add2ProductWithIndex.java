package kingTask24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add2ProductWithIndex {
	public static void main(String[] args) {       
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");   
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        
 //first product
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchBox.sendKeys("ring");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        driver.findElement(By.xpath("//span[text()='25 Gram Ring Lot Sterling Silver 925 Ladies Rings New! (8 To 12 Rings)']")).click();

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        
        driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
        

     driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        
 //second product
     driver.get("https://www.ebay.com/");
     
     WebElement searchBox1 = driver.findElement(By.xpath("//input[@id='gh-ac']"));
     searchBox1.sendKeys("ring");
     searchBox1.submit();
     
     driver.findElement(By.xpath("//span[text()='Genuine Rolex GMT Master 1675 16750 16753 Watch Retaining Retainer Bezel Ring']")).click();

     driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
             
     driver.findElement(By.xpath("//span[text()='Add to cart']")).click();    
    
 // Switch back to the main window
     //driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());

     //driver.quit();
     
     
     
	}
}
