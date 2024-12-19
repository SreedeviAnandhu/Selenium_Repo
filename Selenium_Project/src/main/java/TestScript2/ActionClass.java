package TestScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import TestScript.Base;

public class ActionClass extends Base {
	
	public void actionclass()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		//click, doubleClick, contextClick, moveToElement(mouseover),dragAndDrop
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	
		WebElement drg = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		
		Actions actions = new Actions(driver);
	//	actions.moveToElement(drg);
	//	actions.doubleClick(drg);
	//	actions.contextClick(drg);
		actions.dragAndDrop(ele, drg);
	}

	public static void main(String[] args) {
		
		ActionClass actionclass = new ActionClass();
		actionclass.initializeBrowser();
		actionclass.actionclass();
		

	}

}
