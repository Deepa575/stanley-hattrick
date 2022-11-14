package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class DeviceTypeSteps {

	private WebDriver driver;
	
	@Given("Open the application")
	public void open_the_application() {
	  HomePage hp = new HomePage(driver);
	  
	}

	@Given("Click to Administration Button")
	public void click_to_administration_button() {
	   
	}

	@When("Click on Device Type Link")
	public void click_on_device_type_link() {
	   
	}

	@Then("Verify Device Type page")
	public void verify_device_type_page() {
	   
}}
