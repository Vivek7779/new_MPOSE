package com.MPOS.TestClass01_Login;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.MPOS.Pages.base.BaseClass;

import CreatesLocators.CreatenewUserPage;
import LoginPageLocators.LogoutPage;

public class Logout extends BaseClass{
@Test
	public void Logout() throws InterruptedException {
		LoginPageLocators.LoginPage lp = new LoginPageLocators.LoginPage(driver);
		CreatenewUserPage CNU=new CreatenewUserPage(driver);
		LoginPageLocators.LogoutPage LOP= new LoginPageLocators.LogoutPage(driver);
		
		// SIGN IN
		lp.enterUsername();
		lp.enterPassword();
		lp.clickOnSignIn();
		Reporter.log("Login Successful");
		
		//Use create new user
		CNU.UserProfile();
		
		LOP.Logout();
	}
}
