package stepDifinations;

import com.ApiDemo.Pages.LongPressPage;
import com.BaseGenricActionMethods.GenricBaseMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LongPressExcution extends GenricBaseMethods{
	public LongPressPage  obj;
	@When("I tap on my app")
	public void i_tap_on_my_app() throws Exception {
	    launchApk_switchCase();
	}

	@And("Click on View link and other link")
	public void click_on_view_link_and_other_link() {
	   obj =   new LongPressPage(driver);
	      obj.click_ViewLinkAndotherLink();
	}

	@And("press long on element")
	public void press_long_on_element() {
	   obj.longpress_OnPeopleName();
	}
	
//
//	@Then("validate  long press with is enable")
//	public void validate_long_press_with_is_enable() {
//	    
//	}

	
}
