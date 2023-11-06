package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText = "Log in")
	public WebElement loginLink;
	
	@FindBy(id = "Email")
	public WebElement emailTF;
	
	@FindBy(id = "Password")
	public WebElement passwordTF;
	
	@FindBy(xpath = "//input[@value='Log in']")
	public WebElement loginButton;

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
