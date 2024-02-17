package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LongPress {

			//public static AndroidDriver driver;

	public  static AndroidDriver driver;

	
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {


		//gather desired capabilities
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
//		capabilities.setCapability("deviceName", "AndroidEmulator");
		capabilities.setCapability("deviceName", "OnePlus CPH2423");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "uiautomator2");
		//capabilities.setCapability("app", "C:\\Users\\Shashikant\\Appium\\apkfiles\\BluSmart.apk");
		capabilities.setCapability("platformversion", "14");
		capabilities.setCapability("appPackage", "com.google.android.dialer");
		capabilities.setCapability("appActivity" , "com.google.android.dialer.extensions.GoogleDialtactsActivity");
		
		URL url = URI.create("http://127.0.0.1:4723/").toURL();
		
	    driver = new AndroidDriver(url,capabilities);
		Thread.sleep(5000);
		
		System.out.println("Application Start");

		//click on number 8
		
		WebElement dialPad = driver.findElement(By.id("com.google.android.dialer:id/dialpad_fab"));
		dialPad.click();
		
		
		//click on plus + sign 09750361796
		
		 driver.findElement(By.id("com.google.android.dialer:id/zero")).click();
		 driver.findElement(By.id("com.google.android.dialer:id/nine")).click();
		 driver.findElement(By.id("com.google.android.dialer:id/seven")).click();
		 driver.findElement(By.id("com.google.android.dialer:id/five")).click();
		 //click on long press on backspace
		 
		 WebElement backSpaceBtn = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"backspace\"]"));
		 backSpaceBtn.click();
		 
		Thread.sleep(2000);	
		
		longPress(backSpaceBtn);
		
		Thread.sleep(2000);	

		driver.quit();
		
	}
	
	
	
	public static void longPress(WebElement el) throws InterruptedException {
			
		//find location of webElement
		Point location = el.getLocation();
		
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		
		
		Sequence longpress = new Sequence(finger, 1);
		
		longpress.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), location.x, location.y));
		
		longpress.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));

		
		longpress.addAction(finger.createPointerMove(Duration.ofMillis(10000), PointerInput.Origin.viewport(), location.x, location.y));

		
		longpress.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		
		
		
		//perform the sequence of action
		driver.perform(Collections.singletonList(longpress));
		
		//((AppiumDriver)driver).perform(Collections.singletonList(longpress));
		
		
		
		
		
		
		
		
	}

}
