package TestScript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestScript.Base;

public class TableHandling extends Base{
	
	public void tablePrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		
		WebElement ele =driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(ele.getText());
	}
	
	public void rowPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement web = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]"));
		System.out.println(web.getText());
	}
	
	public void cellPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		
		WebElement rd = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td[2]"));
		System.out.println(rd.getText());
	}
	
	public void columnPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> obj = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		for(WebElement temp:obj) {
			System.out.println(temp.getText());
			
		}
	}
		
		public void checkingData()
		{
			driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
			String input ="Ashton Cox";
			List<WebElement> obj = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
			for(WebElement temp:obj) {
				if(temp.getText().equals(input)) {
				System.out.println(temp.getText());
				System.out.println("Both are same");
			}
		}
		}
		
	

	public static void main(String[] args) {
		
		TableHandling tab = new TableHandling();
		tab.initializeBrowser();
	//	tab.tablePrinting();
	//	tab.rowPrinting();
	//	tab.cellPrinting();
	//	tab.columnPrinting();
		tab.checkingData();
	//	tab.driverQuitandClose();

	}

}
