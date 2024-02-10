package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();// to lounch chrome browser
        Thread.sleep(5000);// to stop the execution for 5 sec
        driver.get("https://www.amazon.com/");;// to close the browser window
	}


}
