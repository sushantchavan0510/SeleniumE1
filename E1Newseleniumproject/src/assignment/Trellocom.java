package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Trellocom {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();// to lounch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://trello.com/home");	
        
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("username")).sendKeys("sushantchavan2605@gmail.com");
        driver.findElement(By.xpath("//span[text()='Continue']")).click();
        driver.findElement(By.id("password")).sendKeys("Sushant@2605");
        driver.findElement(By.xpath("//span[text()='Log in']")).click();
        
        driver.findElement(By.xpath("//div[text()='E1']"));
        
        WebElement sqlsrc =driver.findElement(By.xpath("//a[text()='SQL']"));
        WebElement javasrc =driver.findElement(By.xpath("//a[text()='JAVA']"));
        WebElement manualsrc =driver.findElement(By.xpath("//a[text()='MANUAL TESTING']"));
        WebElement apisrc =driver.findElement(By.xpath("//a[text()='API']"));
        WebElement seleniumsrc =driver.findElement(By.xpath("//a[text()='SELENIUM']"));

        WebElement mockdoing =driver.findElement(By.xpath("//h2[text()='Doing']"));
       WebElement mockdone= driver.findElement(By.xpath("//h2[text()='Done']"));
       
       Actions act=new Actions(driver);
       
       act.dragAndDrop(sqlsrc, mockdone).perform();
       act.dragAndDrop(javasrc, mockdone).perform();
       act.dragAndDrop(manualsrc, mockdone).perform();
       act.dragAndDrop(seleniumsrc, mockdoing).perform();
       act.dragAndDrop(apisrc, mockdoing).perform();
        
        

	}

}
