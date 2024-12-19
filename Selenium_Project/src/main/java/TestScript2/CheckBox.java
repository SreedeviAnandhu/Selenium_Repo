package TestScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestScript.Base;

public class CheckBox extends Base {
	
	public void checkBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement demo = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		demo.click();
	}

	public static void main(String[] args) {
		
		CheckBox checkbox  = new CheckBox ();
		checkbox.initializeBrowser();
		checkbox.checkBox();
		checkbox.driverQuitandClose();
		

	}

}
