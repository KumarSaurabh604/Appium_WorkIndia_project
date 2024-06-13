package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GeneralDetails {

	AppiumDriver driver;

	public GeneralDetails(AppiumDriver driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
	}

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/rg_male")
	private AndroidElement gender_male;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/rb_graduate")
	private AndroidElement gradu_Quali;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/cb_hindi")
	private AndroidElement hindi_medium;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/rg_eng_level_2")
	private AndroidElement english_lev;

	/* <----------------------> */

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/cb_fresher")
	private AndroidElement fresh;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/et_age")
	private AndroidElement open_Age;

	@AndroidFindBy(xpath = "//android.widget.TextView[8]")
	private AndroidElement sel_Age;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.CheckBox")
	private AndroidElement interest1;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[2]/android.widget.CheckBox")
	private AndroidElement interest2;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_done")
	private AndroidElement submit_button;

	public void GenderAndQualificationAndEducationLevel() {

		gender_male.click();
		gradu_Quali.click();
		hindi_medium.click();
	}

	public void EnglishFluency() {
		english_lev.click();
	}

	public void UserExperienceAndAge() {
		fresh.click();
		open_Age.click();
		sel_Age.click();
	}

	public void UserInterestArea() {
		interest1.click();
		interest2.click();
	}

	public void btnclick() {
		submit_button.click();
	}

}