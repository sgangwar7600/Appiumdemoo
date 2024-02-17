package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import  io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidDriver;

public class DragAndDropDemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {


		
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

		  
        
        //find view button
       WebElement viewBtn =  driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
       viewBtn.click(); //perform click action on view button
       
       //find drag and drop button
       WebElement dragAndDropBtn =  driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]"));
       dragAndDropBtn.click(); //perform click action on view button
       
       WebElement source =  driver.findElement(By.xpath("//android.view.View[@resource-id=\"io.appium.android.apis:id/drag_dot_1\"]"));
     
       WebElement destination =  driver.findElement(By.xpath("//android.view.View[@resource-id=\"io.appium.android.apis:id/drag_dot_2\"]"));

       
       //By using touch action class
       TouchAction action = new TouchAction(driver);

   		action.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();

		 Thread.sleep(2000);
        driver.quit();//CLOSE SESSION
		
	}

}
