package takescrrenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Byupcastingintoremotewebdriver {

	public static void main(String[] args) throws IOException {
		RemoteWebDriver driver=new ChromeDriver();// to lounch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com/");	
        
        RemoteWebDriver rwd=(RemoteWebDriver)driver;
        
        File src=rwd.getScreenshotAs(OutputType.FILE);
        
        File dest=new File("./screenshots/FlipKart.jpg");
        
        Files.copy(src, dest);


	}

}
