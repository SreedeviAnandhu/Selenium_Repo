package TestScript;

public class NavigationCommands extends Base {
	
	public void navigation()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

	public static void main(String[] args) {
		
		NavigationCommands navigationcommands = new NavigationCommands();
		navigationcommands.initializeBrowser();
		navigationcommands.navigation();
	//	navigationcommands.driverQuitandClose();

	}

}
