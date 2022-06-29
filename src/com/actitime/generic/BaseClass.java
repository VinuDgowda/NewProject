package com.actitime.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeTest
	public void oprnBrowser() {
		Reporter.log("openBrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverCommonLib wd=new WebDriverCommonLib();
		wd.waitForPageLoadImplicit(driver);
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException {
		FileLib f=new FileLib();
		String url = f.getPropertyDta("url");
		String un = f.getPropertyDta("username");
		String pw = f.getPropertyDta("password");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.setLogin(un, pw);

	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setLogout();
		
	}    


}
