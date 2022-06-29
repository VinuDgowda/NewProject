package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewEnterTimeTrackPage {
	
	@FindBy(id="container_tasks")
	private WebElement tasktab;
	
	@FindBy(id="logoutLink")
	private WebElement logoutbtn;
	
	public NewEnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setTask() {
		tasktab.click();
	}
	public void setLogout() {
		logoutbtn.click();
	}
	
}
