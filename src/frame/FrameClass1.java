package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameClass1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/nestedframes");
		driver.switchTo().frame("frame1");
		
		//driver.findElement(By.xpath("//*[contains(text(),'Parent frame')]"));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@srcdoc='<p>Child Iframe</p>']")));
		
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Child Iframe')]")).getText());

		
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[contains(text(),'Forms')]")).click();
		
	}


}
