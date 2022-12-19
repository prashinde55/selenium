package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerREDBus {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.redbus.in/bus-tickets");
		
	WebElement src = driver.findElement(By.xpath("//input[@id='txtSource']"));
	src.sendKeys("Pune");
	src.sendKeys(Keys.ENTER);
	
		WebElement des = driver.findElement(By.xpath("//input[@id='txtDestination']"));
		des.sendKeys("Mumbai");
		des.sendKeys(Keys.ENTER);
		WebElement dte = driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']"));
		dte.sendKeys("13-Jan-2023");
		dte.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[@class='D120_search_btn searchBuses']")).click();
	}

}
