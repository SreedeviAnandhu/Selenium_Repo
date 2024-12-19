package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestScript.Base;

public class TextBox extends Base{
	
	
	public void textBoxName()
	{
		driver.navigate().to("https://demoqa.com/text-box");
		
		WebElement name = driver.findElement(By.xpath("//input[@id='userName']"));
		name.sendKeys("Sreedevi");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("sreedevisree733@gmail.com");
		
		WebElement currentaddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		currentaddress.sendKeys("Ayodhya");
		
		WebElement permanentaddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		permanentaddress.sendKeys("Krishna Mandiram");
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		
	
	}

	public static void main(String[] args) {
		TextBox textbox = new TextBox();
		textbox.initializeBrowser();
		textbox.textBoxName();

	}

}
