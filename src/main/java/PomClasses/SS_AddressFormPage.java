package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SS_AddressFormPage {

public WebDriver driver;
	
	public SS_AddressFormPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="Name")
	private WebElement nameTextField;
	
	@FindBy(id="House/Office Info")
	private WebElement houseOfficeinformationTextField;
	
	@FindBy(id="Street Info")
	private WebElement StreetInformationTextField;
	
	@FindBy(id="Landmark")
	private WebElement LandMarkTextField;
	
	@FindBy(id="Country")
	private WebElement CountryDropDown;
	
	@FindBy(id="State")
	private WebElement StateDropDown;
	
	@FindBy(id="City")
	private WebElement CityDropDown;
	
	@FindBy(id="Pincode")
	private WebElement PincodeTextField;
	
	@FindBy(id="Phone Number")
	private WebElement PhoneNumberTextField;
	
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement AddAddressButton;
	

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getHouseOfficeinformationTextField() {
		return houseOfficeinformationTextField;
	}

	public WebElement getStreetInformationTextField() {
		return StreetInformationTextField;
	}

	public WebElement getLandMarkTextField() {
		return LandMarkTextField;
	}

	public WebElement getCountryDropDown() {
		return CountryDropDown;
	}

	public WebElement getStateDropDown() {
		return StateDropDown;
	}

	public WebElement getCityDropDown() {
		return CityDropDown;
	}

	public WebElement getPincodeTextField() {
		return PincodeTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return PhoneNumberTextField;
	}

	public WebElement getAddAddressButton() {
		return AddAddressButton;
	}
	
	
}
