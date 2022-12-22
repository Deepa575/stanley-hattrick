package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;

	//1. Declaration
	private By HomeBtn = By.xpath("//button[text()=' Home']");
	private By CustomersBtn = By.xpath("//button[text()=' Customers']");
	private By LocationsBtn = By.xpath("//button[text()=' Locations']");
	private By DeviceMonitoringBtn = By.xpath("//button[text()=' Device Monitoring']");
	private By AdministrationBtn = By.xpath("//button[text()=' Administration ']");

	//2. Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//3. Utilization
	public By getHomeBtn() {
		return HomeBtn;
	}

	public By getCustomersBtn() {
		return CustomersBtn;
	}

	public By getLocationsBtn() {
		return LocationsBtn;
	}

	public By getDeviceMonitoringBtn() {
		return DeviceMonitoringBtn;
	}

	public By getAdministrationBtn() {
		return AdministrationBtn;
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	
	

	
		
	// 3. page actions: features(behavior) of the page the form of methods:

//	public String getLoginPageTitle() {
//		return driver.getTitle();
//	}
//
//	public boolean isForgotPwdLinkExist() {
//		return driver.findElement(forgotPwdLink).isDisplayed();
//	}
//
//	public void enterUserName(String username) {
//		driver.findElement(emailId).sendKeys(username);
//	}
//
//	public void enterPassword(String pwd) {
//		driver.findElement(password).sendKeys(pwd);
//	}
//
//	public void clickOnLogin() {
//		driver.findElement(signInButton).click();
//	}
//
//	public AccountsPage doLogin(String un, String pwd) {
//		System.out.println("login with: " + un + " and " + pwd);
//		driver.findElement(emailId).sendKeys(un);
//		driver.findElement(password).sendKeys(pwd);
//		driver.findElement(signInButton).click();
//		return new AccountsPage(driver);
//	}
	

	

	
}
