package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import TestScript.Base;

public class Buttons extends Base{
	
	public void buttons()
	{
		driver.navigate().to("https://demoqa.com/buttons");
		WebElement ele = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Actions actions = new Actions(driver);
		actions.doubleClick(ele);
	
	}
	public static void main(String[] args) {
		Buttons buttons = new Buttons();
		buttons.initializeBrowser();
		buttons.buttons();

	}

}
