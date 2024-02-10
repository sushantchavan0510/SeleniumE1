package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectmethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();// to lounch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/SUSHANT/Desktop/webelements/dropdown.html");
		
		WebElement singleselectDD=driver.findElement(By.id("menu"));
		
		Select sel=new Select(singleselectDD);
		
		sel.selectByIndex(3);
		Thread.sleep(5000);
		
		sel.selectByValue("v2");
		Thread.sleep(5000);
		
		sel.selectByVisibleText("tea");
		Thread.sleep(5000);

	}

}
