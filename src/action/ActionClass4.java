package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass4 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver_win32\\chromedriver.exe");		
		// Key Enter in TextBox
		
		WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();		
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);	
	
		driver.get("https://demoqa.com/text-box");
		Actions act=new Actions (driver);
		act.click(driver.findElement(By.id("userName"))).keyDown(Keys.SHIFT).sendKeys("hello india").release().perform();
                                             //OR
	//	act.click(driver.findElement(By.id("userName"))).keyDown(Keys.SHIFT).sendKeys("hello india").keyUp(Keys.SHIFT).perform();	
		
 boolean ghgh = iselementDisplayed(driver, driver.findElement(By.id("userName")));
	System.out.println(ghgh);
	// above step is used to find is Element is displayed or not 
		
	}
	
	
	public static boolean iselementDisplayed(WebDriver driver,WebElement el) {
		
		boolean flag = el.isDisplayed();
		return flag;
	}
	

}



