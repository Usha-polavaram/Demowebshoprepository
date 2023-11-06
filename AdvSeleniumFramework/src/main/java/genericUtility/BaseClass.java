package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.BookPage;
import objectRepository.CartPage;
import objectRepository.ComputerPage;
import objectRepository.HomePage;
import objectRepository.JewelleryPage;
import objectRepository.LoginPage;
import objectRepository.RegisterPage;
import objectRepository.WishListPage;

public class BaseClass implements IAutoConstants {

	public static WebDriver driver;
	public static PropertyUtility property;
	public static TakeScreenshotUtility screenshot;
	public static WebDriverUtility webdriverUtility;
	public static DatabaseUtility dbUtility;
	public static JavaUtility javaUtility;
	public static ExtentTest logger;

	
	public LoginPage loginPage;
	public RegisterPage registerPage;
	public CartPage cartPage;
	public HomePage homePage;
	public BookPage bookPage;
	public ComputerPage computerPage;
	public JewelleryPage jewelryPage;
	public WishListPage wishListPage;
	
	@BeforeClass(alwaysRun = true)
	public void launchingBrowserAndNavigateToApp()
	{
		property=new PropertyUtility();

		if(Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		}
		else if (Browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if (Browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.get(property.getDataFromPropertyFile("url"));

		screenshot=new TakeScreenshotUtility(driver);
		webdriverUtility=new WebDriverUtility(driver);
		dbUtility=new DatabaseUtility();
		javaUtility=new JavaUtility();
	}

	@BeforeMethod(alwaysRun = true)
	public void loginToApplication()
	{
		loginPage=new LoginPage(driver);
		registerPage=new RegisterPage(driver);
		cartPage=new CartPage(driver);
		homePage=new HomePage(driver);
		bookPage=new BookPage(driver);
		computerPage=new ComputerPage(driver);
		jewelryPage=new JewelleryPage(driver);
		wishListPage=new WishListPage(driver);
		
		System.out.println("logged in to application");
	}

	@AfterMethod(alwaysRun = true)
	public void logoutFromApplication()
	{
		System.out.println("logged out from application");	
	}

	@AfterClass(alwaysRun = true)
	public void tearDownTheBrowser() {
		driver.quit();
	}


}	