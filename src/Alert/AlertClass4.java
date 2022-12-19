package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass4 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\selenium App\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("promtButton")).click();
		
	Alert alt = driver.switchTo().alert();
		
	 alt.sendKeys("Hello GoodMorning");
		String stralt = alt.getText();
		System.out.println(stralt);
	alt.accept();	
		
		

	}


}
