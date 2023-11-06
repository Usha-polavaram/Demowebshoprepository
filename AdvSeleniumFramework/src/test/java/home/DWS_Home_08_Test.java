package home;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Home_08_Test extends BaseClass {
	
	@Test
	public void Capture_Error_Msg() throws InterruptedException {
		homePage.getLapLinkHomePage().click();
		computerPage.getEmailAFriend().click();
		computerPage.getReceiverEmail().sendKeys("usha.rani.chi12@gmail.com");
		computerPage.getSenderEmail().sendKeys("usha.rani.chi12@gmail.com");
		computerPage.getSendEmailButton().click();
		String expectedMsg = "Only registered customers can use email a friend feature";
		String msg = computerPage.getErrorMsg().getText();
		
		if(expectedMsg.equalsIgnoreCase(msg)) {
			logger.log(Status.PASS, "test case passed as msg matches");
		}
		else
		{
			logger.log(Status.FAIL, "test case failed as mag doesnt match");
		}
	}
}
