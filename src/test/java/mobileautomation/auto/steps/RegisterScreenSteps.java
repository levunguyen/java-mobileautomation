package mobileautomation.auto.steps;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import mobileautomation.configure.AppiumDriverConfigure;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;

import net.thucydides.core.steps.ScenarioSteps;

public class RegisterScreenSteps extends ScenarioSteps {

	private AppiumDriverConfigure appiumDriver = AppiumDriverConfigure.getInstance();
	AppiumDriver driver = appiumDriver.getDriver();
	
	@Step
	public void onRegisterScreen() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.name("ニックネーム"), "ニックネーム"));
	}

	@Step
	public void enterName() {
		//WebElement name = driver.findElement(By.name("1–12文字まで"));
		WebElement name = driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.EditText[1]"));
		name.sendKeys("levunguyen");
		name.submit();
	}

	@Step
	public void enterBirthday() {
		
		
		
	}

	public void enterSexual() {
				
	}

}
