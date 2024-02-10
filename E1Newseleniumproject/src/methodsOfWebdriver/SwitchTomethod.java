package methodsOfWebdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTomethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();// to lounch chrome browser
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://www.google.co.in/");
		 Thread.sleep(2000);
		 
		 driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		 
	}

}

