package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewWebDriverLib {
	
public void waitForpageLoadImplicitly(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
public void waitForPageLoadExplicitly(WebDriver driver, String title) {
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.titleIs(title));
}

}
