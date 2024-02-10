package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlocation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-35h3bh9b/login.do");
	    Thread.sleep(2000);
	    
	    WebElement loginbutton=driver.findElement(By.id("loginbutton"));
        Point point=loginbutton.getLocation();
        int X_axis=point.getX();
        int y_axis=point.getY();
        System.out.println("X axis is :"+X_axis+" "+"y axis is :"+y_axis);
	}

}
