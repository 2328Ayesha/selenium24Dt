package homework;
//org.openqa.selenium.InvalidElementStateException
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebPage {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DTLP112\\eclipse-workspace\\selenium24\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://seleniumbase.io/demo_page/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
		
	driver.findElement(By.xpath("//input[@id='myTextInput']")).sendKeys("ayesha");
	driver.findElement(By.xpath("//input[@id='myTextInput2']")).sendKeys("software testing");
	driver.findElement(By.xpath("//input[@id='placeholderText']")).sendKeys("demo website");
	Thread.sleep(2000);

	driver.findElement(By.xpath("//*[@id='svgRect']")).click();
	Thread.sleep(2000);
	
	WebElement slider = driver.findElement(By.xpath("//input[@id='mySlider']"));
	Actions act=new Actions(driver);
	act.dragAndDropBy(slider, 100, 125).perform();
	Thread.sleep(2000);
	
	WebElement select = driver.findElement(By.xpath("//select[@id='mySelect']"));
	Select sc=new Select(select);
	sc.selectByValue("100%");
	Thread.sleep(2000);
	
	WebElement frame = driver.findElement(By.xpath("//iframe[@id='myFrame2']"));
	driver.switchTo().frame(frame);
	
	WebElement text = driver.findElement(By.xpath("//h4[text()='iFrame Text']"));
	System.out.println(text.getText());
	Thread.sleep(2000);
	
	driver.switchTo().parentFrame();
	
	driver.findElement(By.xpath("//*[@id='checkBox1']")).click();
	Thread.sleep(2000);
	
	WebElement ele = driver.findElement(By.xpath("//*[@id='checkBox2']"));
	ele.click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@id='myLink1']")).click();
	Thread.sleep(2000);
	
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@id='myLink3']")).click();
	Thread.sleep(2000);
	
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id='myTextarea']"))
	.sendKeys("demo webpage testing for practice purpose");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@id='myButton']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(" //input[@id='radioButton2']")).click();
	
	WebElement focs = driver.findElement(By.xpath("//iframe[@id='myFrame3']"));
	driver.switchTo().frame(focs);
	
	driver.findElement(By.xpath("//input[@id='checkBox6']")).click();
	Thread.sleep(2000);
	
	driver.switchTo().parentFrame();
	
	WebElement drag = driver.findElement(By.xpath("//div[@id='drop1']"));
	WebElement drop = driver.findElement(By.xpath("//div[@id='drop2']"));
	act.dragAndDrop(drag, drop).perform();
	Thread.sleep(2000);
	
	driver.close();
}
}
