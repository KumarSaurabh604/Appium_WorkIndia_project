package StepDef;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.Assert;

import Base.BaseClass;

import Pages.MainPage;
import Utils.CommonClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WrongRegistrationDef extends BaseClass {

	public final static Logger logger = Logger.getLogger(WrongRegistrationDef.class);

	MainPage page = null;
//	CommonClass comm = null;

	@Given("^User has already on the  Registration page of Application$")
	public void user_has_already_on_the_Registration_page_of_Application() throws Throwable {

		BaseClass.setUp();
	}

	@When("^User enter the Entries \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_Entries_and(String arg1, String arg2) throws Throwable {

		page = new MainPage(driver);
		page.fillName(arg1);
		page.phoneNumber(arg2);

	}

	@Then("^User click on Submit button of Application$")
	public void user_click_on_Submit_button_of_Application() throws Throwable {

		page = new MainPage(driver);
		page.ClickSubmitButton();
		
//		comm = 	new CommonClass(driver);
//		comm.TakeScreenShot();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Assert.assertNotEquals(driver.findElementByXPath("//*[@text='Job Search']").getText(), "Job Search");//this will give error because of the input phone is not valid
		logger.info("-------------------------Wrong Registration ends here---------------------------");
	}

}
