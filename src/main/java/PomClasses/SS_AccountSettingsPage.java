package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SS_AccountSettingsPage {

	public WebDriver driver;

	public SS_AccountSettingsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//li[text()='Logout']")
	private WebElement logoutIcon;

	public WebElement getLogoutIcon() {
		return logoutIcon;
	}
	
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement myProfileLink;

	public WebElement getMyProfileLink() {
		return myProfileLink;
	}

}
