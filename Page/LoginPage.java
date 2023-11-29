package Page;

import org.openqa.selenium.By;

import Base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {

	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		LoginPage lp = new LoginPage();
		return lp;
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//LoginPage lp = new LoginPage();
		//return lp;
		return new LoginPage();
	}
	
	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	   // WelcomePage wp = new WelcomePage();
	    //return wp;
		return new WelcomePage();
	    
	
	}

	

}
