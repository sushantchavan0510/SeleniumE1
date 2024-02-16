package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toscrolltillperticularwebelement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();// to lounch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.selenium.dev/");	
        
        WebElement scrolltarget = driver.findElement(By.xpath("//h2[text()='News']"));
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("argument[0],ScrollIntoView(false)",scrolltarget);

	}

}
