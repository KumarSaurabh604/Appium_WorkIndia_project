package StepDef;

import org.apache.log4j.Logger;

import Base.BaseClass;
import Pages.UpdateUserProfile;
import cucumber.api.java.en.Then;

public class UpdateProfileStepDef extends BaseClass {
	
	public final static Logger logger = Logger.getLogger(MainpageStepDef.class);

	UpdateUserProfile update = null;

	@Then("^User will Click on Profile Icon, User Will Click On My Profile Icon$")
	public void user_will_Click_on_Profile_Icon_User_Will_Click_On_My_Profile_Icon() throws Throwable {
		update = new UpdateUserProfile(driver);
		update.ClickOnProfile();
	}

	@Then("^User Will Select School Medium$")
	public void user_Will_Select_School_Medium() throws Throwable {

	}

	@Then("^User Will Select Qualification$")
	public void user_Will_Select_Qualification() throws Throwable {
		update = new UpdateUserProfile(driver);
		update.UpdateQualification();
	}

	@Then("^User will click on Back button$")
	public void user_will_click_on_Back_button() throws Throwable {
		update = new UpdateUserProfile(driver);
		update.PressBackButton();
		
		logger.info("-----------------------------Upadate profile scenario ends here--------------------------");
	}

}
