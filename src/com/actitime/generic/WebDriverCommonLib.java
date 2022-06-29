package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
	
	public void waitForPageLoadImplicit(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void waitForPageLoadExplicit(WebDriver driver, String title) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs(title));
	}
	public void customWaitForElementDisplayed(WebElement element) {
		int i=0;
		while (i<100) {
			try {
				element.isDisplayed();
				break;
			}
			catch(Exception e){
				i++;
			}
		}
	}

}
