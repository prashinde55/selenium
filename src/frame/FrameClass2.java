package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameClass2 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/frames");
		// by using this switchTo().frame(); we can go from one frame to another frame . 
		// otherwise driver cannot go from one frame to another frame
		
		driver.switchTo().frame("frame1");
		String mesg = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(mesg);
     driver.switchTo().defaultContent();
     // by using this ,method we can  go to main frame
     driver.findElement(By.xpath("//*[contains(text(),'Forms')]")).click();
     
	}

}
