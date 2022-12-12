package stepDifinations;

import com.BaseGenricActionMethods.GenricBaseMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClickOnSpecificLinkExcution extends GenricBaseMethods {
	
	@When("I tap on  my app")
	public void i_tap_on_my_app() throws Exception {
	   launchApk_switchCase();
	}

	@And("click on specific link")
	public void click_on_specific_link() throws InterruptedException {
	   click_specifcLink("android.widget.TextView","Media");
	}

	@Then("validate text after click")
	public void validate_text_after_click() {
	    validate_ElementDisplayedByXpath("//android.widget.TextView[@content-desc=\"MediaPlayer\"]");
	}

	
	

}
