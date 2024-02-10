package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();// to lounch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoapps.qspiders.com/ui?scenario=1");	
        
        driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
        driver.findElement(By.xpath("//section[text()='Drag & Drop']"));
        driver.findElement(By.partialLinkText("Drag Position")).click();
        
        WebElement mobilechargersource= driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
        WebElement laptopchargersource= driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
        WebElement mobilecoversource= driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
        WebElement laptopcoversource= driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
        
        WebElement mobileAccessoriestarget= driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
        WebElement laptopAccessoriestarget= driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
        
        Actions act=new Actions(driver);
        
        act.dragAndDrop(mobilecoversource, mobileAccessoriestarget).perform();
        act.dragAndDrop(laptopchargersource, laptopAccessoriestarget).perform();
        act.dragAndDrop(mobilecoversource, mobileAccessoriestarget).perform();
        act.dragAndDrop(mobilecoversource, laptopAccessoriestarget).perform();

        
        


	}

}
