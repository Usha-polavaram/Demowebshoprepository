package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
/**
 * 
 * @author Usha
 *
 */
public class TakeScreenshotUtility {
	
		WebDriver driver;
		TakesScreenshot ts;
		public TakeScreenshotUtility(WebDriver driver) {
			this.driver=driver;
			ts=(TakesScreenshot)driver;
		}
		
		/**
		 * 
		 * This method captures a screenshot and appends the current times to the filename.
		 * To obtain the present time, it uses `LocalDateTime.now()`, converts it to a string, and replaces colons (":") with hyphens ("-") to ensure a valid filename.
		 * The method constructs a file path that integrates the user's directory to store the screenshot within a specified directory.
		 * The user directory is retrieved using `System.getProperty("user.dir")`.
		 * 
		 * @param screenshotname
		 * @return path of screenshot along with directory
		 */
	public String capturingScreenshot(String screenshotname) {
		File photo = ts.getScreenshotAs(OutputType.FILE);
		String time = LocalDateTime.now().toString().replace(":", "-");
		String directory = System.getProperty("user.dir");
		String path=""+directory+"./target/errorshots/"+screenshotname+" "+time+".png";
		File destination=new File(path);
		try {
			FileUtils.copyFile(photo, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}
}
