package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AutomateCalc {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//gather desired capabilities
		
				DesiredCapabilities capabilities = new DesiredCapabilities();
				
//				capabilities.setCapability("deviceName", "AndroidEmulator");
				capabilities.setCapability("deviceName", "OnePlus CPH2423");
				capabilities.setCapability("platformName", "Android");
				capabilities.setCapability("automationName", "uiautomator2");
				//capabilities.setCapability("app", "C:\\Users\\Shashikant\\Appium\\apkfiles\\BluSmart.apk");
				capabilities.setCapability("platformversion", "14");
				capabilities.setCapability("appPackage", "com.oneplus.calculator");
				capabilities.setCapability("appActivity" , "com.android.calculator2.Calculator");
				
				URL url = URI.create("http://127.0.0.1:4723/").toURL();
				
				AndroidDriver driver = new AndroidDriver(url,capabilities);
				
				System.out.println("Application Start");

				//click on number 8
				
				WebElement num8 = driver.findElement(By.id("com.oneplus.calculator:id/digit_8"));
				num8.click();
				
				
				//click on plus + sign
				WebElement plus = driver.findElement(By.id("com.oneplus.calculator:id/op_add"));
				plus.click();
				
				//click on number 2
				WebElement num2 = driver.findElement(By.id("com.oneplus.calculator:id/digit_2"));
				num2.click();
				
				//click on equal sign
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
				
				
				driver.quit();
	}
	
}
