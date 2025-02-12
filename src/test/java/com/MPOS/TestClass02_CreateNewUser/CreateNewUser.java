package com.MPOS.TestClass02_CreateNewUser;

import org.testng.annotations.Test;
import com.MPOS.Pages.base.BaseClass;
import CreatesLocators.CreatenewUserPage;

public class CreateNewUser extends BaseClass {
	@Test
	public void createnewuser() throws InterruptedException {
		LoginPageLocators.LoginPage lp = new LoginPageLocators.LoginPage(driver);
		CreatesLocators.CreateDepartmentPage DP = new CreatesLocators.CreateDepartmentPage(driver);
		CreatenewUserPage CNU=new CreatenewUserPage(driver);
		
		// SIGN IN
		lp.enterUsername();
		lp.enterPassword();
		lp.clickOnSignIn();
		Thread.sleep(5000);
		
		//Click on Stock manager
		DP.StockManagerdrop();
		
		//Use create new user
		CNU.UserProfile();
		CNU.UserAccount();
		CNU.CreateUserButton();
		CNU.Username();
		CNU.Role();
		CNU.AllowZDisplay();
		CNU.Till();
		CNU.HHT();
		CNU.Backoffice();
		CNU.Password();
		CNU.ConfirmPassword();
		CNU.StaffCode();
		CNU.CreteUserNameSavebtn();
		Thread.sleep(3000);
	}
}
