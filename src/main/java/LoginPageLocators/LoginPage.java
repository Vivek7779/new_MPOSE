package LoginPageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Finding out webelements using pagefactory
	
	@FindBy(name ="userNameOrEmailAddress")
	WebElement usernameTextbox;
	
	@FindBy(name ="password")
	WebElement passwordTextbox;
	
	@FindBy (xpath = "//*[@id=\"rememberClient\"]")
	WebElement RememberMe_Checkbox;
	
	@FindBy(xpath ="//button[text()='Sign In']")
	WebElement Loginbutton;
	
	
	public void enterUsername() {
		
		usernameTextbox.sendKeys("support");
	}
	
	public void enterPassword() {
		
		passwordTextbox.sendKeys("go2meeting");
	}
	
	
	public void clickOnSignIn() {
		
		Loginbutton.click();
		
	} 
	
}
