package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	
	@FindBy(id="container_tasks")
	private WebElement tasktab;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement lgbtn;
	
	
public EnterTimeTrackPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void setTaskTab() {
	tasktab.click();
}

public void setLogout() {
	lgbtn.click();
}
}
