package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestScript.Base;

public class CheckBox extends Base{
	
	public void checkbox()
	{
		driver.navigate().to("https://demoqa.com/checkbox");
		
		WebElement check = driver.findElement(By.className("rct-icon rct-icon-uncheck"));
		check.click();
	}

	public static void main(String[] args) {
		CheckBox checkbox = new CheckBox();
		checkbox.initializeBrowser();
		checkbox.checkbox();

	}

}
