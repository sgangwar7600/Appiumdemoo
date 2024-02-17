package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class SwitchHandling {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		
//		capabilities.setCapability("deviceName", "AndroidEmulator");
		capabilities.setCapability("deviceName", "OnePlus CPH2423");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "uiautomator2");
		//capabilities.setCapability("app", "C:\\Users\\Shashikant\\Appium\\apkfiles\\BluSmart.apk");
		capabilities.setCapability("platformversion", "14");
		capabilities.setCapability("appPackage", "io.appium.android.apis");
		capabilities.setCapability("appActivity" , "io.appium.android.apis.ApiDemos");
		
		URL url = URI.create("http://127.0.0.1:4723/").toURL();
		
		AndroidDriver driver = new AndroidDriver(url,capabilities);
		
		System.out.println("Application Start");

		//click on number 8
		
		driver.findElements(By.id("android:id/text1")).get(11).click();
		
		
		//Scroll on WebPage	
		String MobElementToScroll = "Switches";
		
		WebElement SwitchElement = driver.findElement(AppiumBy.androidUIAutomator
				("new UiScrollable(new UiSelector().scrollable(true))" + 
		".scrollIntoView(new UiSelector().text(\"" + MobElementToScroll + "\"))"));
		
		SwitchElement.click();

		
		WebElement monitoredSwitch = driver.findElement(By.id("io.appium.android.apis:id/monitored_switch"));
		
		if(monitoredSwitch.isSelected()==true) 
		{
			System.out.println("monitored Switch is ON");
		}
		else 
		{
				System.out.println("monitored Switch is Off");
				monitoredSwitch.click();
		} 
		
		driver.quit(); 	
		
		
	}

}
