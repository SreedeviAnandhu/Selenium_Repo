package TestScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestScript.Base;

public class AlertHandling extends Base{
	
	public void simpleAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement web = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		web.click();
		String message =driver.switchTo().alert().getText();
		System.out.println(message);
		driver.switchTo().alert().accept();
	}
	
	public void confirmationAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement ele = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		ele.click();
		driver.switchTo().alert().accept();
	//	driver.switchTo().alert().dismiss();
	}
	
	public void promptAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement msg = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		msg.click();
		driver.switchTo().alert().sendKeys("message");
		driver.switchTo().alert().accept();
	//	driver.switchTo().alert().dismiss();
		
	}

	public static void main(String[] args) {
		
		AlertHandling alerthandling = new AlertHandling();
		alerthandling.initializeBrowser();
		alerthandling.simpleAlert();
		alerthandling.confirmationAlert();
		alerthandling.promptAlert();
		alerthandling.driverQuitandClose();
		
	}

}
