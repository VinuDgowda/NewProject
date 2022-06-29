package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException {
		Reporter.log("CreateCustomer",true);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setTaskTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddnewbtn().click();
		t.getNewcustoption().click();
		FileLib f=new FileLib();
		String customername = f.getExcelData("createcustomer", 1, 2);
		String customerdesc = f.getExcelData("createcustomer", 1, 3);
		t.getEntercustnametbx().sendKeys(customername);
		t.getEntercustdesctbx().sendKeys(customerdesc);
		t.getSelectcustDD().click();
		t.getOurcompany().click();
		t.getCreatebtn().click();	
		
/*		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElement(t.getActualcustomer(), customername));
		String actualcusttext = t.getActualcustomer().getText();
	Assert.assertEquals(actualcusttext, customername);  */
	}

}
