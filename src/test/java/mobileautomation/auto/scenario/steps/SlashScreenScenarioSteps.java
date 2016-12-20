package mobileautomation.auto.scenario.steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mobileautomation.auto.steps.SlashScreenSteps;
import net.thucydides.core.annotations.Steps;

public class SlashScreenScenarioSteps {

	@Steps
	SlashScreenSteps slashScreenStep;
	
	@Given("^I am on the mobile$")
	public void i_am_on_the_mobile() throws Throwable {
	    System.out.println("test");
	}

	@When("^I click on Mappion icon$")
	public void i_click_on_Mappion_icon() throws Throwable {
		
		slashScreenStep.clickMappionIcon();
	}

	@Then("^I should see the Slashscreen$")
	public void i_should_see_the_Slashscreen() throws Throwable {
		slashScreenStep.seeSlashScreen();
	}
}
