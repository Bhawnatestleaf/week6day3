package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CreateLeadPage  extends MyLeadsPage{
	
	public static RemoteWebDriver driver;
	
	
	public void enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	}
	
	public void enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");

    }
	public void enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		
		
	}
	public void enterPhno() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
	
	}
	public void clickSubmitButton() {
		driver.findElement(By.id("submitButton")).click();
		
	}
}