package objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelleryPage {
	
	public JewelleryPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "(//span[@class='PriceRange'])[2]")
	public WebElement priceFilter;

	public WebElement getPriceFilter() {
		return priceFilter;
	}
	
	@FindBy(xpath = "//span[@class='price actual-price']")
	public List<WebElement> price;

	public List<WebElement> getPrice() {
		return price;
	}
	
	@FindBy(linkText = "Black & White Diamond Heart")
	public WebElement heartJewellery;
	
	@FindBy(id = "add-to-wishlist-button-14")
	public WebElement heartJewelAddToWishListButton;
	
	@FindBy(className = "content")
	public WebElement wishlistContent;

	public WebElement getHeartJewellery() {
		return heartJewellery;
	}

	public WebElement getHeartJewelAddToWishListButton() {
		return heartJewelAddToWishListButton;
	}

	public WebElement getWishlistContent() {
		return wishlistContent;
	}
	
	
	
	
}
