package TestScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestScript.Base;

public class FrameHandling extends Base{
	
	public void framehandling()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe);
		WebElement web = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		web.click();
		
		
	}

	public static void main(String[] args) {
		
		 FrameHandling  framehandling = new  FrameHandling();
		 framehandling.initializeBrowser();
		 framehandling.framehandling();
	}

}
