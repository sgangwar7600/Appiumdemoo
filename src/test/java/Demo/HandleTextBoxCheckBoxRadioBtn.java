package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;


public class HandleTextBoxCheckBoxRadioBtn  {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
	DesiredCapabilities capabilities = new DesiredCapabilities();
	
//	capabilities.setCapability("deviceName", "AndroidEmulator");
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
	
	driver.findElements(By.id("android:id/text1")).get(4).click();
	
	driver.findElements(By.id("android:id/text1")).get(0).click();

	driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("prachi gupta");
	
	driver.findElement(By.id("io.appium.android.apis:id/check1")).click();
	
	driver.findElement(By.id("io.appium.android.apis:id/radio2")).click();
	
	System.out.println("succesfully executed before ");
	
	driver.quit();

	System.out.println("succesfully executed after");
	
	
	
}
}