package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;

	//1.Declaration
	@FindBy(id = "username")
	private WebElement UsernameEdt;
	
	@FindBy(id = "password")
	private WebElement PasswordEdt;
	
	@FindBy(xpath = "//input[@value='Sign In']")
	private WebElement SignInBtn;
	
	//2. Initialization
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//3. Utilization
	public WebElement getUsername() {
		return UsernameEdt;
	}

	public WebElement getPassword() {
		return PasswordEdt;
	}

	public WebElement getSignInBtn() {
		return SignInBtn;
	}
	
	//
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	
	
}
