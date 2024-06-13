package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class CreateJobAlert {

	AppiumDriver driver;

	public CreateJobAlert(AppiumDriver driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;

	}

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/ll_job_alert")
	private AndroidElement JobalertBtn;

	@AndroidFindBy(xpath = "//*[@text='SUBMIT']")
	private AndroidElement AlertSubmitBtn;

	public void ClickJobAlert() throws Throwable {//method used to scroll the screen
		
		TouchAction touch = new TouchAction(driver);
		MobileElement Element = (MobileElement) driver
				.findElementById("in.workindia.nileshdungarwal.workindiaandroid:id/ll_job_alert");
		touch.tap(tapOptions().withElement(element(Element))).release().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void ClickJobAlertSubmitBtn() {
		AlertSubmitBtn.click();
	}

}