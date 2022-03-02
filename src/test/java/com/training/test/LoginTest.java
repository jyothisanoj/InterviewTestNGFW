package com.training.test;

import org.testng.annotations.*;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.page.LoginPage;

public class LoginTest extends BaseTest{
	
	LoginPage login;
	
	@BeforeMethod
	public void setup(){
		lanuchBrowser("ie");
		login = new LoginPage(driver);
	}

	@AfterMethod
	public void setUp() {
		//driver.close();
	}
	
	@Test
	public void test() {
		login.enterIntoUsername("Jyothi");
		login.enterIntoPassword("Jyothi1");
	
	}
}
