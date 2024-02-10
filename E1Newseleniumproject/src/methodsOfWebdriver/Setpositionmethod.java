package methodsOfWebdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setpositionmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
	    Thread.sleep(1000);
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    
	    Point targetpoint=new Point(400,200);// to pass x and y coordinate
	    
	    driver.manage().window().setPosition(targetpoint);// to pass the coordinated to setposition method

	}

}
