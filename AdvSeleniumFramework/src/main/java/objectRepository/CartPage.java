package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getLaptopAddTocartButton() {
		return laptopAddTocartButton;
	}

	public WebElement getCartLink() {
		return cartLink;
	}

	@FindBy(xpath = "//a[contains(text(),'14.1-inch Laptop')]/../..//input[@value='Add to cart']")
	public WebElement laptopAddTocartButton;
	
	@FindBy(linkText = "Books")
	public WebElement booksLinkInHomePage;
	
	@FindBy(xpath = "//a[contains(text(),'Computing and Internet')]/../..//input[@value='Add to cart']")
	public WebElement bookAddTocartButton;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	public WebElement cartLink;
	
	@FindBy(linkText = "14.1-inch Laptop")
	public WebElement laptopLink;

	public WebElement getLaptopLink() {
		return laptopLink;
	}
	
	public WebElement getBooksLinkInHomePage() {
		return booksLinkInHomePage;
	}

	public WebElement getBookAddTocartButton() {
		return bookAddTocartButton;
	}

	public WebElement getBookLinkInCartModule() {
		return bookLinkInCartModule;
	}

	@FindBy(linkText ="Computing and Internet")
	public WebElement bookLinkInCartModule;

}
