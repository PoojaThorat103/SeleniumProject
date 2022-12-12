package com.demo.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownSelection extends BaseClass{
	
	@Test
	public void DropDownTest() {
		 // Normal drop down selection 
		  driver.navigate().to("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		  WebElement inputForm =  driver.findElement(By.linkText("Input Forms"));
		  inputForm.click();
		  
		  WebElement selectDropdownList =  driver.findElement(By.linkText("Select Dropdown List"));
		  selectDropdownList.click();
		  
		  Select Day = new Select(driver.findElement(By.xpath("//*[@id=\"select-demo\"]")));
		  Day.selectByIndex(2);
	}
}
