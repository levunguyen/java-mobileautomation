package mobileautomation.auto.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import mobileautomation.configure.AppiumDriverConfigure;
import net.thucydides.core.steps.ScenarioSteps;

public class HomeScreenSteps extends ScenarioSteps {

	private AppiumDriverConfigure appiumConfigure = AppiumDriverConfigure.getInstance();
	AppiumDriver driver ;
	
	public void openHomeScreen() {
		driver = appiumConfigure.getDriver();
	}

	public String seeTheCharacter() {
		WebElement continueBnt = driver.findElement(By.name("今日の歩数"));
		return continueBnt.getText();
	}

}
