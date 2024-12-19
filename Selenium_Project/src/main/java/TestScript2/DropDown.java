package TestScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TestScript.Base;

public class DropDown extends Base{
	
	public void selectByVisibleText() {
		
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement drive = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select obj = new Select(drive);
		obj.selectByVisibleText("Yellow");
	}
	
	public void selectByIndex()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement msg = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select ob = new Select(msg);
		ob.selectByIndex(2);
	}
	
	public void selectByValue()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement text = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select kb = new Select(text);
		kb.selectByValue("Yellow");
		
	}
	
	public static void main(String[] args) {
		
		DropDown dropdown = new DropDown();
		dropdown.initializeBrowser();
		dropdown.selectByVisibleText();
		dropdown.selectByIndex();
		dropdown.selectByValue();
		dropdown.driverQuitandClose();
		
	}

}
