package LearnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

public static void main(String[] args) throws InterruptedException {
		
		//Set driver path 
		String projLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projLocation+"\\drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		//Launch site
		driver.get("http://www.google.com");
		driver.manage().window().maximize();	
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		Thread.sleep(7000);
}
}
