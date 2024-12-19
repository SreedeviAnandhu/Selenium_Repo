package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CSS_Selectors extends Base{

	public void tagAndId() // (tag#id)
	{
		WebElement singleinput = driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement buttonone = driver.findElement(By.cssSelector("button#button-one"));
		WebElement inputvalue = driver.findElement(By.cssSelector("input#value-a"));
	}
	
	public void tagAndClass() //  (tag.class)
	{
		WebElement headertop = driver.findElement(By.cssSelector("div.header-top"));
		WebElement section = driver.findElement(By.cssSelector("section.clearfix"));
		WebElement mbsec = driver.findElement(By.cssSelector("div.mb-sec"));	
	}
	
	public void tagAndAttribute() //  (tag[attribute=value])
	{
		WebElement inputfield = driver.findElement(By.cssSelector("input[id='single-input-field']"));
		WebElement button = driver.findElement(By.cssSelector("	button[id='button-one']"));
		WebElement value = driver.findElement(By.cssSelector("div[class='mb-sec']"));
		WebElement clearfix = driver.findElement(By.cssSelector("section[class='clearfix']"));
	}

	public void tagClassAndAttribute() //  (tag.classname[attribute=value]
	{
		WebElement formcontrol = driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));
		WebElement valuea = driver.findElement(By.cssSelector("	input.form-control[id='value-a']"));
		WebElement valueb = driver.findElement(By.cssSelector("input.form-control[id='value-b']"));				
	}

}
		//1.Tag and ID  (tag#id)
		//2.Tag and class  (tag.class)
		//3.Tag and Attribute  (tag[attribute=value]
		//4.Tag,class,and Attribute  (tag.classname[attribute=value] 