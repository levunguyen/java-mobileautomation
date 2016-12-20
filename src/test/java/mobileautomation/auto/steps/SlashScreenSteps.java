package mobileautomation.auto.steps;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebElement;

import mobileautomation.configure.AppiumDriverConfigure;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SlashScreenSteps extends ScenarioSteps {

	private AppiumDriverConfigure appiumDriver = AppiumDriverConfigure.getInstance();
	
	private static final long serialVersionUID = 1L;

	@Step
	public void clickMappionIcon() throws Exception {
		AppiumDriverConfigure.setUp();
	}
	
	@Step
	public void seeSlashScreen() {
		WebElement name = appiumDriver.getDriver().findElement(By.name("あなたの一歩が宝にかわる"));
		System.out.println("TEXT " + name.getText());
		
	}
}
