package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitlemethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();// to lounch chrome browser
		 Thread.sleep(2000);
	     driver.get("https://www.amazon.com/");;// to close the browser window
		 Thread.sleep(2000);
         String title=driver.getTitle();
         
         System.out.println(title);
         driver.close();
	}

}
