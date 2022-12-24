package test1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.URL;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.*;

import io.appium.java_client.remote.MobileCapabilityType;

public class CalculadoraTNG {
	
	WebDriver driver;
	By firsnumber = By.xpath("//android.widget.ImageButton[@content-desc=\"2\"]");
	By secondnumber = By.xpath("//android.widget.ImageButton[@content-desc=\"8\"]");
	By sum = By.xpath("//android.widget.ImageButton[@content-desc=\"más\"]");
	By result = By.xpath("//android.widget.ImageButton[@content-desc=\"igual a\"]");
	
	@BeforeClass
	  public void setUp() {
		  try {
			  	
				DesiredCapabilities cap = new DesiredCapabilities();
				
				cap.setCapability(CapabilityType.PLATFORM_NAME, "android");
				cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11 RKQ1.200826.002");
				cap.setCapability(MobileCapabilityType.DEVICE_NAME, "joyeuse");
				cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
				cap.setCapability("appium:appPackage", "com.google.android.calculator");
				cap.setCapability("appium:appActivity", "com.android.calculator2.Calculator");
				cap.setCapability("appium:noReset", true);
				cap.setCapability("appium:noSign", true);
				cap.setCapability("appium:autoGrantPermissions", true);
				
				URL url = new URL("http://127.0.0.1:4723/wd/hub");
				driver = new RemoteWebDriver(url,cap);
				
			}catch(Exception e) {System.out.print(e);}
	  }
	  @Test
	  public void testSum() {
		  try {
			  driver.findElement(firsnumber).click();
			  driver.findElement(sum).click();
			  driver.findElement(secondnumber).click();;
			  driver.findElement(result).click();
		  }catch(Exception e) {System.out.print(e);}
	  }
  
}
