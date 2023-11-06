package genericUtility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 * 
 * @author Usha
 *
 */
import org.openqa.selenium.support.ui.WebDriverWait;
public class WebDriverUtility {
	
	// first approach
//	public void clickingOnElement(WebDriver driver, WebElement element) {
//	JavascriptExecutor js=(JavascriptExecutor) driver;
//	js.executeScript("arguments[0].click()", element);
//	
//}

	private WebDriver driver;
	JavascriptExecutor js;
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
		js=(JavascriptExecutor) driver;
	}
	
	/**
	 * This method is used to click on element using javascriptexecutor
	 * @param element
	 */
	public void clickingOnElement(WebElement element) {
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	/**
	 * This method is used to enter data in a element using javascriptexecutor
	 * @param element
	 */
	public void enteringDataInElement(WebElement element,String data) {
		js.executeScript("arguments[0].value='"+data+"'",element);
	}
	
	/**
	 * This method is developed for creating a webdriverwait object
	 * @param time
	 * @return WebDriverwait reference variable
	 */
	public WebDriverWait explicitWaitReference(int time)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(time));
		return wait;
	}
	
	
	/**
	 * This method is developed to create a reference for action class
	 * @return Action  reference variable
	 */
	public Actions actionsReference()
	{
		Actions action=new Actions(driver);
		return action;
	}

	/**
	 * This method is developed to select a dropdown from single select drop down element
	 * @param dropdown
	 * @param option
	 */
	public void handleDropdown(WebElement dropdown,String option)
	{
		Select s=new Select(dropdown);
		try
		{
			s.selectByVisibleText(option);
		}
		catch (Exception e) {
			try {
				s.selectByValue(option);
			}
			catch (Exception p) {
				s.deselectByIndex(Integer.parseInt(option));
			}
		}
	}
	
	/**
	 * This method is developed to scroll the webpage to the given coordinates only once.
	 * @param x coordinate
	 * @param y coordinate
	 */
	public void scrollByWebPage(int x,int y)
	{
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	/**
	 * This method is developed to scroll the webpage to the given coordinates repeatedly.
	 * @param x coordinate
	 * @param y coordinate
	 */
	public void scrollToWebPage(int x,int y)
	{
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	/**
	 * This method is used to scroll webpage by element visibility
	 * @param element
	 * @param status
	 */
	public void scrollIntoView(WebElement element,boolean status)
	{
		js.executeScript("arguments[0].scrollIntoView("+status+")", element);
	}
	
	/**
	 * This method is used to switch the driver control from one frame to another frame using id/classname
	 * @param name
	 */
	public void switchToFrame(String name)
	{
		driver.switchTo().frame(name);
	}
	
	/**
	 * This method is used to switch the driver control from one frame to another frame using webelement
	 * @param element
	 */
	public void switchToFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	/**
	 * This method is used to switch the driver control from one frame to another frame using index values
	 * @param index
	 */
	public void switchToFrame(int index)
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * This method is used to switch the driver control from frame to window
	 */
	public void switchToParentWindow(){
		driver.switchTo().defaultContent();	
	}
	
	/**
	 * This method is returning the alert reference
	 * @return
	 */
	public Alert returnAlertReference(){
		return driver.switchTo().alert();
	}
	
	/**
	 * This method is used to switch the driver control from one window to another window 
	 * @param allWindowId
	 * @param expectedTitle
	 * @param parentId
	 */
	public void switchingToWindow(Set<String> allWindowId,String expectedTitle,String parentId){
		allWindowId.remove(parentId);
		for(String id:allWindowId) {
			driver.switchTo().window(id);
			if(expectedTitle.equalsIgnoreCase(driver.getTitle())) {
				break;
			}
		}
	}
	
	/**
	 * This method is used to switch driver control back to parent window
	 * @param parentId
	 */
	public void switchingBackToMainWindow(String parentId) {
		driver.switchTo().window(parentId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

