package utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SS_DropdownUtility {

	/////*****Static Dropdown Utility**********////////

	public void selectDropdownByVisibleText(WebElement selectTag, String textValue)
	{
		Select select=new Select(selectTag);
		select.selectByVisibleText(textValue);
	}

	public void selectDropdownByValueOfAttribute(WebElement selectTag, String attributevalue)
	{
		Select select=new Select(selectTag);
		select.selectByValue(attributevalue);
	}

	public void selectDropdownByIndex(WebElement selectTag, int index)
	{
		Select select=new Select(selectTag);
		select.selectByIndex(index);
	}

	public void deselectDropdownByVisibleText(WebElement selectTag, String textValue)
	{
		Select select=new Select(selectTag);
		select.deselectByVisibleText(textValue);
	}

	public void deselectDropdownByValueOfAttribute(WebElement selectTag, String attributevalue)
	{
		Select select=new Select(selectTag);
		select.deselectByValue(attributevalue);
	}

	public void deselectDropdownByIndex(WebElement selectTag, int index)
	{
		Select select=new Select(selectTag);
		select.deselectByIndex(index);
	}

	public ArrayList<String> getOptionsOfDropdown(WebElement selectTag)
	{
		Select select=new Select(selectTag);
		List<WebElement> options = select.getOptions();
		ArrayList<String> allOptions=new ArrayList<String>();
		for(WebElement ele:options)
		{
			allOptions.add(ele.getText());
		}
		return allOptions;
	}

	public WebElement toGetParticularOptionOnIndex(WebElement selectTag, int indexOfOption)
	{
		Select select=new Select(selectTag);
		List<WebElement> options = select.getOptions();
		WebElement particularOptionDropdown=options.get(indexOfOption);
		return particularOptionDropdown;
	}


}
