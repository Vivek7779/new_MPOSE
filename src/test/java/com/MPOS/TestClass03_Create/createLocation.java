package com.MPOS.TestClass03_Create;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.MPOS.Pages.base.BaseClass;
public class createLocation extends BaseClass {
@Test
	public void CreateLocation() throws InterruptedException {
		LoginPageLocators.LoginPage lp = new LoginPageLocators.LoginPage(driver);
		CreatesLocators.CreateDepartmentPage DP = new CreatesLocators.CreateDepartmentPage(driver);
		CreatesLocators.CreateLocationPage LP=new CreatesLocators.CreateLocationPage(driver);
		
		// SIGN IN
		lp.enterUsername();
		lp.enterPassword();
		lp.clickOnSignIn();
		Reporter.log("Login Successful");
		
		//Extending Stock Manager section.
		DP.StockManagerdrop();
		
		//Creating Location.
		LP.LocationDetailsopt();
		LP.CreateLocationBtn();
		LP.LocationName();
		LP.SubLocationCheck();
		LP.ParentLocationChoose();
		LP.LocationSaveButton();
		Thread.sleep(2000);
	}
	
}
