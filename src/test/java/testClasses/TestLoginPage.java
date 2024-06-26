package testClasses;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testingPages.LoginPage;
import testingPages.ReadData;
import testingPages.Setup;

public class TestLoginPage extends Setup{
	
	public  LoginPage login;
	public ReadData read;
	
	
	 @Test  (dataProvider = "login")
	public void login(String user1,String pass1) throws InterruptedException
	{
		login=new LoginPage();
		login.enterusername(user1);
		login.enterPassword(pass1);
		login.clickLoginButton();
	}
	
	
	@DataProvider (name = "login")	 
	public String[][] loginData () throws IOException {
		 read = new ReadData ();
		 
		int p= read.lastRowN(0);
		int q = read.lastCellN(0, 1);
		
		String loginData [][] = new String [p][q];
		
		for (int i =1; i<=p ; i++) {
			for (int j=0; j<q ; j++) {
				
				loginData [i-1][j]= read.readExcellData(0, i, j);
			}		
		}
		return loginData;
	 }
	 
	

}
