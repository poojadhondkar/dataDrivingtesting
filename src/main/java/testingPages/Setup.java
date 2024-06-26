package testingPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Setup {
    
	public static WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
	    
		String url="https://www.facebook.com/login/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
	}
	
//	public void teardown() throws InterruptedException
//	{
//		Thread.sleep(1000);
//		driver.close();
//	}
//	
//	
}
