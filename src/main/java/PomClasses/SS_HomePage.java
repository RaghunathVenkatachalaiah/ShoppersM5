package PomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SS_HomePage {

	public WebDriver driver;

	public SS_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
		
//	@FindBy(xpath="//button[@aria-label='Account settings']")
//	private WebElement accountSettingsIcon;
//
//	public WebElement getAccountSettingsIcon() {
//		return accountSettingsIcon;
//	}

	@FindBy(xpath="//a[@id='men']")
	private WebElement menMenuLink;

	public WebElement getMenMenuLink() {
		return menMenuLink;
	}
	
	@FindBy(xpath="//a[text()='T-shirts']")
	private WebElement tshirtMenLink;

	public WebElement getTshirtMenLink() {
		return tshirtMenLink;
	}
	
	@FindBy(xpath="//a[@id='cart']")
	private WebElement addToCartLink;

	public WebElement getaAddToCartLink() {
		return addToCartLink;
	}
	
	public void javaScriptClick(WebDriver driver) {
		WebElement ele=driver.findElement(By.xpath("//button[@aria-label='Account settings']"));
				
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ele);
		}
}
