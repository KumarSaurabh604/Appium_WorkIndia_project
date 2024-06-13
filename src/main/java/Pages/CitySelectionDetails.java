package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CitySelectionDetails {

	AppiumDriver driver;

	public CitySelectionDetails(AppiumDriver driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;

	}

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/rb_delhi")
	private AndroidElement CityName;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/act_auto_complete")
	private AndroidElement Location;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_done")
	private AndroidElement SubmitButton;

	public void fillCityName() {

		CityName.click();
	}

	public void NearByLocation(String username) {

		Location.sendKeys(username);
	}

	public void SubmitButton() {

		SubmitButton.click();
	}

}
