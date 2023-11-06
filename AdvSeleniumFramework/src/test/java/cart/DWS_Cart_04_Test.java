package cart;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class DWS_Cart_04_Test extends BaseClass{
	
	@Test
	public void Add_Book_ToCartAnd_VerifyInCart() {
		cartPage.getBooksLinkInHomePage().click();
		cartPage.getBookAddTocartButton().click();
		logger.log(Status.INFO, "product added to cart");
		cartPage.getCartLink().click();
		boolean visibility = cartPage.getBookLinkInCartModule().isDisplayed();
		assertTrue(visibility);
		logger.log(Status.INFO, "product is available in cart");
		
	}

}
