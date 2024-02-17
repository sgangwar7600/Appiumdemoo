package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppManagement {

	public static void main(String[] args) throws MalformedURLException {

		

		 DesiredCapabilities capabilities = new DesiredCapabilities();
			
//			capabilities.setCapability("deviceName", "AndroidEmulator");
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

			
			String packageName = "io.appium.android.apis";
			
			
			//terminate app
			driver.terminateApp(packageName);
			
			//remove app
			driver.removeApp(packageName);
			
			
			//installation app
			if(!driver.isAppInstalled(packageName)) {
			
			driver.installApp("C:\\Users\\Shashikant\\Appium\\apkfiles\\ApiDemos-debug.apk");
			System.out.println("app successfully install right away");
			}
			else
			{System.out.println("app already installed");}
			//activate the application
			
			//activate the app
			driver.activateApp(packageName);
			
			driver.quit();
			
			
		
	}

}
