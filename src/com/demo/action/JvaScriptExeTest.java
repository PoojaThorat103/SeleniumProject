package com.demo.action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JvaScriptExeTest extends BaseClass{

	@Test
	public void JavaTest() throws InterruptedException {
		driver.navigate().to("https://www.seleniumeasy.com/test/input-form-demo.html");
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("alert('Hi');");

		
		String title = js.executeScript("return document.title;").toString();	
		System.out.println("this is title =  " + title);
		
		String url = js.executeScript("return document.URL;").toString();
		System.out.println("this is url = " +url);
		
		String domain = js.executeScript("return document.domain;").toString();
		System.out.println("this is domain = "+domain);
		
		js.executeScript("window.location = 'https://www.google.com/';");
		
		WebElement click = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		js.executeScript("arguments[0].click();",click);
		
		WebElement loginClick = driver.findElement(By.id(""));
		js.executeScript("arguments[0].click();", click);
		
		
		js.executeScript("arguments[0].value= 'sahil';" ,click);
		
		js.executeScript("window.scrollBy(0,800);");
		Thread.sleep(4000);
		js.executeScript("history.go(0);");
		
		
		
	}
}
