package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerClass2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver_win32\\chromedriver.exe");		
		//DatePicker
		// Here we enter date by using SendKeys
		
		WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();		
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);	
	
	driver.get("https://demoqa.com/date-picker");
		
	
	WebElement datepick = driver.findElement(By.id("datePickerMonthYearInput"));
	//so , in date box they already given date by default so we hve to clear that first
	
	//datepick.clear();  By using this method we can clear date
	// also by using BackSpace method we Can Clear date.
	
	
	datepick.click();
	for(int i=1;i<=10;i++) {
		
		datepick.sendKeys(Keys.BACK_SPACE);
		
	}
	datepick.sendKeys("12/11/2020");
	datepick.sendKeys(Keys.ENTER);
	
	
	
	
		
		
		
		
	}


}
