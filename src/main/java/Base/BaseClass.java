package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	
	static AppiumDriverLocalService service;
	public static AppiumDriver<MobileElement> driver = null;

	//Code to run property file
	static File file = new File("./src/main/java/Utils/property.properties");
    static FileInputStream fi = null;
    static Properties prop = new Properties();
    static {
        try {
            fi = new FileInputStream(file);

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        try {
            prop.load(fi);
        } catch (IOException el) {
            el.printStackTrace();
            
        }
    }
	
	public static void startAppium() {//Method to start the server
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
	}

	
	public static void setUp() {//Required capabilities for server and to start the application
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName",prop.getProperty("DeviceName"));
		capabilities.setCapability("platformName",prop.getProperty("Android"));
		capabilities.setCapability("appPackage",prop.getProperty("appPackage"));
		capabilities.setCapability("appActivity",prop.getProperty("appActivity"));
		capabilities.setCapability("platformVersion",prop.getProperty("platformVersion"));
		capabilities.setCapability("app",prop.getProperty("app"));
		try {
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	public static void tearDown() {// Method for closing the Application
		driver.quit();
	}

	public static void stopAppium() {//Method for closing the server
		service.stop();
	}

}
