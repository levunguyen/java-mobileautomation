package mobileautomation.auto.steps;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import mobileautomation.configure.AppiumDriverConfigure;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.steps.ScenarioSteps;

public class StatisticScreenSteps extends ScenarioSteps {

	private AppiumDriverConfigure appiumDriver = AppiumDriverConfigure.getInstance();
	AppiumDriver driver = appiumDriver.getDriver();

	public void openStatisticScreen() {
		WebElement statisticBtn = driver.findElement(By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]"));
		statisticBtn.click();
	}

	public void clickOnHour() {
		WebElement hour = driver.findElement(By.name("日"));
		hour.click();
	}

	public void clickOnDay() {
		WebElement day = driver.findElement(By.name("週"));
		day.click();
	}

	public void clickOnMonth() {

	}

	public void clickOnYear() {
		WebElement month = driver.findElement(By.name("年"));
		month.click();
		
	}

	public void clickBackBnt() {
		driver.navigate().back();
	}

	public String seeCharacterOnMainScreen() {
		WebElement resultLabel = driver.findElement(By.name("今日の歩数"));
		return resultLabel.getText();

	}

	public void openSetting() {
		WebElement settingBtn = driver.findElement(org.openqa.selenium.By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.RelativeLayout[1]"));

		settingBtn.click();

	}

	public void clickOnSreenLevelup() {	
		WebElement levelUpScreen = driver.findElement(org.openqa.selenium.By.xpath(
				"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]"));
		levelUpScreen.click();
		
	}

}
