package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uniqueattribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://app.fireflink.com/signin");
	    Thread.sleep(2000);
	    
	   // WebElement signinlink=driver.findElement(By.partialLinkText("Sign in"));
	    //signinlink.click();
	    //Thread.sleep(3000);
	    
	    WebElement email=driver.findElement(By.xpath("//input[@name='emailId']"));
	    email.sendKeys("Qspider");
	    Thread.sleep(1000);
	    
	    WebElement passward=driver.findElement(By.xpath("//input[@name='passward']"));
	    passward.sendKeys("Passward@123");
	    Thread.sleep(1000);
	    
	    WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
	    loginbutton.click();
 
	}

}
