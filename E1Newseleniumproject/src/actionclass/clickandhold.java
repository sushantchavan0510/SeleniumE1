package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickandhold {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();// to lounch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoapps.qspiders.com/ui?scenario=1");	
        
        driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click()
        driver.findElement(By.xpath("//section[text()='Click & Hold']")).click()

        WebElement clickandhold=driver.findElement(By.xpath("//div[@id='circle']"));
        
        Actions act=new Actions(driver);
        act.clickAndHold(clickandhold).perform();
        
        Thread.sleep(7000);
        driver.close();

	}

}
