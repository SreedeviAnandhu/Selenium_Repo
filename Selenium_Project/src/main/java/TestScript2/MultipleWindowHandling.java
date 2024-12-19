package TestScript2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestScript.Base;

public class MultipleWindowHandling extends Base{
	
	public void multipleWindowHandling()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		// getWindowHandle()- parent window/current window handle chyum
		// getWindowHandles()- open chyth vacherikunna yellaa windowsum handle chyum
		
		WebElement contactus = driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactus.click();
		WebElement loginportal = driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		loginportal.click();
		String parentwindow = driver.getWindowHandle();	
		System.out.println(parentwindow);
		System.out.println("*****************************************************************************************************");
		
		Set<String> allwindows = driver.getWindowHandles();
		for(String temp:allwindows) {
			System.out.println("windows"+temp);
			driver.switchTo().window(temp);
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				System.out.println("****************************************************************************************************");
		}
	}

	public static void main(String[] args) {
		
		MultipleWindowHandling multiplewindowhandling = new MultipleWindowHandling();
		multiplewindowhandling.initializeBrowser();
		multiplewindowhandling.multipleWindowHandling();
	}

}
