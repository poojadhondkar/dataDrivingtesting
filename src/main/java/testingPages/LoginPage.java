package testingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Setup {
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
      
	@FindBy (xpath="//input[@id='email']")
	WebElement username;
	public void enterusername(String user)
	{
		username.sendKeys(user);
	}
	
	@FindBy (xpath="//input[@id='pass']")
	WebElement password;
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
    }
	 
	@FindBy (xpath="//button[@id='loginbutton']")
	WebElement btnclk;
	public void clickLoginButton() throws InterruptedException
	{
		
		btnclk.click();
		Thread.sleep(100);
		
	}
	
}
