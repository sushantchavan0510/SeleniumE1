package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getoptionmethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();// to lounch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/SUSHANT/Desktop/webelements/multi%20dropdown.html");
		
		WebElement multiselectDD=driver.findElement(By.id("menu"));
		
		Select sel=new Select(multiselectDD);
		
		List<WebElement> option=sel.getOptions();
		for(int i=0;i<option.size();i++)
		{
			String op=option.get(i).getText();
			System.out.println(op);
			System.out.println();
			
			for(WebElement we:option)
				String ops = we.getText();
			System.out.println(ops);
			
		}

	}

}
