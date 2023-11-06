package compareList;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Compare_05_Test extends BaseClass{
	
	@Test
	public void add_To_Compare_List() {
		
		homePage.getComputersLink().click();
		homePage.getDesktopLink().click();
		computerPage.getCheapComputerLink().click();
		computerPage.getAddToCompartListButton().click();
		logger.log(Status.INFO,"one product added");
		
		driver.navigate().back();
		driver.navigate().back();
		
		computerPage.getOwnComputerLink().click();
		computerPage.getAddToCompartListButton().click();
		logger.log(Status.INFO,"second product added");
		
		int count = computerPage.getRemoveButtonInCompareList().size();
		if(count==2) {
			logger.log(Status.PASS, "two products in comparelist so test case passed");
		}
		else {
			logger.log(Status.FAIL, "test case failed");
		}
	}

}
