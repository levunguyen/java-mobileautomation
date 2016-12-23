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
	
	private  AppiumDriver driver;
	
	public static AppiumDriverConfigure getInstance() {
		if (instance == null) {
			instance = new AppiumDriverConfigure();
			instance.setDriver(instance.createDriver());
		} 
		return instance;
	}
	
	
	public AppiumDriver createDriver() {
		
		String apkpath = "//Users//nguyenle//Documents//app-dev-debug.apk";
	    File app = new File (apkpath);
	    
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("appium-version", "1.4.8");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "192.168.56.101:5555");
		capabilities.setCapability("platformVersion","4.4");
		capabilities.setCapability("app","/Users/nguyenle/Documents/mapion.apk");
		try {
		driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return driver;
	}
	

	public AppiumDriver getDriver() {
		return driver;
	}
	
	public void setDriver(AppiumDriver driver) {
		this.driver = driver;
	}
	
	public static void tearDown() {
		System.out.println("END  END");
	//	driver.quit();
	}
	
}
