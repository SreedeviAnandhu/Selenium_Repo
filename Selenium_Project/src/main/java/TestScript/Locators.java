package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	
	public void id()
	{
		//WebElement elementname=driver.findElement(By.Locator("locator value"));
		
		  WebElement element = driver.findElement(By.id("single-input-field"));
		  WebElement web = driver.findElement(By.id("button-one"));
		  WebElement webelement = driver.findElement(By.id("value-a"));
		  WebElement elmnt = driver.findElement(By.id("value-b"));
	}
	
	public void className()
	{
		WebElement clearfix = driver.findElement(By.className("clearfix"));
		WebElement headertop = driver.findElement(By.className("header-top"));
		WebElement mbsec = driver.findElement(By.className("mb-sec"));
	}
	
	public void name()
	{
		WebElement viewport = driver.findElement(By.name("viewport"));
		WebElement description = driver.findElement(By.name("description"));
		WebElement keywords = driver.findElement(By.name("Keywords"));
	}
	
	public void linkText()
	{
		WebElement simpleform = driver.findElement(By.linkText("Simple Form Demo"));
		WebElement checkboxdemo = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement Radiobuttons = driver.findElement(By.linkText("Radio Buttons Demo"));
	}
	
	public void partiallinkText()
	{
		WebElement demo = driver.findElement(By.partialLinkText("Simple Form"));
		WebElement demo2 = driver.findElement(By.partialLinkText("Checkbox"));
		WebElement demo3 = driver.findElement(By.partialLinkText("Radio Buttons"));
	}

	public static void main(String[] args) {
		
		 Locators locators = new  Locators (); 

	}

}
