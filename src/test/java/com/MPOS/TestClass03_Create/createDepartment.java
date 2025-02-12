package com.MPOS.TestClass03_Create;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.MPOS.Pages.base.BaseClass;

public class createDepartment extends BaseClass{

	@Test
	// Select Organization
		public void CreateDepartment() throws InterruptedException {
			LoginPageLocators.LoginPage lp = new LoginPageLocators.LoginPage(driver);
			CreatesLocators.CreateDepartmentPage DP = new CreatesLocators.CreateDepartmentPage(driver);

			// SIGN IN
			lp.enterUsername();
			lp.enterPassword();
			lp.clickOnSignIn();
			Reporter.log("Login Successful");
			
			//Click on Stock manager
			DP.StockManagerdrop();
			DP.DepartmentLbl();
			DP.CreateDepartment();
			DP.Departmentname();
			DP.SubDepartmentCheck();
			DP.ParentDepartmentchoose();
			DP.TargetMargin();
			DP.vatablecheck();
			DP.AllowDiscount();
			DP.ServiceCheck();
			DP.DepartmentSave();
			System.out.println("Department Created Successfully");
			Thread.sleep(2000);	
		}
}
