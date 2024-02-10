package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectorlocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://www.instagram.com/accounts/login/?hl=en");
	    Thread.sleep(2000);
	    
	    WebElement usnTB=driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']"));
	    usnTB.sendKeys("qspider");
	    Thread.sleep(2000);
	    
	    WebElement usnT=driver.findElement(By.cssSelector("input[aria-label='Password']"));
	    usnT.sendKeys("password@123");
	    Thread.sleep(2000);
	    
	    WebElement loginbutton=driver.findElement(By.cssSelector("button[type='submit']"));
	    loginbutton.click();
	    
	}

}
