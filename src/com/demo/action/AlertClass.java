package com.demo.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertClass extends BaseClass{
	
	@Test
	public void HandleAlert() throws InterruptedException, IOException {
		driver.navigate().to("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		Thread.sleep(2000);
		WebElement BtnClick = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button"));
		BtnClick.click();
		Alert alert = driver.switchTo().alert();
		String AltMsg = driver.switchTo().alert().getText();
		System.out.println("this is alert message  =  "  + AltMsg);

		
		alert.accept();
		//Convert web driver object to TakeScreenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String projLocation = System.getProperty("user.dir");
		FileUtils.copyFile(source , new File (projLocation+"//test.png"));
		
		
		
		
	}

}
