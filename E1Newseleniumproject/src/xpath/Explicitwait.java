package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver=new ChromeDriver();// to lounch chrome browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("http://www.shoppersstack.com/");
		
		driver.findElement(By.xpath("//span[text()='APPLE iphone 14 Pro'")).click();
		
		driver.findElement(By.id("check Delivery")).sendKeys("411033");
		
		//1st way to use Explicit wait or provide waiting condition
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='check']"))));
		driver.findElement(By.xpath(null)).click();
		
		WebElement checkbutton =driver.findElement(By.xpath("//button[@id='check']"));
		wait.until(ExpectedConditions.elementToBeClickable(checkbutton);
		checkbutton.click();
		
		
		
		
		
		
	}

}
