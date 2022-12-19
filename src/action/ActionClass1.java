package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass1 {

	public static void main(String[] args) {

	
			
			
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver_win32\\chromedriver.exe");		
			
			WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;
			
			                   
		//PropertyHelper ph=new PropertyHelper("Env.properties");
		driver.get("https://demoqa.com/buttons");
//		driver.navigate().to(ph.getKeyValueFromProperty("BaseURL")+"buttons)");
		               //OR Another Method 
			//driver.findElement(By.xpath("//*[@id='doubleClickBtn']")).click();
			
		Actions act=new Actions(driver);
		
		act.doubleClick(driver.findElement(By.xpath("//*[@id='doubleClickBtn']"))).click().perform();
		
		act.contextClick(driver.findElement(By.xpath("//*[@id='rightClickBtn']"))).click().perform();
		act.moveToElement(driver.findElement(By.xpath("//button[starts-with(text(),'Click Me')]"))).click().perform();
		
		
		
		}


	}


