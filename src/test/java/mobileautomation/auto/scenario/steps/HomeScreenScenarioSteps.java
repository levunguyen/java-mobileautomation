package mobileautomation.auto.scenario.steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import mobileautomation.auto.steps.HomeScreenSteps;
import net.thucydides.core.annotations.Steps;

public class HomeScreenScenarioSteps {

	@Steps
	HomeScreenSteps steps;
	
	@Given("^I am on the mapion home")
	public void openHomeScreen() {
		steps.openHomeScreen();
	}
	
	@Then("^I should see the character")
	public void seeTheCharacter() {
		String actualResult = steps.seeTheCharacter();
		assertEquals("今日の歩数",actualResult);
	}
}
