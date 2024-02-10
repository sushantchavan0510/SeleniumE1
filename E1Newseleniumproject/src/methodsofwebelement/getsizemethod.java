package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsizemethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-35h3bh9b/login.do");
	    Thread.sleep(2000);
	    
	    WebElement usnTB =driver.findElement(By.name("username"));
	    Dimension size=usnTB.getSize();
	    int height=size.getHeight();
	    int width=size.getWidth();
	    System.out.println("height is"+height+"width is"+width );

	}

}
