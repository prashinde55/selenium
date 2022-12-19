package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerClass1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver_win32\\chromedriver.exe");		
		//DatePicker
		// Here we enter date manually 
		
		WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();		
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);	
	
	driver.get("https://demoqa.com/date-picker");
	driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).click();
	
	
	//Here Wehave to Select The Date,Month and Year So we Have to Use SELECT CLASS
	Select selyear=new Select(driver.findElement(By.className("react-datepicker__year-select")));
		selyear.selectByVisibleText("2020");
		
		
Select selmonth =new Select(driver.findElement(By.className("react-datepicker__month-select")));	
	selmonth.selectByVisibleText("March");
	
	
driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--016']")).click();
	
 


	}


}
