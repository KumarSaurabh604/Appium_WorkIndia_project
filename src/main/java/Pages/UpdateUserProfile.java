package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UpdateUserProfile {

	AppiumDriver driver;

	public UpdateUserProfile(AppiumDriver driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;

	}

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/navigation_ham_menu")
	private AndroidElement profileIcon;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.LinearLayout")
	private AndroidElement myProfileIcon;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/ll_qualification")
	private AndroidElement Qualification;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/rb_hsc")
	private AndroidElement SelectedQualification;

	@AndroidFindBy(id = "android:id/button1")
	private AndroidElement SelectedQualificationBtn;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/ll_back")
	private AndroidElement BackButton;

	public void ClickOnProfile() {
		
		profileIcon.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		myProfileIcon.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}

	public void UpdateQualification() {
		
		Qualification.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		SelectedQualification.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		SelectedQualificationBtn.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}

	public void PressBackButton() {
		
		BackButton.click();
	}

}