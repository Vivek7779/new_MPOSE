package CreatesLocators;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateLocationPage {

	WebDriver driver;
	WebDriverWait wait;
	
	public CreateLocationPage(WebDriver driver) {
		this.driver = driver;
      PageFactory.initElements(driver, this);
      wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit wait of 10 seconds
	}
	
	@FindBy(xpath = "//*[@id=\"sidebar-menu\"]/ul/li[1]/ul/li[4]/a/span")
	WebElement  locationdetails;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[1]/button")
	WebElement createlocationbutton;
	
	@FindBy(name = "strName")
	WebElement locationname;
	
	@FindBy(name = "issublocation")
	WebElement sublocationcheckbox;
	
	@FindBy (xpath = "//*[@id=\"strParentDeptName_undefined\"]")
	WebElement parentlocationchoose;
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/div/div[1]/div[5]/div")
	WebElement locationsavebutton;
	
	public void LocationDetailsopt() {
		wait.until(ExpectedConditions.visibilityOf(locationdetails));
		locationdetails.click();
	}
	
	public void CreateLocationBtn () throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(createlocationbutton));
		createlocationbutton.click();
		Thread.sleep(1000);
	}
	
	public void LocationName() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(locationname));
		locationname.sendKeys("Demo Location");
		System.out.println("Location Name : Demo Location");
	    Thread.sleep(500);
	}
	
	public void SubLocationCheck() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(sublocationcheckbox));
		sublocationcheckbox.click();
		Thread.sleep(1000);
	}
	
	public void ParentLocationChoose() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(parentlocationchoose));
	    parentlocationchoose.click();
	    parentlocationchoose.sendKeys("COUNTER" , Keys.ENTER);
	    Thread.sleep(1000);
	}
	
	public void LocationSaveButton() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(locationsavebutton));
		locationsavebutton.click();
		Thread.sleep(3000);
		System.out.println("Location created Susscessfully");
	}
}

