package com.actitime.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.NewEnterTimeTrackPage;
import com.actitime.pom.NewLoginPage;

public class NewBaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		Reporter.log("Open Browser",true);
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		NewWebDriverLib w=new NewWebDriverLib();
		w.waitForpageLoadImplicitly(driver);
	}
/*	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close Browser",true);
		driver.close();
	} */
	
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("Login",true);
		NewExternalFile e=new NewExternalFile();
		String url = e.getPropertyData("url");
		driver.get(url);
		String un = e.getPropertyData("username");
		String pw = e.getPropertyData("password");
		NewLoginPage l=new NewLoginPage(driver);
		l.setLogin(un, pw);
	}
/*	@AfterMethod
	public void logout() {
		Reporter.log("Logout",true);
		NewEnterTimeTrackPage et=new NewEnterTimeTrackPage(driver);
		et.setLogout();
	} */ 

}
