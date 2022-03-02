package com.training.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	protected WebDriver driver;
	
	public WebDriver getDriver(String sBrowserName) {

		sBrowserName = sBrowserName.toLowerCase();
		
		System.out.println(sBrowserName);
				
		switch (sBrowserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "ie":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			driver = null;

		}
		

		return driver;
	}
	
	public void lanuchBrowser(String sBrowserName) {
		driver = getDriver(sBrowserName);
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.MILLISECONDS);
	
	}
}
