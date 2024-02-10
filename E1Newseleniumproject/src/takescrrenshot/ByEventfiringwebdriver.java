package takescrrenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ByEventfiringwebdriver {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();// to lounch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");
        
        EventFiringWebDriver efwd=new EventFiringWebDriver(driver);
        
        File src=efwd.getScreenshotAs(OutputType.FILE);
        
        File dest=new File("./screenshots/Facebook.jpg");
        
        Files.copy(src, dest);


	}

}
