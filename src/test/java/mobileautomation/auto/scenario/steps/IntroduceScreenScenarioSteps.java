package mobileautomation.auto.scenario.steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mobileautomation.auto.steps.IntroduceScreenSteps;
import net.thucydides.core.annotations.Steps;

public class IntroduceScreenScenarioSteps {
	
	@Steps
	IntroduceScreenSteps steps;
	
	@Given("^I am on the screen one$")
	public void i_am_on_the_screen_one() {
		steps.clickContinueOnStartScreen();
	}
	
	@When("^I click on continue button on screen one$")
	public void clickContinueOnScreen1() {
		steps.clickContinueOnScreen1();
	}
	
	@When("^I click on continue button on screen two$")
	public void clickContinueOnScreen2() {
		steps.clickContinueOnScreen2();
	}
	
	@When("^I click on continue button on screen three$")
	public void clickContinueOnScreen3() {
		steps.clickContinueOnScreen3();
	}
	
	@When("^I click on continue button on screen four$")
	public void clickContinueOnScreen4() {
		steps.clickContinueOnScreen4();
	}
	
	@Then("^I should see the introduce screen$")
	public void thenISeeIntroduceScreen() {
		
	//	assertEquals("決定");
		
	}

}
