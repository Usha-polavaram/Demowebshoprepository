package wishList;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)

public class DWS_WishList_09_Test extends BaseClass{
	
	@Test
	public void add_jewel_to_wishlist() {
		homePage.getJewelryLink().click();
		jewelryPage.getHeartJewellery().click();
		jewelryPage.getHeartJewelAddToWishListButton().click();
		logger.log(Status.INFO, "product added to wishlist");
		homePage.getWishlistLink().click();
		boolean visibility = jewelryPage.getHeartJewellery().isDisplayed();
		assertTrue(visibility);
		logger.log(Status.INFO, "product is visible in wishlist");
	}

}
