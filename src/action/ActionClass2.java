package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver_win32\\chromedriver.exe");		
		
		WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();		
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);	
			
	driver.get("https://demoqa.com/buttons");

	Actions act=new Actions(driver);

	act.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Book Store Application')]"))).perform();
	// this above step is perform only for to get INTERACTIONS tab visble

	act.click(driver.findElement(By.xpath("//*[contains(text(),'Interactions')]"))).perform();

	System.out.println("afterclick");





		}


	}


