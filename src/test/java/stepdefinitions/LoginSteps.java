package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {
	
	private WebDriver driver;
	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private HomePage homePage = new HomePage(DriverFactory.getDriver());

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("http://stanley-hattrick.vassarlabs.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("User gets the Title of Login page")
	public void user_gets_the_title_of_login_page() {
		title = loginPage.getLoginPageTitle();
		System.out.println("Login Page title is: " + title);
	}

	@Then("Login Page Title should be {string}")
	public void login_page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@When("User Enters Username {string}")
	public void user_enters_username(String Username) {
		loginPage.getUsername().sendKeys(Username);
	}

	@When("User Enters Password {string}")
	public void user_enters_password(String Password) {
		loginPage.getPassword().sendKeys(Password);
	}

	@When("User clicks on SignIn button")
	public void user_clicks_on_sign_in_button() {
		loginPage.getSignInBtn().click();
	}

	@Then("User gets the Title of Home Page")
	public void user_gets_the_title_of_home_page() {
		title = homePage.getHomePageTitle();
		System.out.println("Home Page title is: " + title);
	}

	@Then("Home Page Title should be {string}")
	public void home_page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}
}
