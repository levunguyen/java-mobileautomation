package mobileautomation.auto.scenario.steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import mobileautomation.auto.steps.RequestScreenSteps;
import net.thucydides.core.annotations.Steps;

public class RequestScreenScenarioSteps {

	@Steps
	RequestScreenSteps steps;
	
	@Given("I on request screen")
	public void openRequestScreen() {
		steps.openRequestScreen();
	}
	
	@Then("I see the request")
	public void seeRequests(){
		String actual = steps.seeRequests();
		assertEquals("依頼リスト",actual);
	}
}
