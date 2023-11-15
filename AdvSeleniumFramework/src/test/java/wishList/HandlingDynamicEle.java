package wishList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDynamicEle {
	@Test
	public void app() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/table/dynamic-table");
        
        WebElement ele = driver.findElement(By.xpath("//td[@class=\"px-6 py-4 font-bold text-black\"]"));
        String value= ele.getText();
        System.out.println(value);
        driver.quit();
	}
}
