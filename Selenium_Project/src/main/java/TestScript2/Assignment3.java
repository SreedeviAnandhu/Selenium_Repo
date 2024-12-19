package TestScript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestScript.Base;

public class Assignment3 extends Base{
	
	public void test()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> obj = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));
		for(WebElement text:obj) {
			System.out.println(text.getText());
		}
		
	}
	
	public void display()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input = "Senior Javascript Developer";
		List<WebElement> obj = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));
		for(WebElement temp:obj) {
			if(temp.getText().equals(input)) {
				System.out.println(temp.getText());
				System.out.println("Both are same");
			}
		}	
	}
	
	public void print()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement element = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[6]"));
		System.out.println(element.getText());
	}
	
	public void show()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement elemt = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[7]//td[3]"));
		System.out.println(elemt.getText());
	}

	public static void main(String[] args) {
		Assignment3 assignment = new Assignment3();
		assignment.initializeBrowser();
	//	assignment.test();
	//	assignment.display();
		//assignment.print();
		assignment.show();
	//	assignment.driverQuitandClose();
	}

}

