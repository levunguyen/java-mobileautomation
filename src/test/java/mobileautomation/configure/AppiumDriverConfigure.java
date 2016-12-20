package mobileautomation.configure;

import java.io.File;
import java.net.URL;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AppiumDriverConfigure {

	private static AppiumDriverConfigure instance = null;
	
	public static AppiumDriver driver;
	
	public static AppiumDriverConfigure getInstance() {
		if (instance == null) {
			instance = new AppiumDriverConfigure();
		} 
		return instance;
	}
	
	
	public static AppiumDriver setUp() throws Exception {
		
		String apkpath = "//Users//nguyenle//Documents//app-dev-debug.apk";
	    File app = new File (apkpath);
	    
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("appium-version", "1.4.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "LC52AYE47582");
		capabilities.setCapability("platformVersion","4.4");
		//capabilities.setCapability("appPackage", "com.lab.mapion");
		//capabilities.setCapability("appActivity", "screen.splash.StartActivity");
		capabilities.setCapability("app","/Users/nguyenle/Documents/mapion.apk");
		driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);
		return driver;
	}
	

	public AppiumDriver getDriver() {
		return driver;
	}
	
	public static void tearDown() {
		System.out.println("END  END");
	//	driver.quit();
	}
	
}
