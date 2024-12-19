package TestScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestScript.Base;

public class RadioButton extends Base{
	
	public void radioButtonHandling()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement ele = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		ele.click();
		WebElement web = driver.findElement(By.xpath("//button[@id='button-one']"));
		web.click();
	}

	public static void main(String[] args) {
		
		RadioButton radiobutton = new RadioButton();
		radiobutton.initializeBrowser();
		radiobutton.radioButtonHandling();
		radiobutton.driverQuitandClose();

	}

}
