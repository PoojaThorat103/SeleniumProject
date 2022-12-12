package com.demo.action;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MultipleWindowHandlingTest extends BaseClass{

	@Test
	public void CheckWindowHandling() throws InterruptedException {
	/*// Multiple window handling 
		  driver.navigate().to("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/a")).click();
		  String parantWindow = driver.getWindowHandle();
		  
		  Set<String> chieldWindow = driver.getWindowHandles();
		  WebDriver d = null;
		  for(String win :chieldWindow ) {
			  d = driver.switchTo().window(win);
			  if(d.getTitle().contains("Twitter")){
				  break;
			  }
		  }
		  
		  Thread.sleep(5000);
		  WebElement getTitle =  d.findElement(By.xpath("//span[contains(text(), 'Want to log in first')]"));
		  System.out.println(getTitle.getText());
		  d.close();
		  
		 driver.switchTo().window(parantWindow);
		 Thread.sleep(5000);
		 System.out.println(driver.getTitle());*/
		
		
		// Multiple window handling on "https://demoqa.com/browser-windows" site
		
		driver.navigate().to("https://demoqa.com/browser-windows");
		WebElement clickOnButton = driver.findElement(By.xpath("//*[@id=\"windowButton\"]"));
		clickOnButton.click();
		
		//we get a unique ID of the current window 
		String paraentWindow = driver.getWindowHandle();
		System.out.println(paraentWindow);
		
		//To handle all opened windows which are the child windows by web driver
		Set<String> childWindow = driver.getWindowHandles();
		WebDriver d= null;
		
		for(String win: childWindow) {
			d= driver.switchTo().window(win);
			if(d.getTitle().contains("sample")) {
				break;}		
		}
		
		  Thread.sleep(5000);
		  WebElement getTitle =  d.findElement(By.id("sampleHeading"));
		  System.out.println(getTitle.getText());		 
		  d.close();
		  

		  driver.switchTo().window(paraentWindow);
	}
}
