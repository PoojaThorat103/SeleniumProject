package com.demo.action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TableTest  extends BaseClass{
	@Test
	public void CheckTable() throws InterruptedException
	{
		 //------ Table ----(Read all data from table)  
		 driver.navigate().to("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		 Thread.sleep(3000);
		 
		 List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']//tbody/tr"));
		 
		int rowNo =1;	 
		 for(WebElement row :rows){
			 
			 List<WebElement> cols = row.findElements(By.xpath("//td"));
			 int colNo =1;		 
			 for(WebElement col : cols) {
				 System.out.println("row no : " +rowNo + "--- Col No : " + colNo +" --- Value is : " + col.getText());
				 
				 colNo++;
			 }
			 rowNo++;
		 }
		  
		 /* driver.navigate().to("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		  List<WebElement> status= driver.findElements(By.xpath("//table[@id=\"task-table\"]//tbody//tr/*[text()='in progress']"));
		  System.out.println(status.size());
		  */
	}

}
