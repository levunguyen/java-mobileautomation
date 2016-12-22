package mobileautomation.auto.scenario.steps;

import cucumber.api.java.en.Given;
import mobileautomation.auto.steps.StatisticScreenSteps;
import net.thucydides.core.annotations.Steps;

public class StatisticScreenScenarioSteps {
	
	@Steps
	StatisticScreenSteps steps;
	
	@Given("^I click on statistic")
	public void openStatisticScreen() {
		steps.openStatisticScreen();
	}

}
