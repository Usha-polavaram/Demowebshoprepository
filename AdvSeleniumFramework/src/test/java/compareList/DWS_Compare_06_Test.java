package compareList;


import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Compare_06_Test extends BaseClass {
	@Test
	public void remove_Product_From_CompareList() {
		
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
	
		for(WebElement element:computerPage.getRemoveButtonInCompareList())
		{
			try {
		        element.click();
		    } catch (StaleElementReferenceException e) {
		        element = driver.findElement(By.xpath("//input[@value='Remove']"));
		        element.click();
		    	e.getMessage();
		    }
		}
	}

}
