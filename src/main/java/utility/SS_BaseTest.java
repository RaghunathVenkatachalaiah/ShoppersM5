package utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomClasses.SS_AccountSettingsPage;
import PomClasses.SS_HomePage;
import PomClasses.SS_LoginPage;
import PomClasses.SS_WelcomePage;

public class SS_BaseTest {
	
	public static WebDriver driver;
	public SS_DataUtility data=new SS_DataUtility();
	public SS_WebDriverUtility wu=new SS_WebDriverUtility();
	public SS_DropdownUtility drpU=new SS_DropdownUtility();
	
	@BeforeClass
	public void launchingBrowser() throws IOException
	{
		System.out.println("----Launching browser----");
		String browser=data.dataFromPropertiesFile("browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		
		String URL=data.dataFromPropertiesFile("url");
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void loginToApplication() throws IOException
	{
		System.out.println("----Login to Application----");
		SS_WelcomePage wlp=new SS_WelcomePage(driver);
		wlp.getMainLoginButton().click();
		SS_LoginPage login=new SS_LoginPage(driver);
		String emailId=data.dataFromPropertiesFile("email");
		login.getEmailTextField().sendKeys(emailId);
		String password=data.dataFromPropertiesFile("password");
		login.getPasswordTextField().sendKeys(password);
		login.getLoginButton().click();
	}
	
	@AfterMethod
	public void logoutFromApplication()
	{
		System.out.println("----Logout from Application----");
		SS_HomePage hp=new SS_HomePage(driver);
		//hp.getAccountSettingsIcon().click();
		SS_AccountSettingsPage setting=new SS_AccountSettingsPage(driver);
		setting.getLogoutIcon().click();
	}
	
	@AfterClass
	public void quitBrowser()
	{
		System.out.println("----Quit the Browser----");
		driver.quit();
	}
	
	
}
