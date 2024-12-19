package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseEdge {
	
	public WebDriver driver;
	
	public void initializeBrowser()
	{
		driver = new EdgeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
	}
	
	public void driverQuitandClose()
	{
		driver.close();
	}

	public static void main(String[] args) {
		
		BaseEdge basefirefox = new BaseEdge();
		basefirefox.initializeBrowser();
		basefirefox.driverQuitandClose();
		
	}

}
