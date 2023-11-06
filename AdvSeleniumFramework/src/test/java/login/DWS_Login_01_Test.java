package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Login_01_Test extends BaseClass{
	@Test
	public void Login_to_application_with_valid_credentials() {
		loginPage.getLoginLink().click();
		logger.log(Status.INFO, "user clicked on login link");
		//loginPage.getEmailTF().sendKeys("selg");
		loginPage.getEmailTF().sendKeys(property.getDataFromPropertyFile("un"));
		
		logger.log(Status.INFO, "user entered username");
		//loginPage.getPasswordTF().sendKeys("37g");
		loginPage.getPasswordTF().sendKeys(property.getDataFromPropertyFile("pwd"));
		logger.log(Status.INFO, "user entered password");
		loginPage.getLoginButton().click();
	}

}
