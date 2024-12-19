package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestSample extends Base{
	
	public void getText()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement entermessage = driver.findElement(By.id("single-input-field"));
		entermessage.sendKeys("sree");
		WebElement message = driver.findElement(By.id("button-one"));
		message.click();
	}
	
	public void loadText()
	{
		WebElement element = driver.findElement(By.id("value-a"));
		element.sendKeys("4");
		WebElement web = driver.findElement(By.id("value-b"));
		web.sendKeys("6");
		WebElement webelemnt = driver.findElement(By.id("button-two"));
		webelemnt.click();
	}

	public static void main(String[] args) {
		
		TestSample testsample = new TestSample();
		testsample.initializeBrowser();
		testsample.getText();
		testsample.driverQuitandClose();
	}

}
