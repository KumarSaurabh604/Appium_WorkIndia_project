package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MainPage {

	AppiumDriver driver;

	public MainPage(AppiumDriver driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
		
	}

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/et_name")
	private AndroidElement name;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/et_number")
	private AndroidElement number;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_submit")
	private AndroidElement submitbutton;

	public void fillName(String username) {

		name.sendKeys(username);
	}

	public void phoneNumber(String num) {

		number.sendKeys(num);
	}

	public void ClickSubmitButton() {

		submitbutton.click();
	}

}
