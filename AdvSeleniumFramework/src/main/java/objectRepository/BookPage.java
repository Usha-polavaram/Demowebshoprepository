package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BookPage {

	public BookPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
}
