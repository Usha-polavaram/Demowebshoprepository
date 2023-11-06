package compareList;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Price_07_Test extends BaseClass{
	@Test
	public void filter_Check_Price() throws InterruptedException {
		homePage.getJewelryLink().click();
		jewelryPage.getPriceFilter().click();
		List<WebElement> amount = jewelryPage.getPrice();
		for(WebElement ele:amount) {
			String values = ele.getText();
            double doubleValue = Double.parseDouble(values);
            int intValue = (int) doubleValue; 
            //System.out.println(intValue);
            if(intValue<500) {
            	logger.log(Status.PASS, "the test case passed as price less than 500");
            }
            else {
            	logger.log(Status.FAIL, "the test case failed as price greater than 500");
            }
        
		}
		
	}

}
