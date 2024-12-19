package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AxcessMethod extends Base{
	
	public void parent()
	{
		WebElement locateparent = driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
	}
	
	public void child()
	{
		WebElement locatechild = driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//child::ul"));
	}
	
	public void followingSibling() //Selects all siblings after the current node
	{
		WebElement locatesibling = driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div"));
	}

	public void following() //athine follow chyth thazhott varunna ellam 
	{
		WebElement following = driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-two']"));
	}
	
	public void preceding() //Selects all nodes that appear before the current node
	{
		WebElement preceding = driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='header-top']"));
	}
	
	public void ancestor() //select chythirikunnathinta parent grandparent like ancestors ellam varum 
	{
		WebElement ancestor = driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='card']"));
	}
	
	public void descendant() //Selects all descendants (children, grandchildren, etc.) of the current node
	{
		WebElement descendant = driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//descendant::li"));
	}
	
	public void indexing()
	{
		WebElement indexing = driver.findElement(By.xpath("(//div[@id='collapsibleNavbar']//descendant::li)[3]"));
	}
	

}
