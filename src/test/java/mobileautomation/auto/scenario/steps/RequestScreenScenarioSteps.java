package mobileautomation.auto.scenario.steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mobileautomation.auto.steps.RequestScreenSteps;
import net.thucydides.core.annotations.Steps;

public class RequestScreenScenarioSteps {

	@Steps
	RequestScreenSteps steps;
	
	@Given("^I click on request list icon$")
	public void clickOnRequestListIcon() {
		steps.clickOnRequestListIcon();
	}
	
	@Then("^I see the list of request$")
	public void seeThelistOfRequest() {
		String actualResult = steps.seeTheListOfRequest();
		assertEquals("ミッション",actualResult);
	}
	
	@Given("^I scroll the request list") 
	public void scrollRequestList() {
		steps.scrollRequestList();
	}
	
	@When("^I click back button")
	public void exitRequestList() {
		steps.exitRequestList();
	}
	
	@Then("^I see the main page$")
	public void seeCharacterOnMainScreen() {
		String actual = steps.seeCharacterOnMainScreen();
		assertEquals("今日の歩数", actual);
	}
}
