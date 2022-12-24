package test1;

import java.net.URL;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.*;

import io.appium.java_client.remote.MobileCapabilityType;

public class calculadora {
	WebDriver driver;
	public void SetUp() {
		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability(CapabilityType.PLATFORM_NAME, "android");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11 RKQ1.200826.002");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "joyeuse");
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			cap.setCapability("appium:appPackage", "com.google.android.calculator");
			cap.setCapability("appium:appActivity", "com.android.calculator2.Calculator");
			cap.setCapability("appium:noReset", true);
			
			URL url = new URL("http://127.0.0.1:4723");
			driver = new RemoteWebDriver(url,cap);
			
		}catch(Exception e) {System.out.print(e);}
	}
}
