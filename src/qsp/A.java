package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	driver.close();
	}   

}
