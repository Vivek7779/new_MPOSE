package com.MPOS.TestClass01_Login;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.MPOS.Pages.base.BaseClass;

public class Login extends BaseClass {

	@Test
	public void login() throws InterruptedException {
		LoginPageLocators.LoginPage lp = new LoginPageLocators.LoginPage (driver);

		// SIGN IN
		lp.enterUsername();
		lp.enterPassword();
		lp.clickOnSignIn();
		System.out.println("Login Successful");
		Reporter.log("Login Successful");
	}
}
