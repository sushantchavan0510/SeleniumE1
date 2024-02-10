package methodsOfWebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsizemethod {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
	    Thread.sleep(1000);
	    driver.manage().window().maximize();
	    Thread.sleep(1000);

	   Dimension targetsize=new Dimension(700,200); //to pass width and height to dimension class
	   driver.manage().window().setSize(targetsize);// to pass the dimension to setsize method
	    
	}

}
