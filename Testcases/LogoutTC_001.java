package Testcases;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethod;
import Page.LoginPage;

public class LogoutTC_001 extends ProjectSpecificMethod{
@Test
	public void runLogout() {
		
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickLogoutButton();
		
		
		
	}

}
