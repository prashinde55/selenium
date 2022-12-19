package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAssignment {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\selenium App\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://demoqa.com/checkbox");	
		
	
	driver.findElement(By.xpath("//button[@aria-label='Expand all']")).click();
	
 driver.findElement(By.xpath("//span[contains(text(),'React')]")).click();
	
	
	//check this ElementNotInteractableException
	
	
	
	}

}
