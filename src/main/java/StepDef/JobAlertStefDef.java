package StepDef;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.Assert;

import Base.BaseClass;
import Pages.CreateJobAlert;
import Utils.CommonClass;
import cucumber.api.java.en.Then;

public class JobAlertStefDef extends BaseClass {
	
	public final static Logger logger = Logger.getLogger(WrongRegistrationDef.class);
	
//	CommonClass comm = null;
	CreateJobAlert job = null;

	@Then("^User will Click On create Job Alert$")
	public void user_will_Click_On_create_Job_Alert() throws Throwable {
		
		job = new CreateJobAlert(driver);
		job.ClickJobAlert();
	}

	@Then("^User will click on Job Alert submit button$")
	public void user_will_click_on_Job_Alert_submit_button() throws Throwable {
		job = new CreateJobAlert(driver);
		job.ClickJobAlertSubmitBtn();

//		comm = new CommonClass(driver);
//		comm.TakeScreenShot();
				
		Assert.assertNotEquals(driver.findElementByXPath("//*[@text='SUBMIT']").getText(), "SUBMIT");//this will show the error because fields are empty

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("-----------------------Job alert scenario ends here--------------------------");
	}
}
