package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AutomateDialer {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {


			//gather desired capabilities
			
					DesiredCapabilities capabilities = new DesiredCapabilities();
					
//					capabilities.setCapability("deviceName", "AndroidEmulator");
					capabilities.setCapability("deviceName", "OnePlus CPH2423");
					capabilities.setCapability("platformName", "Android");
					capabilities.setCapability("automationName", "uiautomator2");
					//capabilities.setCapability("app", "C:\\Users\\Shashikant\\Appium\\apkfiles\\BluSmart.apk");
					capabilities.setCapability("platformversion", "14");
					capabilities.setCapability("appPackage", "com.google.android.dialer");
					capabilities.setCapability("appActivity" , "com.google.android.dialer.extensions.GoogleDialtactsActivity");
					
					URL url = URI.create("http://127.0.0.1:4723/").toURL();
					
					AndroidDriver driver = new AndroidDriver(url,capabilities);
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
					 driver.findElement(By.id("com.google.android.dialer:id/zero")).click();
					 driver.findElement(By.id("com.google.android.dialer:id/three")).click();
					 driver.findElement(By.id("com.google.android.dialer:id/six")).click();
					 driver.findElement(By.id("com.google.android.dialer:id/one")).click();
					 driver.findElement(By.id("com.google.android.dialer:id/seven")).click();
					 driver.findElement(By.id("com.google.android.dialer:id/nine")).click();
					 driver.findElement(By.id("com.google.android.dialer:id/six")).click();					
					
					//click on number 2
					WebElement voiceCallButton = driver.findElement(By.id("com.google.android.dialer:id/dialpad_voice_call_button"));
					voiceCallButton.click();
					
					
					Thread.sleep(10000);

					
					/*//click on equal sign
					WebElement equal = driver.findElement(By.id("com.oneplus.calculator:id/eq"));
					equal.click();
					
					//click on result sign
					WebElement result = driver.findElement(By.id("com.oneplus.calculator:id/result"));
					String resultString = result.getText();
					
					if(resultString.equals("110")) 
					{
						System.out.println("pass");
					} 
					
					else 
					{
						System.out.println("Fail");

					}
					Thread.sleep(5000);
					*/
					
					driver.quit();
		}
	}


