package Utils;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;

public class CommonClass {

	AppiumDriver driver;

	public CommonClass(AppiumDriver driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;

	}

	public void verticalSwipeByPercentage(double startPercentage, double endPercentage, double anchorPercentage) {

		Dimension size = driver.manage().window().getSize();
		int anchor = (int) (size.width * anchorPercentage);
		int startpoint = (int) (size.height * startPercentage);
		int endpoint = (int) (size.height * endPercentage);

		new TouchAction(driver).press(point(anchor, startpoint)).waitAction(waitOptions(ofMillis(1000)))
				.moveTo(point(anchor, endpoint)).release().perform();
	}

//	public void TakeScreenShot() throws Throwable {
//		
//		String folder_name = "screenshot";
//		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy_hh_mm_ssaa");
//		new File(folder_name).mkdir();
//		String file_name = df.format(new Date()) + ".png";
//		FileUtils.copyFile(f, new File(folder_name + "/" + file_name));
//		Thread.sleep(5000);
//	}

}
