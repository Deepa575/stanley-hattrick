package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdministrationPage {

	private WebDriver driver;

	// 1. By Locators: OR
	private By CustomersLnk = By.xpath("//a[text()=' Customers']");
	private By LocationTypeLnk = By.xpath("//a[text()=' Location Type']");
	private By LocationsLnk = By.xpath("//a[text()=' Locations']");
	private By HierarchyLnk = By.xpath("//a[text()=' Hierarchy']");
	private By DeviceTypeLnk = By.xpath("//a[text()=' Device Type']");
	private By DevicesLnk = By.xpath("//a[text()=' Devices']");
	private By DeviceProfileLnk = By.xpath("//a[text()=' Device Profile']");
	private By DeviceManagementLnk = By.xpath("//a[text()='//a[text()=' Device Management']']");

	// 2. Constructor of the page class:
	public AdministrationPage(WebDriver driver) {
	this.driver = driver;
}
}