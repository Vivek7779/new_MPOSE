package com.MPOS.TestClass03_Create;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class createSupplier extends com.MPOS.Pages.base.BaseClass {
	@Test
	public void CreateSupplier() throws InterruptedException {

		LoginPageLocators.LoginPage lp = new LoginPageLocators.LoginPage(driver);
		CreatesLocators.CreateDepartmentPage DP = new CreatesLocators.CreateDepartmentPage(driver);
		CreatesLocators.CreateSupplierPage SP = new CreatesLocators.CreateSupplierPage(driver);
		
		// SIGN IN
		lp.enterUsername();
		lp.enterPassword();
		lp.clickOnSignIn();
		Reporter.log("Login Successful");
		
    	//Extending Stock Manager section.
		DP.StockManagerdrop();
		
		//Adding Supplier
		SP.SupplierDetails();
		SP.CreateSupplierBtn();
		SP.SupplierAccountnumber();
		SP.SupplierName();
		SP.SupplierCreditLimit();
		SP.SupplierCreditDays();
		Thread.sleep(2000);
		SP.SupplierRebate();
		Thread.sleep(2000);
		SP.SupplierWebsite();
		SP.SupplierSave();
		Thread.sleep(2000);
		driver.quit();
	}
}
