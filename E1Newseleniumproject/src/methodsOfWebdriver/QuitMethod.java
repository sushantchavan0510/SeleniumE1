package methodsOfWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    Thread.sleep(1000);
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    
	    driver.get("https://omayo.blogspot.com/");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("Open a popup window")).click();
	    Thread.sleep(1000);
	    
	    driver.quit();

	}

}
