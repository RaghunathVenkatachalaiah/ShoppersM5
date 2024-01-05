package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SS_MyProfilePage {
	
	public WebDriver driver;
	
	public SS_MyProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//div[text()='My Addresses']")
	private WebElement myAddressesLink;

	public WebElement getMyAddressesLink() {
		return myAddressesLink;
	}
	
}
