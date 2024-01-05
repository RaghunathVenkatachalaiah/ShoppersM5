package testCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PomClasses.SS_AccountSettingsPage;
import PomClasses.SS_AddressFormPage;
import PomClasses.SS_AddressPage;
import PomClasses.SS_CartPage;
import PomClasses.SS_HomePage;
import PomClasses.SS_MenPage;
import PomClasses.SS_MyAddressesPage;
import PomClasses.SS_MyProfilePage;
import utility.SS_BaseTest;

@Listeners(utility.SS_Listeners.class)
public class AddToCartTest extends SS_BaseTest{
	
	@Test(dataProvider="dataProviderAddress")
	public void TC_AddAddress_001_Test(String Name, String house_office, String street, String landmark, String Country, 
			String State, String city, String Dpin, String MobN ) throws InterruptedException
	{
		System.out.println("Add address");
		Thread.sleep(5000);
		
		
		SS_HomePage hp=new SS_HomePage(driver);
		
		hp.javaScriptClick(driver);
//		hp.getAccountSettingsIcon().click();
		SS_AccountSettingsPage asp=new SS_AccountSettingsPage(driver);
		asp.getMyProfileLink().click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.shoppersstack.com/my-profile/my-profile-info");
		System.out.println("The My Profile page is opened");
		SS_MyProfilePage mpp=new SS_MyProfilePage(driver);
		mpp.getMyAddressesLink().click();
		
		SS_MyAddressesPage ma=new SS_MyAddressesPage(driver);
		ma.getaddressformButton().click();
		
		SS_AddressFormPage afp=new SS_AddressFormPage(driver);
		afp.getNameTextField().sendKeys(Name);
		afp.getHouseOfficeinformationTextField().sendKeys(house_office);
		afp.getStreetInformationTextField().sendKeys(street);
		afp.getLandMarkTextField().sendKeys(landmark);
		WebElement countryropdown=afp.getCountryDropDown();
		drpU.selectDropdownByVisibleText(countryropdown, Country);
		WebElement StateDropdown=afp.getStateDropDown();
		drpU.selectDropdownByVisibleText(StateDropdown, State);
		WebElement CityDropdown=afp.getCityDropDown();
		drpU.selectDropdownByVisibleText(CityDropdown,city );
		afp.getPincodeTextField().sendKeys(Dpin);
		afp.getPhoneNumberTextField().sendKeys(MobN);
		afp.getAddAddressButton().click();
		
		
		
		
	}
	
	@DataProvider
	public Object[][] dataProviderAddress(){
		Object[][] ref=new Object[1][9];
		ref[0][0]="LoveBirds";
		ref[0][1]="Ambani building, 2nd floor";
		ref[0][2]="ambani street";
		ref[0][3]="ambani point";
		ref[0][4]="India";
		ref[0][5]="Karnataka";
		ref[0][6]="Bengaluru";
		ref[0][7]="560010";
		ref[0][8]="0987654321";
		
		return ref;
	}
	
	
	
	@Test
	public void TC_AddToCart_001_Test() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
//		data.dataFromExcelFile("Sheet1",1,0);
		System.out.println("First Test case");
//		String titleHomePage=driver.getTitle();
//		Assert.assertEquals(titleHomePage,"Shoppersstack|Ho");
		SS_HomePage hp=new SS_HomePage(driver);
		WebElement menMenu=hp.getMenMenuLink();
		wu.mouseHoverAction(driver, menMenu);
		menMenu.click();
//		hp.getTshirtMenLink().click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.shoppersstack.com/men");
		SS_MenPage mp=new SS_MenPage(driver);
		WebElement menBreadCrumb=mp.getMenBreadCrumbOption();
		wu.mouseHoverAction(driver, menBreadCrumb);
		mp.getSkinnyMenBlueJeansAddToCartButton().click();
		hp.getaAddToCartLink().click();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.shoppersstack.com/cart");
		
		System.out.println("Cart page has opened");
		SS_CartPage cp=new SS_CartPage(driver);
		String jeansProductCart=cp.getJeansProductCartPage().getText();
		if(jeansProductCart.equalsIgnoreCase(mp.getSkinnyMenBlueJeansAddToCartButton().getText()))
		{
			System.out.println("The product is added to cart");
		}
		cp.getBuyNowButton().click();
		SS_AddressPage ap=new SS_AddressPage(driver);
		ap.getAddAddressForm().click();
	}

	syso syso
}
