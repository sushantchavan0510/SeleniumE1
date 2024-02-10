package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselectmethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();// to lounch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/SUSHANT/Desktop/webelements/multi%20dropdown.html");
		
		WebElement multiselectDD=driver.findElement(By.id("menu"));
		
		Select sel=new Select(multiselectDD);
		
		//sel.selectByIndex(2);
		//Thread.sleep(5000);
		//sel.deselectByIndex(2);
		
		sel.selectByValue("v2");
		Thread.sleep(5000);
		sel.deselectByValue("v2");
		
		//sel.selectByVisibleText("tea");
		//Thread.sleep(5000);
		//sel.deselectByVisibleText("tea");

		

	}

}
