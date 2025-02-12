package com.MPOS.TestClass03_Create;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.MPOS.Pages.base.BaseClass;
import CreatesLocators.CreateProductPage;

public class CreateProduct extends BaseClass {

	@Test
	public void CreateProduct() throws InterruptedException {
		LoginPageLocators.LoginPage lp = new LoginPageLocators.LoginPage(driver);
		CreatesLocators.CreateDepartmentPage DP = new CreatesLocators.CreateDepartmentPage(driver);
		CreatesLocators.CreateProductPage CPP=new CreatesLocators.CreateProductPage(driver);
		
		// SIGN IN
		lp.enterUsername();
		lp.enterPassword();
		lp.clickOnSignIn();
		Reporter.log("Login Successful");
		
		//Click on Stock manager
		DP.StockManagerdrop();
		
		//caling element from Productdetailspage.
		CPP.ProductDetailsopt();
		CPP.CreateProductbtn();
		CPP.Description();
		CPP.Department();
		CPP.Location();
		CPP.Size();
		CPP.AddNewBarcode();
		CPP.ProductPrice();
		CPP.AddNewSupplier();
		CPP.ProductPrice();
		CPP.AddNewSupplier();
		CPP.SupplierName();
		CPP.ProductSave();
		Thread.sleep(3000);
	}
	
}
