package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewbtn;

	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcustoption;

	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement entercustnametbx;

	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercustdesctbx;

	@FindBy(xpath="//div[text()='- Select Customer -']")
	private WebElement selectcustDD;

	@FindBy(xpath="(//div[text()='Our company'])[2]")
	private WebElement ourcompany;

	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createbtn;

	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualcustomer;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcustoption() {
		return newcustoption;
	}

	public WebElement getEntercustnametbx() {
		return entercustnametbx;
	}

	public WebElement getEntercustdesctbx() {
		return entercustdesctbx;
	}

	public WebElement getSelectcustDD() {
		return selectcustDD;
	}

	public WebElement getOurcompany() {
		return ourcompany;
	}

	public WebElement getCreatebtn() {
		return createbtn;
	}

	public WebElement getActualcustomer() {
		return actualcustomer;
	}

	
}

