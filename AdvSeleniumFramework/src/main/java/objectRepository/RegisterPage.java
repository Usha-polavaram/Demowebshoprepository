package objectRepository;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText = "Register")
	public WebElement registerLink;
	
	@FindBy(id = "gender-female")
	public WebElement genderRadioButton;
	
	@FindBy(id = "FirstName")
	public WebElement firstNameTF;
	
	@FindBy(id = "LastName")
	public WebElement lastNameTF;
	
	@FindBy(id = "Email")
	public WebElement emailTF;
	
	@FindBy(id = "Password")
	public WebElement passwordTF;
	
	@FindBy(id = "ConfirmPassword")
	public  WebElement confirmPasswordTF;
	
	@FindBy(id = "register-button")
	public WebElement registerButton;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getGenderRadioButton() {
		return genderRadioButton;
	}

	public WebElement getFirstNameTF() {
		return firstNameTF;
	}

	public WebElement getLastNameTF() {
		return lastNameTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getConfirmPasswordTF() {
		return confirmPasswordTF;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

}
