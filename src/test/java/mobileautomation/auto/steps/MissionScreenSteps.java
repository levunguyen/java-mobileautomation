package mobileautomation.auto.steps;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import mobileautomation.configure.AppiumDriverConfigure;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.steps.ScenarioSteps;

public class MissionScreenSteps extends ScenarioSteps {

	private AppiumDriverConfigure appiumDriver = AppiumDriverConfigure.getInstance();
	AppiumDriver driver = appiumDriver.getDriver();

	public void clickOnRequestListIcon() {
		
		WebElement requestListBnt = driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]"));
		requestListBnt.click();
	}

	public String seeTheListOfRequest() {
		WebElement resultLabel = driver.findElement(By.name("ミッション"));
		return resultLabel.getText();
	}

	public void scrollRequestList() {

		Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		System.out.println("s=" + scrollStart);
		Double screenHeightEnd = dimensions.getHeight() * 0.1;
		int scrollEnd = screenHeightEnd.intValue();

		for (int i = 0; i < 10; i++) {
		//	try {
				//Thread.sleep(1000);
				driver.swipe(0, scrollStart, 0, scrollEnd, 1000);
		//	} catch (InterruptedException e) {
				//e.printStackTrace();
	//		}			

		}
	}

	public void exitRequestList() {
		driver.navigate().back();
	}

	public String seeCharacterOnMainScreen() {
		WebElement resultLabel = driver.findElement(By.name("今日の歩数"));
		return resultLabel.getText();
		
	}

}
