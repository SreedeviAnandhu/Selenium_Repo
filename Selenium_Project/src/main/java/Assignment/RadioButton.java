package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestScript.Base;

public class RadioButton extends Base {
	
	public void radioButton()
	{
		driver.navigate().to("https://demoqa.com/radio-button");
		WebElement web = driver.findElement(By.xpath("//label[@class='custom-control-label']"));
		web.click();
	}

	public static void main(String[] args) {
		RadioButton radiobutton = new RadioButton();
		radiobutton.initializeBrowser();
		radiobutton.radioButton();

	}

}
