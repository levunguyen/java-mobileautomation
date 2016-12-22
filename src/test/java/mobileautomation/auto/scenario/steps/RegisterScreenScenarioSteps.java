package mobileautomation.auto.scenario.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mobileautomation.auto.steps.RegisterScreenSteps;
import net.thucydides.core.annotations.Steps;

public class RegisterScreenScenarioSteps {

	@Steps
	RegisterScreenSteps steps;
	
	@Given("^I am on the registor screen")
	public void onRegisterScreen() {
		steps.onRegisterScreen();
	}
	
	@When("^I enter name")
	public void enterName() {
		steps.enterName();
	}
	
	@When("^I enter birthday")
	public void enterBirthday() {
		steps.enterBirthday();
	}
	
	@When("I enter sexual")
	public void enterSexual(){
		steps.enterSexual();
	}
	
	@When("I enter zipcode")
	public void enterZipCode() {
		
	}
	
	@When("^I enter height")
	public void enterHight() {
		
	}
	
	@When("^I enter kg")
	public void enterKg() {
		
	}
	
	@When("I click register")
	public void clickRegister() {
		
	}
	
	@Then("I should get successfull message")
	public void getSuccessfulMessage() {
		
	}
	
}
