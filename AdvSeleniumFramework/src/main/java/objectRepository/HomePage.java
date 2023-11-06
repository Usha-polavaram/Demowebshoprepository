package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText = "Computers")
	public WebElement computersLink;
	
	@FindBy(linkText = "Desktops")
	public WebElement desktopLink;

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getDesktopLink() {
		return desktopLink;
	}
	
	@FindBy(linkText = "Jewelry")
	public WebElement jewelryLink;

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	@FindBy(linkText = "14.1-inch Laptop")
	public WebElement lapLinkHomePage;

	public WebElement getLapLinkHomePage() {
		return lapLinkHomePage;
	}
	
	@FindBy(className = "ico-wishlist")
	public WebElement wishlistLink;

	public WebElement getWishlistLink() {
		return wishlistLink;
	}
}
