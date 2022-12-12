package com.demo.action;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class TestPractice1 extends BaseClass {
	
  @Test
  public void InputForm() throws InterruptedException {
	 Thread.sleep(3000);
	  WebElement inputForm =  driver.findElement(By.linkText("Input Forms"));
	  inputForm.click();
	  
	  Thread.sleep(4000);
	  WebElement SelectDropdown =  driver.findElement(By.linkText("Input Form Submit"));
	  SelectDropdown.click();	
	  
	  Thread.sleep(3000);
	  WebElement FirstName =  driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input"));
	  FirstName.sendKeys("Pooja");
	 
	  WebElement LastName =  driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input"));
	  LastName.sendKeys("THUL");
	    
	  WebElement Email =  driver.findElement(By.name("email"));
	  Email.sendKeys("test@1234");
	  
	  WebElement PhoneNo =  driver.findElement(By.name("phone"));
	  PhoneNo.sendKeys("2345456789");
	  
	  WebElement City =  driver.findElement(By.name("city"));
	  City.sendKeys("puneffsf");
	   
	  WebElement state =  driver.findElement(By.name("state"));
	  state.sendKeys("MAHARASTHRA");
	  
	  WebElement zip =  driver.findElement(By.name("zip"));
	  zip.sendKeys("41117");
	  
	  WebElement website =  driver.findElement(By.name("website"));
	  website.sendKeys("SiteName");
	  
	  WebElement YesButton =  driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[1]/label"));
	  YesButton.click();
	  
	  WebElement comment =  driver.findElement(By.name("comment"));
	  comment.sendKeys("HI THIS IS SPOOJA ");
	  
	  WebElement SendButton =  driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button"));
	  SendButton.click();
	 	System.out.print("This is for git Test/ practice");
	   
	 
  }
  
}
