package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base{
	
	public void basicXpath()
	{
		//1.xpath //tag[@attribute='value']
		//--realtive Xpath
		//:select current node,@ select attribute
		
		WebElement singleinput = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement button = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement input = driver.findElement(By.xpath("//input[@id='value-a']"));
		
	}
	
	public void contains()
	{
		//contains   //tag[contains(@attribute,'value')]
		
		WebElement field = driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		WebElement one = driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
		WebElement drivr = driver.findElement(By.xpath("//input [contains(@id,'value-a')]"));
	}
	
	public void startsWith()
	{
		// startsWith()  //tag[starts-with(@attribute,'value')]
		
		WebElement starts = driver.findElement(By.xpath("//input[starts-with(@id,'single-input-field')]"));
		WebElement with = driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
		WebElement valuea = driver.findElement(By.xpath("//button[starts-with(@id,'button-one')]"));
	}
	
	public void text()
	{
		//	text()   //tag[text()='text']
		
		WebElement message = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement enter = driver.findElement(By.xpath("//label[text()='Enter Message']"));
		WebElement show = driver.findElement(By.xpath("//button[text()='Get Total']"));
	} 
	
	public void or()
	{
		//or()   //tag[@attribute='value' or @attribute='value']
		
		WebElement value = driver.findElement(By.xpath("//input[@id='gridCheck' or @class='form-check-input']"));
	}
	
	public void and()
	{
		//and()   //tag[@attribute='value' and @attribute='value']
		WebElement val = driver.findElement(By.xpath("//input [@id='single-input-field' and @class='form-control']"));
		WebElement tex = driver.findElement(By.xpath("//button [@id='button-one' and @class='btn btn-primary']"));
		WebElement btn = driver.findElement(By.xpath("//div [@id='message-one' and @class='my-2']"));
	}

}
