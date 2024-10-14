package stepDefinitions;

import java.io.IOException;

import herokuApp.PageObjects.LandingPage;
import herokuApp.PageObjects.Add_Remove_Page;
import herokuAppPractice.base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddElement extends TestBase{
	
	
	public LandingPage landingpage;
	
	public Add_Remove_Page addremovepage;
	
	@Given("I open the web page")
	public void I_open_the_web_page() throws IOException {
		landingpage= launchApplication();
	}
	
	@When ("I click the Add and Remove Elements button")
	public void I_click_the_Add_and_Remove_Elements_button() {
		landingPage.AddElement();
	}
	
	@And("I verify that I have landed in the Add and Remove elements page")
	public void I_verify_that_I_have_landed_in_the_Add_and_Remove_elements_page () {
		driver.getTitle();
	}
	
	@And("I click the Add Element button")
	public void I_click_the_Add_Element_button() throws InterruptedException {
		addremovepage= new Add_Remove_Page(driver);
		addremovepage.clickAddElement();
		Thread.sleep(3000);
	}
	
	@Then("I Verify that Element is added and Delete button is visible")
	public void I_Verify_that_Element_is_added_and_Delete_button_is_visible() throws InterruptedException {
		addremovepage.clickDeleteElement();
		Thread.sleep(3000);;
		//how to check the delete button is visible here?
		// is it write button is displayed or not method in the Add remove page?
		
	}
	
}
