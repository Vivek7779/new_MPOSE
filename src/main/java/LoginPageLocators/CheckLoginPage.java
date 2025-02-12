package LoginPageLocators;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckLoginPage {

	WebDriver driver;
	WebDriverWait wait;
	
	public CheckLoginPage(WebDriver driver) {
		this.driver = driver;
      PageFactory.initElements(driver, this);
      wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit wait of 10 seconds
	}
	
	    //Finding out webelements using pagefactory
		@FindBy(name ="userNameOrEmailAddress")
		WebElement username;
		
		@FindBy(name ="password")
		WebElement password;
		
		@FindBy (xpath = "//*[@id=\"rememberClient\"]")
		WebElement RememberMe;
		
		@FindBy(xpath ="//button[text()='Sign In']")
		WebElement Loginbtn;
		
		// **Separate methods for calling in structured way**
	    public void enterUsername(String user) {
	        username.sendKeys(user);
	    }

	    public void enterPassword(String pass) {
	        password.sendKeys(pass);
	    }
		
		public void Login() {
			
			Loginbtn.click();
		} 
}
