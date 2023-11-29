package Testcases;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethod;
import Page.LoginPage;

public class LoginTC_001 extends ProjectSpecificMethod {
   
	
	@Test
	public void runLogin() {
	LoginPage lp = new LoginPage();
    lp.enterUsername()
    .enterPassword()
    .clickLoginButton()
    .clickCrmsfaLink();
	
	
	}
}
