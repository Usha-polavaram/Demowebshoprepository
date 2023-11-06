package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {

	public WishListPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(name = "removefromcart")
	public WebElement removeFromCartCheckBox;
	
	@FindBy(name = "updatecart")
	public WebElement updateWishlistButton;

	public WebElement getRemoveFromCartCheckBox() {
		return removeFromCartCheckBox;
	}

	public WebElement getUpdateWishlistButton() {
		return updateWishlistButton;
	}

}
