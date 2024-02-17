package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class BrowserAutomation {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {


DesiredCapabilities capabilities = new DesiredCapabilities();
		
//		capabilities.setCapability("deviceName", "AndroidEmulator");
		capabilities.setCapability("deviceName", "OnePlus CPH2423");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "uiautomator2");
		//capabilities.setCapability("app", "C:\\Users\\Shashikant\\Appium\\apkfiles\\BluSmart.apk");
		capabilities.setCapability("platformversion", "14");
		
		capabilities.setCapability("browserName", "Chrome");
		capabilities.setCapability("chromedriverExecutable", "C:\\Users\\Shashikant\\eclipse-workspace\\AppiumDemo\\driver\\chromedriver-win64\\chromedriver.exe");
		//capabilities.setCapability("appPackage", "io.appium.android.apis");
		//capabilities.setCapability("appActivity" , "io.appium.android.apis.ApiDemos");
		
		URL url = URI.create("http://127.0.0.1:4723/").toURL();
		
		AndroidDriver driver = new AndroidDriver(url,capabilities);
		
		System.out.println("Application Start");
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		
		//find searchbox
		
		WebElement searchBox = driver.findElement(By.name("q"));
		
		searchBox.sendKeys("TajMahal");
		searchBox.sendKeys(Keys.RETURN);
		
		Thread.sleep(3000);
		driver.quit();

		
	}

}
