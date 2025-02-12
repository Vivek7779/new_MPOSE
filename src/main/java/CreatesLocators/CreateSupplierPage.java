package CreatesLocators;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateSupplierPage {

	WebDriver driver;
	WebDriverWait wait;

	public CreateSupplierPage(WebDriver driver) {
		this.driver = driver;
      PageFactory.initElements(driver, this);
      wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit wait of 10 seconds
	}
     
	 @FindBy(xpath="//*[@id=\"sidebar-menu\"]/ul/li[1]/ul/li[2]/a/span")
     WebElement supplierdetails;
	
	 @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[3]/div/div[1]/button")
	 WebElement createsupplierBtn;
	 
	 @FindBy(name="strSuppliercode")
	 WebElement supplieraccountNumber;
	 
	 @FindBy(name="strSupplierName")
	 WebElement suppliername;
	
	 @FindBy(name="decCreditAmount")
	 WebElement suppliercreditlimit;
	 
	 @FindBy(name="intCreditDays")
	 WebElement suppliercreditdays;
	 
	 @FindBy(name="decRebate")
	 WebElement supplierrebate;
	
	 @FindBy(name = "strWebsite") 
	 WebElement supplierwebsite;
	
	 @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[3]/div/form/div[3]/button[2]") 
	 WebElement suppliersavebutton;
	
	 public void SupplierDetails() {
		 wait.until(ExpectedConditions.visibilityOf(supplierdetails));
		 supplierdetails.click();
	 }
	
	 public void CreateSupplierBtn() {
		 wait.until(ExpectedConditions.visibilityOf(createsupplierBtn));
		 createsupplierBtn.click();
	 }
	
	 public void SupplierAccountnumber() {
		 wait.until(ExpectedConditions.visibilityOf(supplieraccountNumber));
		 supplieraccountNumber.sendKeys("784932");
		 System.out.println("Supplier Account Number: 784932");
	 }
	 
	 public void SupplierName() {
		 wait.until(ExpectedConditions.visibilityOf(suppliername));
		 suppliername.sendKeys("Demo Supplier");
		 System.out.println("Supplier Name: Demo Supplier");
	 }
	
	 public void SupplierCreditLimit() {
		 wait.until(ExpectedConditions.visibilityOf(suppliercreditlimit));
		 suppliercreditlimit.clear();
		 suppliercreditlimit.sendKeys("25");
		 System.out.println("Supplier Credit Limit: 25");
	 }
	
	 public void SupplierCreditDays() throws InterruptedException {
		 wait.until(ExpectedConditions.visibilityOf(suppliercreditdays));
		 suppliercreditdays.sendKeys(Keys.CONTROL + "A" , Keys.DELETE);
		 suppliercreditdays.sendKeys("35");
		 System.out.println("Supplier Credit Days: 35");
	 }
	 
	 public void SupplierRebate() throws InterruptedException {
		 wait.until(ExpectedConditions.visibilityOf(supplierrebate));
		 supplierrebate.sendKeys(Keys.CONTROL + "A" , Keys.DELETE);
		 supplierrebate.sendKeys("15");
		 Thread.sleep(2000);
		 System.out.println("Supplier Rebate: 15");
	 }
	
	 public void SupplierWebsite() throws InterruptedException {
		 wait.until(ExpectedConditions.visibilityOf(supplierwebsite));
		 supplierwebsite.sendKeys("www.supplierdemoweb.com");
		 System.out.println("Supplier Website: www.supplierdemoweb.com");
         supplierwebsite.sendKeys(Keys.PAGE_DOWN);
         Thread.sleep(2000);
	 }
	 
	 public void SupplierSave() {
		 wait.until(ExpectedConditions.visibilityOf(suppliersavebutton));
		 suppliersavebutton.click();
		 System.out.println("Supplier Created Successfully.");
	 }
	}

