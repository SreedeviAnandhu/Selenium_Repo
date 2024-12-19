package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver; //globally declare chythu
	
	public void initializeBrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/"); //to launch a site get method is used
		driver.manage().window().maximize(); //window maximize chyan 
		
	}

	public void driverQuitandClose()
	{
		driver.close();
		//driver.quit();
	}
	
	public static void main(String[] args) {
		
		Base base = new Base();
		base.initializeBrowser();
		base.driverQuitandClose();
	}

}
