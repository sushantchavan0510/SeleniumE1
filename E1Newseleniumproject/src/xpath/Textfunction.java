package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textfunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-35h3bh9b/login.do");
	    Thread.sleep(2000);
	    
	    WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));// using text()
	   loginButton.click();
	    
	   // WebElement loginButton = driver.findElement(By.xpath("//a[.='Login']"));// using .
	    //loginButton.click();


	}

}
