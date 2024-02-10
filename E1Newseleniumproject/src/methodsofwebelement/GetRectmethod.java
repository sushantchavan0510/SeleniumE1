package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectmethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-35h3bh9b/login.do");
	    Thread.sleep(2000);
	    
	    WebElement loginbutton=driver.findElement(By.id("loginbutton"));
	    Rectangle rect=loginbutton.getRect();
	    System.out.println(rect.getHeight());
	    System.out.println(rect.getWidth());
	    
	    System.out.println(rect.getX());
	    System.out.println(rect.getY());
	    
	    
	}

}
