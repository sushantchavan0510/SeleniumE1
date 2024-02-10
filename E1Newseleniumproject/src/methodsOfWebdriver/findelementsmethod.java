package methodsOfWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementsmethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	    Thread.sleep(2000);
	    
	    WebElement activeEle=driver.switchTo().activeElement();
	    activeEle.sendKeys("bikes");
	    
	    List<WebElement> bikesoptions=driver.findElements(By.xpath("//div[@class='wM6W7d WggQGd']"));
	    
	    	//	for(int i=0;bikesoptions.size();i++);
	   // {
	    	//String ops=bikesoptions.get(i).getText();
	    	//System.out.println(ops);
	    //	Thread.sleep(1000);      	
	  //  }		
	    		for(WebElement we:bikesoptions);
	    {
	    	String options=we.getText();
	    	System.out.println(options);
	    	 Thread.sleep(2000);

	    }
	    
	}

}
