package CreatesLocators;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateDepartmentPage {
	  WebDriver driver;
	  WebDriverWait wait;
	
	public CreateDepartmentPage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit wait of 10 seconds
    }
		//Finding out WebElements 
	
		// Stock Manager Dropdown
		@FindBy(xpath="//*[@id=\"sidebar-menu\"]/ul/li[1]/a")
		WebElement StockManagerDropdown;
		
		// Department Label
		@FindBy(xpath="//*[@id=\"sidebar-menu\"]/ul/li[1]/ul/li[3]/a/span")
		WebElement DepartmentLabel;
		
		//Create Department button
		@FindBy(xpath="//*[@id=\"root\"]/div/div/div[3]/div/div[1]/button")
		WebElement CreateDepartment;
		
		//Create Department button
		@FindBy(name="strDeptName")
		WebElement Departmentname;
		
		//Create Sub Department Checkbox
		@FindBy(xpath="//*[@id=\"isSubDepartment_undefined\"]")
		WebElement SubDepartmentCheckbox;
		
		//Create Parent Department Name
		@FindBy(xpath="//*[@id=\"strParentDeptName_undefined\"]")
		WebElement ParentDepartmentName;
		
		//Create TargetMargin
		@FindBy(xpath="//*[@id=\"intMargin_undefined\"]")
		WebElement TargetMargin;
		
		//Create Vatable Checkbox
		@FindBy(id="isTaxable_undefined")
		WebElement VatableCheckbox;
		
		//Create Allow Discount Checkbox
		@FindBy(id="allowDiscount_undefined")
		WebElement AllowDiscountCheckbox;
		
		//Create Service Checkbox
		@FindBy(id="isServices_undefined")
		WebElement ServiceCheckbox;
	
		//Create Department button
		@FindBy(xpath="/html/body/div[1]/div/div/div[3]/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/div/div[1]/div[9]/div/i")
		WebElement DepartmentSaveButton;

        //Select Organization
		public void StockManagerdrop() throws InterruptedException {
			wait.until(ExpectedConditions.visibilityOf(StockManagerDropdown)); // Wait for visibility
	        StockManagerDropdown.click();

		}
		
		public void DepartmentLbl() {
			wait.until(ExpectedConditions.visibilityOf(DepartmentLabel)); // Wait for visibility
	        DepartmentLabel.click();
		}
		
		public void CreateDepartment() {
			wait.until(ExpectedConditions.visibilityOf(CreateDepartment));
			CreateDepartment.click();
		}
		
		public void Departmentname() {
			wait.until(ExpectedConditions.visibilityOf(Departmentname));
			Departmentname.click();
			Departmentname.sendKeys("Sport Department");
		}
		
		public void SubDepartmentCheck() {
			wait.until(ExpectedConditions.visibilityOf(SubDepartmentCheckbox));
			SubDepartmentCheckbox.click();
		}
		
		public void ParentDepartmentchoose() {
			wait.until(ExpectedConditions.visibilityOf(ParentDepartmentName));
			ParentDepartmentName.click();
			ParentDepartmentName.sendKeys("AlCO");
			ParentDepartmentName.sendKeys(Keys.ENTER);
		}
		
		public void TargetMargin() {
			wait.until(ExpectedConditions.visibilityOf(TargetMargin));
			TargetMargin.click();
			TargetMargin.sendKeys(Keys.CONTROL + "A" , Keys.DELETE);
			TargetMargin.sendKeys("20" , Keys.ENTER);
		}
		
		public void vatablecheck() {
			wait.until(ExpectedConditions.visibilityOf(VatableCheckbox));
			VatableCheckbox.click();
		}
		
		public void AllowDiscount() {
			wait.until(ExpectedConditions.visibilityOf(AllowDiscountCheckbox));
			AllowDiscountCheckbox.click();
		}
		
		public void ServiceCheck() throws InterruptedException {
			wait.until(ExpectedConditions.visibilityOf(ServiceCheckbox));
			ServiceCheckbox.click();
			Thread.sleep(2000);
		}
		
		public void DepartmentSave() throws InterruptedException {
			wait.until(ExpectedConditions.visibilityOf(DepartmentSaveButton));
			DepartmentSaveButton.click();
			Thread.sleep(1000);
			System.out.println("Department Created Successfully");
		}
	}