package com.demo.action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FrameHandling extends BaseClass{
	@Test()
	public void FrameHandlingTest() throws InterruptedException {
	 driver.navigate().to("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
	 
	 List<WebElement> f = driver.findElements(By.tagName("iframe"));
     System.out.println("Total number of frams " + f.size());
	 
	 Thread.sleep(4000);
	 driver.switchTo().frame("globalSqa");
	 System.out.println("In the frame ");
	 
	// click on any element on frame
	 driver.findElement(By.xpath("//*[@id=\"current_filter\"]")).click();
	//Switch back to the main window
	driver.switchTo().defaultContent();
	// click on any element on Main window
	driver.findElement(By.xpath("//*[@id=\"menu-item-1513\"]/a")).click();
	
	//If inner frame is there then we can not directly move on it, 1st need to go to its parant  frame than need to go to Inner frame.
	// we can directly come back on home screen from Inner frame
	
	 
} 
}
