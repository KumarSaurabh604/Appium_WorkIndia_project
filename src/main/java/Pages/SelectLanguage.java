package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SelectLanguage {

	AppiumDriver driver;

	public SelectLanguage(AppiumDriver driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;

	}

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_english")
	private AndroidElement LanguageOption;

	public void SelectLanguage() {
		LanguageOption.click();
	}

}
