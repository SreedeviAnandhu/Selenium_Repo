package TestScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestScript.Base;

public class Assignment1 extends Base{
	
	public void test()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radio1.click();
		if(radio1.isSelected())
		{
			System.out.println("Radio Button is already Selected");
		}
		else
		{
			radio1.click();
			System.out.println("Radio button is selected");
		}
		
	}

	public static void main(String[] args) {
		
		Assignment1 assignment = new Assignment1();
		assignment.initializeBrowser();
		assignment.test();
	//	assignment.driverQuitandClose();

	}

}
