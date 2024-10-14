package herokuApp.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	//page factory - object repository
	//This contains objects in the page and methods that act on that objects
	
	//refine this xpath later
	
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		//super(driver);
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[normalize-space()='Add/Remove Elements']")
	WebElement Add_Remove_Elements;
	
	public Add_Remove_Page add_Remove_Element;
	
	public Add_Remove_Page AddElement() {
		
		Add_Remove_Elements.click();
		add_Remove_Element = new Add_Remove_Page(driver);
		return add_Remove_Element;
		
	}
	

	public void goTo()
	{
		driver.get("https://the-internet.herokuapp.com/");
	}
	
	
	
	
}
