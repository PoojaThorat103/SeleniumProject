package com.demo.action;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BaseClass {
	public static WebDriver driver = null;

	@BeforeTest
	@Parameters({ "Browser", "Env" })
	public void beforeTest(String Browser, String env) {

		System.out.println(" this is browser: " + Browser);
		launchBrowser(Browser);

		System.out.println("Set Env to :  " + env);
		ConfigPojo configParam = new ConfigPojo();
		configParam.setEnv(env);

		System.out.println("Getting url from Env file");
		String url = ReadEnvData.getProperties("url");

		driver.manage().window().maximize();
		driver.get(url);
	}

	/*@AfterTest
	public void afterTest() {
		driver.quit();
	}*/

	public void launchBrowser(String BrowserName) {
		String projLocation = System.getProperty("user.dir");
		switch (BrowserName) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", projLocation + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "Firefox":
			System.out.println("Firefox");
			break;

		case "IE":
			System.out.println("IE");
			break;

		default:
			System.setProperty("webdriver.chrome.driver", projLocation + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
}
