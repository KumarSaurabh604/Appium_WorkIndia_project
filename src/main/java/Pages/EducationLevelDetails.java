package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EducationLevelDetails {

	AppiumDriver driver;

	public EducationLevelDetails(AppiumDriver driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;

	}

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/et_skill_1")
	private AndroidElement Knowledge;

	@AndroidFindBy(xpath = "//*[@text='Computer']")
	private AndroidElement Specialization;

	@AndroidFindBy(id = "android:id/button1")
	private AndroidElement ClickSubmitbtn;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/et_course")
	private AndroidElement Degree;

	@AndroidFindBy(xpath = "//android.widget.ListView/android.widget.CheckedTextView[11]")
	private AndroidElement SelectDegree;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_done")
	private AndroidElement FinalSubmitbutton;

	public void SelectKnowledge() {
		Knowledge.click();
	}

	public void YourSpecialization() {
		Specialization.click();
	}

	public void ClickOnSumbitButton() {
		ClickSubmitbtn.click();
	}

	public void ClickOnDegree() {
		Degree.click();
	}

	public void SelectDegree() {
		SelectDegree.click();
	}

	public void ClickOnFinalSubmitButtonOfPage() {
		FinalSubmitbutton.click();
	}

}