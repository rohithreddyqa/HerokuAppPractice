package herokuApp.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Remove_Page {
	
	WebDriver driver;
	public Add_Remove_Page(WebDriver driver)
	{
		//super(driver);
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//button[@onclick='addElement()']")
	WebElement AddElement;
	
	@FindBy(xpath = "//button[@class='added-manually']")
	WebElement DeleteElement;
	
	
	
	public void clickAddElement()
	{
		AddElement.click();
	}
	
	public void clickDeleteElement() {
		if(!AddElement.isDisplayed()) {
			clickAddElement();
		}else {
			DeleteElement.click();
		}
	}

}
