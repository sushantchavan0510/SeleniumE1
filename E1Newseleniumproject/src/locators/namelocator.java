package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class namelocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    
	    WebElement usntextBox= driver.findElement(By.name("email"));
	     usntextBox.sendKeys("email");
	     Thread.sleep(2000);
	     
		WebElement passTextbox=driver.findElement(By.name("passward"));
		passTextbox.sendKeys("7788995544");
		Thread.sleep(2000);
		
		WebElement loginbutton=driver.findElement(By.name("button"));
		loginbutton.click();
		
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
