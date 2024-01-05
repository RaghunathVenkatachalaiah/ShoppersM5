package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SS_MyAddressesPage {
	
	public WebDriver driver;
	public SS_MyAddressesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='/addressform']")
	private WebElement addressformbutton;
	
	public WebElement getaddressformButton() {
		return addressformbutton;
		
	}
	
	@FindBy(xpath="//div[@class='addressListContainer']//h3")
	private WebElement addedAddrress;
	
	public WebElement getaaddedAddrress() {
		return addedAddrress;
	}
	
	
	
	
}
