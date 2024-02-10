package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();// to lounch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/SUSHANT/Desktop/webelements/multi%20dropdown.html");
		
		WebElement multiselectDD=driver.findElement(By.id("menu"));
		
		Select sel=new Select(multiselectDD);
		
		for(int i=1;i<=3;i++)
		{
			sel.selectByIndex(i);
		}
		 List<WebElement> allselectedoption = sel.getAllSelectedOptions();
		
		for(WebElement we:allselectedoption)
		{
			String selectedoptions=we.getText();
			System.out.println(selectedoptions);
		}
	}

}
