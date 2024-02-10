package dropdown;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Removeduplicatemethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();// to lounch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/SUSHANT/Desktop/webelements/multi%20dropdown.html");
		
		WebElement multiselectDD=driver.findElement(By.id("menu"));
		
		Select sel=new Select(multiselectDD);
		
		TreeSet<String> ts = new TreeSet<String>();
		List<WebElement> option = sel.getOptions();
		
		for(WebElement we : option)
		{
			String textToInsert = we.getText();
			ts.add(textToInsert);
			
		}
		for(String t:ts)
		{
			System.out.println(t);
		}

	}

}
