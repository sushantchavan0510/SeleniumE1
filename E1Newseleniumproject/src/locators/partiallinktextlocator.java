package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallinktextlocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    
	    WebElement partoflink=driver.findElement(By.partialLinkText("Forgotten"));// to locate Forgotten passward? link
	    partoflink.click();// to click on Forgotten passward? link
	}

}
