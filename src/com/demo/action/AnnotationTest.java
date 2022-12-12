package com.demo.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AnnotationTest extends BaseClass{
	@Test
	public void ChekAnnotation() throws InterruptedException {
		
		driver.navigate().to("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		Thread.sleep(5000);
		driver.findElement(By.id("sum1")).sendKeys("10");
		Thread.sleep(5000);
		driver.navigate().to("https://www.seleniumeasy.com/test/basic-first-form-demo.html#");
		Thread.sleep(5000);
		driver.findElement(By.linkText("All Examples")).click();
		
		driver.findElement(By.partialLinkText("Examples")).click();

		WebElement ele = driver.findElement(By.className("form-control"));
		ele.sendKeys("aaa");
	}

}
