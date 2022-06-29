package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTaskListPage {
	
	@FindBy(xpath="//div[text()='Add New']")
private WebElement addnewbtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcust;
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement entercustname;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdescription;
	
	@FindBy(xpath="//div[@class='emptySelection']")
	private WebElement selectcustDD;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourcompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcust;
	
	@FindBy(xpath="//div[text()='Accounting']")
	private WebElement actualcustname;
	
	public NewTaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public WebElement getEntercustname() {
		return entercustname;
	}

	public WebElement getCustdescription() {
		return custdescription;
	}

	public WebElement getSelectcustDD() {
		return selectcustDD;
	}

	public WebElement getOurcompany() {
		return ourcompany;
	}

	public WebElement getCreatecust() {
		return createcust;
	}

	public WebElement getActualcustname() {
		return actualcustname;
	}
	
	
}
