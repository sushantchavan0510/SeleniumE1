package dropdown;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Removingduplicateusinghashset {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();// to lounch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/SUSHANT/Desktop/webelements/multi%20dropdown.html");
		
		WebElement multiselectDD=driver.findElement(By.id("menu"));
		
		Select sel=new Select(multiselectDD);
		
		HashSet<String> hs = new HashSet<String>();
		
		List<WebElement> options = sel.getOptions();
		
		for(WebElement we:options)
		{
			String textToInsert = we.getText();
			hs.add(textToInsert);
		}
		
		for(String t : hs)
		{
			System.out.println(t);
		}

	}

}
