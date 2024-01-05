package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SS_CartPage {
	
	public WebDriver driver;
	public SS_CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//p[text()='Skinny Men Blue Jeans']")
	private WebElement jeansProductCartPage;
	
	public WebElement getJeansProductCartPage() {
		return jeansProductCartPage;
	}
	
	@FindBy(id="buynow_fl")
	private WebElement buyNowButton;
	
	public WebElement getBuyNowButton() {
		return buyNowButton;
	}

}
