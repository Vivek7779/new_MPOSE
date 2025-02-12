package CreatesLocators;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateProductPage {
	WebDriver driver;
	WebDriverWait wait;

	public CreateProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit wait of 10 seconds
	}

	@FindBy(xpath = "//*[@id=\"sidebar-menu\"]/ul/li[1]/ul/li[1]/a/span")
	WebElement productdetailsopt;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[1]/button")
	WebElement createproductbtn;

	@FindBy(name = "strProductDesc")
	WebElement description;

	@FindBy(xpath = "//*[@id=\"rc_select_4\"]")
	WebElement department;

	@FindBy(xpath = "//*[@id=\"rc_select_6\"]")
	WebElement location;

	@FindBy(name = "strProductSize")
	WebElement size;

	@FindBy(xpath = "//*[@id=\"rc_select_3\"]")
	WebElement vat;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div/form/div[4]/div/div/div/div[2]/div[2]/button")
	WebElement addnewbarcode;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div/form/div[4]/div/div/div/div[1]/div/div/div/div/div/div[2]/div/div/div/div/div[1]/span")
	WebElement productbarcode;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div/form/div[4]/div/div/div/div[1]/div/div/div/div/div/div[2]/div/div/div/div/div[2]")
	WebElement prodcutdescription;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div/form/div[4]/div/div/div/div[1]/div/div/div/div/div/div[2]/div/div/div/div/div[3]")
	WebElement productprice;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div/form/div[5]/div/div/div/div[2]/div[2]/button")
	WebElement addnewsupplier;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div/form/div[5]/div/div/div/div[1]/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div/div[2]")
	WebElement suppliername;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div/form/div[6]/button[4]")
	WebElement productsavebutton;

	public void ProductDetailsopt() throws InterruptedException {
		productdetailsopt.click();
		Thread.sleep(2000);
	}

	public void CreateProductbtn() throws InterruptedException {
		createproductbtn.click();
		Thread.sleep(2000);
	}

	public void Description() throws InterruptedException {
		description.click();
		description.sendKeys("Demo Product");
		System.out.println("Product name : Demo product");
		Thread.sleep(2000);
	}

	public void Department() throws InterruptedException {
		department.click();
		department.sendKeys("BABY", Keys.ENTER);
		System.out.println("Product Department : BABY CARE");
		Thread.sleep(2000);
	}

	public void Location() throws InterruptedException {
		location.click();
		location.sendKeys("SHOP", Keys.ENTER);
		System.out.println("Product Location : SHOP FLOOR");
		Thread.sleep(2000);
	}

	public void Size() throws InterruptedException {
		size.click();
		size.sendKeys("XL");
		System.out.println("Product Size : XL");
		Thread.sleep(2000);
		size.sendKeys(Keys.TAB);
		vat.sendKeys("STD" , Keys.ENTER);
		System.out.println("Product Vat : STD");
		Thread.sleep(2000);
		vat.sendKeys(Keys.PAGE_DOWN);
	}

	public void AddNewBarcode() throws InterruptedException {
		addnewbarcode.click();
		Thread.sleep(2000);
		addnewbarcode.sendKeys("6546545");
		System.out.println("Product Barcode : 6546545");
		Thread.sleep(3000);
	}

	public void ProductPrice() {
		productprice.click();
		productprice.sendKeys("8565");
		System.out.println("Product Price : 8565");
	}
	
    public void AddNewSupplier() {
		addnewsupplier.click();
	}
    
    public void SupplierName() throws InterruptedException {
	suppliername.click();
	suppliername.sendKeys("BESTWAY" , Keys.ENTER );
	System.out.println("Product Supplier : BESTWAY");
	Thread.sleep(2000);
	}
    
    public void ProductSave() {
    	productsavebutton.click();
    	System.out.println("Product Created Successfully");
	}
    
}
