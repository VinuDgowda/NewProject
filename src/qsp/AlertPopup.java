package qsp;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup { 
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://unifiedportal-mem.epfindia.gov.in/memberinterface/");
driver.findElement(By.id("userName")).sendKeys("101188850920");
driver.findElement(By.id("password")).sendKeys("Vivek@1991");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the captcha");
String captcha=sc.nextLine();
driver.findElement(By.id("captcha")).sendKeys(captcha);
driver.findElement(By.xpath("//span[text()=' Sign in ']")).click();
WebDriverWait wait=new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.alertIsPresent());
Alert a = driver.switchTo().alert();
String title = a.getText();
a.dismiss();
}

}
