package Page;

import org.openqa.selenium.By;

import Base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod {
	

	public MyHomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}
	
	public LoginPage clickLogoutButton() {
		System.out.println("Logout successfull");
		return new LoginPage();
		
	}
	
	public WelcomePage verifyingLoginPage() {
		System.out.println("Login successfull");
		return this;
		
}
}
