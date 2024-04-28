package checkBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("ayesha");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("khan");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("2228");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]")).click();
		Thread.sleep(3000);
		
		WebElement name = driver.findElement(By.xpath("//select[@id='userSelect']"));
		Select sc=new Select(name);
		sc.selectByVisibleText("ayesha khan");
		Thread.sleep(1000);
		WebElement curncy = driver.findElement(By.xpath("//select[@id='currency']"));
		Select sc1=new Select(curncy);
		sc1.selectByVisibleText("Rupee");
		Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        
        driver.switchTo().alert().accept();
        
        driver.findElement(By.xpath("(//*[@class='btn btn-lg tab'])[2]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ayesha");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@class='btn home']")).click();
        Thread.sleep(2000);
        
        driver.close();
        
		
		
		
	}
}
