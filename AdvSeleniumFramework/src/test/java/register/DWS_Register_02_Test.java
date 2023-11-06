package register;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class DWS_Register_02_Test extends BaseClass{
	
	@Test
	public void Register_to_the_application_with_valid_credentials() {
		registerPage.getRegisterLink().click();
		registerPage.getGenderRadioButton().click();
		registerPage.getFirstNameTF().sendKeys("usha");
		registerPage.getLastNameTF().sendKeys("naidu");
		registerPage.getEmailTF().sendKeys("ushanaiduk140@gmail.com");
		logger.log(Status.INFO,"email id entered");
		registerPage.getPasswordTF().sendKeys("usha@1404");
		registerPage.getConfirmPasswordTF().sendKeys("usha@1404");
		logger.log(Status.INFO,"password confirmed");
		
		registerPage.getRegisterButton().click();
		logger.log(Status.INFO,"successfully registered");
		
	}

}
