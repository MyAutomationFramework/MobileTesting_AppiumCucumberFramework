package stepDifinations;

import com.ApiDemo.Pages.TouchActionDemoPage;
import com.BaseGenricActionMethods.GenricBaseMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TouchActionclassExcution  extends GenricBaseMethods{
	public TouchActionDemoPage obj;
	@When("I  launch app")
	public void i_launch_app() throws Exception {
	    launchApk_switchCase();
	}

	@And("I tap on link useing touchAction class")
	public void i_tap_on_link_useing_touch_action_class() {
		obj= new TouchActionDemoPage(driver);
		  obj.tapOnLink();
	}

	@Then("check link is clickable")
	public void check_link_is_clickable() {
		  obj.vaidate_LinkIsclickable();
	   
}

	

}
