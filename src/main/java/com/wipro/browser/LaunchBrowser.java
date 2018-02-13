package com.wipro.browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	static WebDriver driver;
	
	public static WebDriver openBrowser(String browser){
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://10.207.182.108:81/opencart/");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		return driver;
		
	}
}