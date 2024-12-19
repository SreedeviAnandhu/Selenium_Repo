package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseFirefox {
	
	public WebDriver driver;
	
	
   public void initializeBrowser()
   {
	   driver = new FirefoxDriver();
	   driver.get("https://selenium.qabible.in/");
	   driver.manage().window().maximize();
	   
   }
   
   public void driverQuitandClose()
	{
		driver.close();
		
	}

	public static void main(String[] args) {
		
		BaseFirefox basefirefox = new BaseFirefox();
		basefirefox.initializeBrowser();
		basefirefox.driverQuitandClose();
	}

}
