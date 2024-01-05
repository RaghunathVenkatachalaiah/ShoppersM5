package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SS_MenPage {
	
	public WebDriver driver;
	
	public SS_MenPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='men']")
	private WebElement menBreadCrumbOption;
	
	public WebElement getMenBreadCrumbOption()
	{
		return menBreadCrumbOption;
	}
	
	@FindBy(xpath="//span[text()='Skinny Men Blue Jeans']/../..//button")
	private WebElement skinnyMenBlueJeansAddToCartButton;
	
	public WebElement getSkinnyMenBlueJeansAddToCartButton()
	{
		return skinnyMenBlueJeansAddToCartButton;
	}

}
