package testingPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Setup {
    
	public static WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
	    
		String url="https://www.facebook.com/login/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void teardown() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.close();
	}
	
	
}
