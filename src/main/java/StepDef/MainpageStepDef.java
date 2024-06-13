package StepDef;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;

import Base.BaseClass;
import Pages.SelectLanguage;
import Pages.CitySelectionDetails;
import Pages.EducationLevelDetails;
import Pages.GeneralDetails;
import Pages.MainPage;
import Utils.CommonClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainpageStepDef extends BaseClass {

	public final static Logger logger = Logger.getLogger(MainpageStepDef.class);

	MainPage start = null;
	CitySelectionDetails city = null;
	GeneralDetails general = null;
	CommonClass comm = null;
	EducationLevelDetails edu = null;
	SelectLanguage language = null;

	@Before
	public static void BeforeSuit() {

		BaseClass.startAppium();
	}

	@After
	public static void AfterSuit(Scenario scenario) {

		if (scenario.isFailed()) {

			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				// This takes a screenshot from the driver at save it to the specified location
				// File sourcePath = ((TakesScreenshot)
				// testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);

				TakesScreenshot scrShot = ((TakesScreenshot) driver);
				File sourcePath = scrShot.getScreenshotAs(OutputType.FILE);

				// Building up the destination path for the screenshot to save
				// Also make sure to create a folder 'screenshots' with in the cucumber-report
				// folder
				File destinationPath = new File(
						System.getProperty("user.dir") + "/cucumber-reports/screenshots/" + screenshotName + ".png");

				// Copy taken screenshot from source location to destination location
				FileUtils.copyFile(sourcePath, destinationPath);

				// This attach the specified screenshot to the test
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (IOException e) {
			}
		}

		BaseClass.tearDown();
		BaseClass.stopAppium();
	}

	@Given("^User has already on Registration page$")
	public void user_has_already_on_Registration_page() throws Throwable {

		BaseClass.setUp();
	}

	@When("^User enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_and(String name, String phone) throws Throwable {

		start = new MainPage(driver);
		start.fillName(name);
		start.phoneNumber(phone);
	}

	@When("^User click on Submit button$")
	public void user_click_on_Submit_button() throws Throwable {

		start = new MainPage(driver);
		start.ClickSubmitButton();
	}

	@When("^User will Select the city$")
	public void user_will_Select_the_city() throws Throwable {

		city = new CitySelectionDetails(driver);
		city.fillCityName();
	}

	@When("^User will enter the nearest \"([^\"]*)\"$")
	public void user_will_enter_the_nearest(String selectedcity) throws Throwable {

		city = new CitySelectionDetails(driver);
		city.NearByLocation(selectedcity);
	}

	@Then("^User will click on Submit button$")
	public void user_will_click_on_Submit_button() throws Throwable {

		city = new CitySelectionDetails(driver);
		city.SubmitButton();
	}

	@Then("^User will select the Gender , User chooses the qualification , User select the school medium$")
	public void user_will_select_the_Gender_User_chooses_the_qualification_User_select_the_school_medium()
			throws Throwable {

		general = new GeneralDetails(driver);
		general.GenderAndQualificationAndEducationLevel();
	}

	@Then("^User select the english fluency$")
	public void user_select_the_english_fluency() throws Throwable {
		general = new GeneralDetails(driver);
		general.EnglishFluency();

		comm = new CommonClass(driver);
		comm.verticalSwipeByPercentage(0.70, 0.10, 0.50);
	}

	@Then("^User select the experience and User select the age$")
	public void user_select_the_experience_and_User_select_the_age() throws Throwable {

		general = new GeneralDetails(driver);
		general.UserExperienceAndAge();

	}

	@Then("^User chooses the interest area$")
	public void user_chooses_the_interest_area() throws Throwable {

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		general = new GeneralDetails(driver);
		general.UserInterestArea();
	}

	@Then("^User will click on Submit btn$")
	public void user_will_click_on_Submit_btn() throws Throwable {

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		general = new GeneralDetails(driver);
		general.btnclick();

		logger.info(
				"------------------------------Name Submission scenario ends here-----------------------------------");
	}

	@Then("^User will click on Specialization$")
	public void user_will_click_on_Specialization() throws Throwable {

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		edu = new EducationLevelDetails(driver);
		edu.SelectKnowledge();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@Then("^User will select the specialiazation He Has$")
	public void user_will_select_the_specialiazation_He_Has() throws Throwable {

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		edu = new EducationLevelDetails(driver);
		edu.YourSpecialization();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@Then("^User will click on Specialization Submit button$")
	public void user_will_click_on_Specialization_Submit_button() throws Throwable {

		edu = new EducationLevelDetails(driver);
		edu.ClickOnSumbitButton();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	@Then("^User will click on Degree$")
	public void user_will_click_on_Degree() throws Throwable {

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		edu = new EducationLevelDetails(driver);
		edu.ClickOnDegree();
	}

	@Then("^User will Select the Degree He Has$")
	public void user_will_Select_the_Degree_He_Has() throws Throwable {

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		edu = new EducationLevelDetails(driver);
		edu.SelectDegree();
	}

	@Then("^User will Click On Degree Submit button$")
	public void user_will_Click_On_Degree_Submit_button() throws Throwable {

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		edu = new EducationLevelDetails(driver);
		edu.ClickOnFinalSubmitButtonOfPage();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	@Then("^User will Select Language of his/her Choice$")
	public void user_will_Select_Language_of_his_her_Choice() throws Throwable {

		language = new SelectLanguage(driver);
		language.SelectLanguage();

		logger.info(
				"---------------------------------Final Registration scenario ends here----------------------------------");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

}