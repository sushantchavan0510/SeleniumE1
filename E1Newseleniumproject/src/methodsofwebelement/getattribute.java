package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-35h3bh9b/login.do");
	    Thread.sleep(2000);
	    
	    WebElement passwardTB=driver.findElement(By.name("pwd"));
	    String attributevalue=passwardTB.getAttribute("class");
	    System.out.println(attributevalue);

	}

}
