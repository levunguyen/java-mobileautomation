package mobileautomation.auto.scenario.steps;
import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mobileautomation.auto.steps.StartScreenSteps;
import net.thucydides.core.annotations.Steps;

public class StartScreenScenarioSteps {

	@Steps
	StartScreenSteps slashScreenStep;
	
	@Given("^I am on the mobile$")
	public void i_am_on_the_mobile() throws Throwable {
	    System.out.println("User is starting to use");
	}

	@When("^I click on Mappion icon$")
	public void i_click_on_Mappion_icon() throws Throwable {
		slashScreenStep.clickMappionIcon();
	}

	@Then("^I should see the start screen$")
	public void i_should_see_the_Slashscreen() throws Throwable {
		assertEquals("あなたの一歩が宝にかわる",slashScreenStep.seeSlashScreen());
		//slashScreenStep.closeTestCase();
	}
}
