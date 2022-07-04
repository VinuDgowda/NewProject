package com.actitime.testscript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.NewBaseClass;
import com.actitime.generic.NewExternalFile;
import com.actitime.pom.NewEnterTimeTrackPage;
import com.actitime.pom.NewTaskListPage;

@Listeners(com.actitime.generic.NewListener.class)
public class NewCustomerModule extends NewBaseClass {
	
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException {
		Reporter.log("Create customer",true);
		NewEnterTimeTrackPage en=new NewEnterTimeTrackPage(driver);
		en.setTask();
		NewTaskListPage tl=new NewTaskListPage(driver);
		tl.getAddnewbtn().click();
		tl.getNewcust().click();
		NewExternalFile ef=new NewExternalFile();
		String custname = ef.getExcelData("createcustomer", 3, 2);
		String custdesc=ef.getExcelData("createcustomer", 3, 3);
		tl.getEntercustname().sendKeys(custname);
		tl.getCustdescription().sendKeys(custdesc);
		tl.getSelectcustDD().click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		tl.getOurcompany().click();
		tl.getCreatecust().click();
		}
	
	@Test
	public void testModifyCustomer() {
		Reporter.log("Modify Customer",true);
	}

}
