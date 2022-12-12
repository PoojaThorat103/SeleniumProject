package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {	
	public static void main(String[] args) {		
	//Set driver path 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahil\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	//Launch site
	 driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
	
}

}