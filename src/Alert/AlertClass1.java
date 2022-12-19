package Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass1 {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dell\\\\Desktop\\\\selenium App\\\\chromedriver_win32\\\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demoqa.com/alerts");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			driver.findElement(By.id("alertButton")).click();
			Alert alt = driver.switchTo().alert();
			alt.accept();
			
		}

	}


