package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoukriCom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://www.naukri.com/nlogin/login");
	    Thread.sleep(2000);
	    
	    WebElement usntextBox= driver.findElement(By.id("usernameField"));
	     usntextBox.sendKeys("email");
	     Thread.sleep(2000);
	     
		WebElement passTextbox=driver.findElement(By.id("passwordField"));
		passTextbox.sendKeys("7788995544");
		Thread.sleep(2000);
		
		WebElement loginbutton=driver.findElement(By.tagName("button"));
		loginbutton.click();
		
	    
	}

}
