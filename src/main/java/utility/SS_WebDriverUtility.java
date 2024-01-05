package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SS_WebDriverUtility {
	
	/**Author : RAJAT
	 * When we get ElementClickInterceptedException (when element is hidden by other element)
	 * then we will use javascript click
	 * it will take webdriver object and element reference on which you want to perform javascript click
	 * @param driver
	 * @param ele
	 */
	
	public void javascriptClick(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();",ele);
	}
	
	/**Author : RAJAT
	 * to avoid ElementClickInterceptedException
	 * @param driver
	 * @param ele
	 * @param data
	 */
	
	public void javascriptSendKeys(WebDriver driver, WebElement ele, String data)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value=arguments[1];",ele,data);
	}
	
	/**Author : RAJAT
	 * this method will scroll the webpage till given element
	 * @param driver
	 * @param ele
	 */
	
	public void javascriptScrollTillWebElement(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
	
	/**Author : RAJAT
	 * this method will scroll the webpage with given coordinates
	 * @param driver
	 * @param xCordinate
	 * @param yCoordinate
	 */
	
	public void javascriptScrollByCoordinates(WebDriver driver, int xCordinate, int yCoordinate)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("scrollBy("+xCordinate+","+yCoordinate+");");
	}

	/**Author : RAJAT
	 * this method will highlight the webelement border with 2px solid red colour
	 * @param driver
	 * @param ele
	 */
	
	public void javascriptHighlightWebElement(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='2px solid red';",ele);
		
	}
	
	/////*****Explicit Wait Utility**********////////
	
	/**
	 * This method will wait until given element reaches to clickable state
	 * @param locator
	 * @param driver
	 * @param timeDelay
	 */
	
	public void explicitWaitForElementClickable(By locator, WebDriver driver, int timeDelay)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeDelay));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	/**
	 * This method will wait until alert appears
	 * @param driver
	 * @param timeDelay
	 */
	
	public void explicitWaitForAlertToBePresent(WebDriver driver, int timeDelay)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeDelay));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	/**
	 * This method will wait until provided URL appears
	 * @param driver
	 * @param timeDelay
	 * @param completeUrl
	 */
	
	public void explicitWaitForUrlToBePresent(WebDriver driver, int timeDelay, String completeUrl)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeDelay));
		wait.until(ExpectedConditions.urlToBe(completeUrl));
	}
	
	/**
	 * This method will waits until the provided element is visible
	 * @param driver
	 * @param timeDelay
	 * @param ele
	 */
	
	public void explicitWaitForVisibilityOfElement(WebDriver driver, int timeDelay, WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeDelay));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	/**
	 * This method will wait until provided title appears
	 * @param driver
	 * @param timeDelay
	 * @param completeTitle
	 */
	
	public void explicitWaitForTitleToBePresent(WebDriver driver, int timeDelay, String completeTitle)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeDelay));
		wait.until(ExpectedConditions.titleIs(completeTitle));
	}
	
	
	/////*****Actions Utility**********////////
	
	/**
	 * To perform mouse hover operation on webelement
	 * @param driver
	 * @param ele
	 */
	
	public void mouseHoverAction(WebDriver driver, WebElement ele)
	{
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
	}
	
	/**
	 * To perform double click operation on webelement
	 * @param driver
	 * @param ele
	 */
	
	public void doubleClickAction(WebDriver driver, WebElement ele)
	{
		Actions action=new Actions(driver);
		action.doubleClick(ele).perform();
	}
	
	/**
	 * To perform right click operation on webelement
	 * @param driver
	 * @param ele
	 */
	
	public void rightClickAction(WebDriver driver, WebElement ele)
	{
		Actions action=new Actions(driver);
		action.contextClick(ele).perform();
	}
	
	/**
	 * To perform drag and drop operation between two elements, dragging one element and dropping on another element
	 * @param driver
	 * @param draggingElement
	 * @param droppingElement
	 */
	
	public void dragAndDropAction(WebDriver driver, WebElement draggingElement, WebElement droppingElement)
	{
		Actions action=new Actions(driver);
		action.dragAndDrop(draggingElement, droppingElement).perform();
	}
	
	/**
	 * To perform click and hold operation on an webelement
	 * @param driver
	 * @param ele
	 */
	
	public void clickAndHoldAction(WebDriver driver, WebElement ele)
	{
		Actions action=new Actions(driver);
		action.clickAndHold(ele).perform();
	}
	
	/**
	 * To perform scrolling operation till webelement appears
	 * @param driver
	 * @param ele
	 */
	
	public void scrollToWebElementByActions(WebDriver driver, WebElement ele)
	{
		Actions action=new Actions(driver);
		action.scrollToElement(ele).perform();
	}

}
