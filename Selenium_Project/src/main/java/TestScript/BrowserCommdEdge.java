package TestScript;

public class BrowserCommdEdge extends BaseEdge{
	
	public void  browserCommands()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String page = driver.getPageSource();
		System.out.println(page);
	}

	public static void main(String[] args) {
		
		BrowserCommdEdge browsercommdedge = new BrowserCommdEdge();
		browsercommdedge.initializeBrowser();
		browsercommdedge.browserCommands();
		browsercommdedge.driverQuitandClose();

	}

}
