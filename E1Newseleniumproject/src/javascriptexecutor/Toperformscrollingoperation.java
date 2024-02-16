package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toperformscrollingoperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();// to lounch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.selenium.dev/");	
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        
        js.executeScript("window.scrollBy(0,-500)");
        Thread.sleep(2000);
	}

}
