package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);		
	}

	@FindBy (id = "session_key")
	private WebElement username;
	
	@FindBy (id = "session_password")
	private WebElement password;
	
	public void enterIntoUsername(String usernmae)  {
		username.sendKeys(usernmae);
	}
	public void enterIntoPassword(String Password) {
		password.sendKeys(Password);
	}
}
