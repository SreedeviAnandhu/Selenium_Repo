package TestScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestScript.Base;

public class Assignment2 extends Base {
	
	public void display()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement driv = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		driv.click();
		if(driv.isSelected())
		{
			System.out.println("CheckBox is already selected");
		}
		else {
			driv.click();
			System.out.println("CheckBox is selected");
		}
	}
	 

	public static void main(String[] args) {
		
		Assignment2 ob = new Assignment2();
		ob.initializeBrowser();
		ob.display();
	//	ob.driverQuitandClose();


	}

}
