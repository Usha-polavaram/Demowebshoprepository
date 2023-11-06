package objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage {
	
	public ComputerPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText = "Build your own cheap computer")
	public WebElement cheapComputerLink;

	@FindBy(linkText = "Build your own computer")
	public WebElement ownComputerLink;
	
	@FindBy(xpath = "//input[@value='Add to compare list']")
	public WebElement addToCompartListButton;

	@FindBy(xpath = "//input[@value='Remove']")
	public List<WebElement> removeButtonInCompareList;

	public WebElement getCheapComputerLink() {
		return cheapComputerLink;
	}

	public WebElement getOwnComputerLink() {
		return ownComputerLink;
	}

	public WebElement getAddToCompartListButton() {
		return addToCompartListButton;
	}

	public List<WebElement> getRemoveButtonInCompareList() {
		return removeButtonInCompareList;
	}

	@FindBy(xpath = "//input[@value='Email a friend']")
	public WebElement emailAFriend;

	public WebElement getEmailAFriend() {
		return emailAFriend;
	}
	
	public WebElement getReceiverEmail() {
		return receiverEmail;
	}

	public WebElement getSenderEmail() {
		return senderEmail;
	}

	@FindBy(id ="FriendEmail")
	public WebElement receiverEmail;

	@FindBy(id="YourEmailAddress")
	public WebElement senderEmail;

	@FindBy(name = "send-email")
	public WebElement sendEmailButton;

	public WebElement getSendEmailButton() {
		return sendEmailButton;
	}

	@FindBy(className = "validation-summary-errors")
	public WebElement errorMsg;

	public WebElement getErrorMsg() {
		return errorMsg;
	}
}
