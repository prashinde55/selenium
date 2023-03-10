package fileupload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadClass1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
	driver.get("https://demo.guru99.com/test/upload/");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("uploadfile_0")).sendKeys(System.getProperty("user.dir")+ "\\Env.properties");

		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		
		WebDriverWait wt=new WebDriverWait(driver,5);
		wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='res']/center[contains(text(),'1 file ')]")));
		String msg = driver.findElement(By.xpath("//*[@id='res']/center")).getText();
		
		System.out.println(msg);
		
	}

}


