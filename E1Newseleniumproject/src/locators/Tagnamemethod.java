package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagnamemethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/SUSHANT/Desktop/webelements/text.html");
	    Thread.sleep(2000);
	    
	    
	   WebElement textbox=driver.findElement(By.tagName("input"));//find passward textfield on the webpage
	   textbox.sendKeys("manager");// to pass the input to passward textfield.
	   
	   // note=inputs are passed to username textfield because it is the 1st element desiged with input tag
	}

}
