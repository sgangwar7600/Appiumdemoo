package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class APKInstall {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		
		//gather desired capabilities
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
//		capabilities.setCapability("deviceName", "AndroidEmulator");
		capabilities.setCapability("deviceName", "OnePlus CPH2423");

		
		capabilities.setCapability("platformName", "Android");

		capabilities.setCapability("automationName", "uiautomator2");

		capabilities.setCapability("app", "C:\\Users\\Shashikant\\Appium\\apkfiles\\BluSmart.apk");

		capabilities.setCapability("platformversion", "14");
		
		URL url = URI.create("http://127.0.0.1:4723/").toURL();
		
		AndroidDriver driver = new AndroidDriver(url,capabilities);
		
		Thread.sleep(5000);
		
		System.out.println("Application Start");
		
		driver.quit();
		
	}

}
