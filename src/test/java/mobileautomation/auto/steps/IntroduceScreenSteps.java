package mobileautomation.auto.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import mobileautomation.configure.AppiumDriverConfigure;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class IntroduceScreenSteps extends ScenarioSteps {

	private AppiumDriverConfigure appiumDriver = AppiumDriverConfigure.getInstance();
	AppiumDriver driver = appiumDriver.getDriver();
	private static final long serialVersionUID = 1L;

	@Step
	public void clickContinueOnStartScreen() {

		WebElement continueBnt = appiumDriver.getDriver().findElement(By.name("はじめる"));
		continueBnt.click();
	}

	@Step
	public void clickContinueOnScreen1() {
		WebElement continueBnt = appiumDriver.getDriver().findElement(By.name("決定"));
		continueBnt.click();
	}

	@Step
	public void clickContinueOnScreen2() {
		WebElement continueBnt = appiumDriver.getDriver().findElement(By.name("この子に決定"));
		continueBnt.click();
	}

	@Step
	public void clickContinueOnScreen3() {
		WebElement continueBnt = appiumDriver.getDriver().findElement(By.name("利用規約をチェックする"));
		continueBnt.click();
	}

	@Step
	public void clickContinueOnScreen4() {
//		WebElement element = appiumDriver.getDriver().findElement(By.className("android.view.View"));
//		driver.context("NATIVE_APP");
//		Dimension size = driver.manage().window().getSize();
//		System.out.println(size);
//		// Find swipe start and end point from screen's with and height.
//		// Find starty point which is at bottom side of screen.
//		int starty = (int) (size.getHeight() * 0.90);
//		// Find endy point which is at top side of screen.
//		int endy = (int) (size.getHeight() * 0.20);
//		// Find horizontal point where you wants to swipe. It is in middle of
//		// screen width.
//		int startx = size.getWidth() / 2;
//		System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);
//
//		// Swipe from Bottom to Top.
//		// driver.swipe(startx, starty, startx, endy, 300);
//		driver.swipe(startx, starty, startx, endy, 300);
//		// Swipe from Top to Bottom.
//		// driver.swipe(startx, endy, startx, starty, 100000);
//		// Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("同意する")));
        driver.findElement(By.name("同意する")).click();
      

		

	}

	@Step
	public String thenISeeIntroduceScreen() {
		WebElement continueBnt = appiumDriver.getDriver().findElement(By.name("決定"));
		return continueBnt.getText();
	}

}
