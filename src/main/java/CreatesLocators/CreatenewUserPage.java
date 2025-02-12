package CreatesLocators;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreatenewUserPage {
	  WebDriver driver;
	  WebDriverWait wait;
	
	public CreatenewUserPage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit wait of 10 seconds
    }
	//Finding out WebElements
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/ul/li[3]/a/span")
	WebElement userprofile;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/ul/li[3]/div/div/a[1]")
	WebElement useraccounts;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[1]/button")
	WebElement createuserbutton;
	
	@FindBy(name = "strUserName")
	WebElement username;
	
	@FindBy(xpath = "//*[@id=\"rc_select_0\"]")
	WebElement role;
	
	@FindBy(id = "isAllowZdisplay")
	WebElement allowzdisplay;
	
	@FindBy(name = "backOffice")
	WebElement backofffice;
	
	@FindBy(xpath = "//*[@id=\"till\"]")
	WebElement till;
	
	@FindBy(xpath = "//*[@id=\"hht\"]")
	WebElement hht;
	
	@FindBy(name = "strEncryptedPassword")
	WebElement password;
	
	@FindBy(name = "confirmPassword")
	WebElement confirmpassword;
	
	@FindBy(name = "strPinnumber")
	WebElement staffcode;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/form/div[3]/button[2]")
	WebElement createusersavebutton;
	
	public void UserProfile() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(userprofile));
		userprofile.click();
		Thread.sleep(4000);
	}
	
	public void UserAccount() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(useraccounts));
		useraccounts.click();
		Thread.sleep(1000);
	}
	
	public void CreateUserButton() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(createuserbutton));
		createuserbutton.click();
		Thread.sleep(1000);
	}
	
	public void Username() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("Demo User");
		System.out.println("User Name : Demo User");
		Thread.sleep(500);
	}
	
	public void Role() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(role));
		role.click();
		role.sendKeys("ADMI" , Keys.ENTER);
		Thread.sleep(500);
		System.out.println("Role : ADMIN1");
		}
	
	public void AllowZDisplay() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(allowzdisplay));
		allowzdisplay.click();
		Thread.sleep(500);
	}
	
	public void Backoffice() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(backofffice));
		backofffice.click();
		Thread.sleep(1000);
	}
	
	public void Till() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(till));
		till.click();
		Thread.sleep(2000);
	}
	
	public void HHT() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(hht));
		hht.click();
		Thread.sleep(1000);
	}
	
	public void Password() {
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("Demo@123");
		System.out.println("Passowrd : Demo@123");
	}
	
	public void ConfirmPassword() {
		wait.until(ExpectedConditions.visibilityOf(confirmpassword));
		confirmpassword.sendKeys("Demo@123");
	}
	
	public void StaffCode() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(staffcode));
		staffcode.sendKeys("46583");
		System.out.println("Staff Code - 46583");
		Thread.sleep(1000);
		staffcode.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
	}
	
	public void CreteUserNameSavebtn() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(createusersavebutton));
		createusersavebutton.click();
		System.out.println("User Created Successfully");
	}
}
