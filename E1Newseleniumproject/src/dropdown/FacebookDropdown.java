package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();// to lounch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(null);	
        
		WebElement daydropdown=driver.findElement(By.id("day"));
		WebElement monthdropdown=driver.findElement(By.id("month"));
		WebElement yeardropdown=driver.findElement(By.id("year"));
		
		Select dayselect=new Select(daydropdown);
		boolean result=dayselect.isMultiple();
		System.out.println("day dropdown is multiple :" +result);
        
		List<WebElement> dayoptions=dayselect.getOptions();
		for(WebElement we:dayoptions)
		{
			System.out.println(we.getText());
		}
        dayselect.selectByIndex(5);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println();
        
	}
	    Select monthselect=new Select(monthdropdown);
	    boolean result2= monthselect.isMultiple();
	   

		}
	
	
	
	
	
	
	
	
	
	
	

}
