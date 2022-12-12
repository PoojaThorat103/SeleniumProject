package com.demo.action;

import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class TakeScreenshotTest extends BaseClass {
	
@Test
void ScreenShoTest() {
	driver.navigate().to("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
	
}
}
