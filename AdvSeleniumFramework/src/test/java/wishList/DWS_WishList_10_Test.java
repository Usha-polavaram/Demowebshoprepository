package wishList;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_WishList_10_Test extends BaseClass{
	@Test
	public void add_jewel_to_wishlist() throws InterruptedException {
		homePage.getJewelryLink().click();
		jewelryPage.getHeartJewellery().click();
		jewelryPage.getHeartJewelAddToWishListButton().click();
		logger.log(Status.INFO, "product added to wishlist");
		homePage.getWishlistLink().click();
//		WebElement err = driver.findElement(By.className("content"));
//		Thread.sleep(6000);
		//System.out.println(err.getText());
		wishListPage.getRemoveFromCartCheckBox().click();
		wishListPage.getUpdateWishlistButton().click();
		
	}
}
