package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathinMakeMyTrip {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.makemytrip.com/");
WebElement flight = driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chCharterFlights']/../../a/span[2]"));
	String text = flight.getText();
	System.out.println(text);
	boolean img = driver.findElement(By.xpath("(//img)[14]")).isDisplayed();
	if(img==(true)) {	
		System.out.println("img is displaying");
	}
	else {
		System.out.println("img is not displayed");
	}
	driver.close();
	
	}

}
