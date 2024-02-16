package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tohandledisableelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();// to lounch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoapps.qspiders.com/ui?scenario=1");
        
        driver.findElement(By.xpath("//li[text()='Disabled']")).click();
        Thread.sleep(1000);
        
        WebElement disabledtextbox = driver.findElement(By.id("name"));
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        
        js.executeScript("document.getElementById('name').value='admin'");
        Thread.sleep(5000);

        
        // to clear the content from a disabled textbox
        js.executeScript("document.getElementById('name').value=''");

        //js.executeScript("argument[0].value=''",)
        
	}

}
