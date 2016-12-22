package mobileautomation.auto.scenario.steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mobileautomation.auto.steps.StatisticScreenSteps;
import net.thucydides.core.annotations.Steps;

public class StatisticScreenScenarioSteps {
	
	@Steps
	StatisticScreenSteps steps;
	
	@Given("^I click on statistic")
	public void openStatisticScreen() {
		steps.openStatisticScreen();
	}

	@When("^I click on 日")
	public void clickOnHour() {
		steps.clickOnHour();
	}
	
	@When("^I click on 週")
	public void clickOnDay() {
		steps.clickOnDay();
	}
	
	@When("^I click on 月")
	public void clickOnMonth() {
		steps.clickOnMonth();
	}
	
	@When("^I click on 年")
	public void clickOnYear() {
		steps.clickOnYear();
	}
	
	@When("^I click hard back button")
	public void clickBackBnt(){
		steps.clickBackBnt();
	}
	
	@Then("I should go back to main app")
	public void backToMainApp() {
		String actual = steps.seeCharacterOnMainScreen();
		assertEquals("今日の歩数", actual);
	}
	
	@Given("^I click on setting$")
	public void openSetting() {
		steps.openSetting();
	}
	
	@When("^I click on screen levelup$")
	public void clickOnScreenLevelup() {
		steps.clickOnSreenLevelup();
	}
	
	@Then("^I am on home$")
	public void backToHome() {
		
	}
}
