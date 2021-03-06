package mobileautomation.auto.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import mobileautomation.configure.AppiumDriverConfigure;
import net.thucydides.core.steps.ScenarioSteps;

public class RequestScreenSteps extends ScenarioSteps {
	private AppiumDriverConfigure appiumDriver = AppiumDriverConfigure.getInstance();
	AppiumDriver driver = appiumDriver.getDriver();
	
	public void openRequestScreen() {
		WebElement requestBnt = driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[3]/android.widget.RelativeLayout[1]"));
		requestBnt.click();
	}

	public String seeRequests() {
		WebElement requestLabel = driver.findElement(By.name("依頼リスト"));
		return requestLabel.getText();
	}

	public void openRequestCollection() {
		WebElement requestCollection = driver.findElement(By.name("住民コレクション"));
		requestCollection.click();
		//
	}

	public String seeCollectionList() {
		WebElement collectionList = driver.findElement(By.name("住民遭遇数"));
		return collectionList.getText();
	}

	public void returnMyHomePage() {
		driver.navigate().back();
		
	}
	
	

}
