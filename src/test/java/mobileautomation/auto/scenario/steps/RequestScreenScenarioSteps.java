package mobileautomation.auto.scenario.steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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
	
}
