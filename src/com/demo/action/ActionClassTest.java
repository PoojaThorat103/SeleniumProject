package com.demo.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassTest extends BaseClass{
	
	@Test
	public void KeybordAction() throws InterruptedException
	{
		driver.navigate().to("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		Thread.sleep(4000);

		Actions actions = new Actions(driver); 
		WebElement Name= driver.findElement(By.xpath("//*[@id=\"user-message\"]"));
		Action command = actions.moveToElement(Name).click(Name).keyDown(Name, Keys.SHIFT).sendKeys(Name, "sahil").keyUp(Name, Keys.SHIFT).build();		
		command.perform();
		
				
		//----------------//
		
		WebElement value1 = driver.findElement(By.xpath("//*[@id=\"sum1\"]"));
		Action enterValue = actions.moveToElement(value1).click(value1).keyDown(value1, Keys.SHIFT).sendKeys(value1, "pooja").keyUp(value1, Keys.SHIFT).build();
		enterValue.perform();
}

	
}