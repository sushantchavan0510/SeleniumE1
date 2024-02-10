package takescrrenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class bydowncasting {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();// to lounch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.flipkart.com/");	
        
        RemoteWebDriver rwd=(RemoteWebDriver)driver;
        
        File src=rwd.getScreenshotAs(OutputType.FILE);
        
        File dest=new File("./screenshots/FlipKart.jpg");
        
        Files.copy(src, dest);

	}

}
