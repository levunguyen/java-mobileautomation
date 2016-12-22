package mobileautomation.auto.steps;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import mobileautomation.configure.AppiumDriverConfigure;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.steps.ScenarioSteps;

public class RequestScreenSteps extends ScenarioSteps {

	private AppiumDriverConfigure appiumDriver = AppiumDriverConfigure.getInstance();
	AppiumDriver driver = appiumDriver.getDriver();
	
	public void clickOnRequestListIcon() {
		WebElement requestListBnt = driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]"));
		requestListBnt.click();
	}

	public String seeTheListOfRequest() {
		WebElement resultLabel = driver.findElement(By.name("ミッション"));
		return resultLabel.getText();
	}
	
	
}
