package stepDifinations;

import com.BaseGenricActionMethods.GenricBaseMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ClickOneByOneAllLinksExcution extends GenricBaseMethods{
	
	@When("I tap on   appication")
	public void i_tap_on_appication() throws Exception {
	   launchApk_switchCase();
	}

	@And("click on all links one by one")
	public void click_on_all_links_one_by_one() throws InterruptedException {
	     click_AllElementOneByOne("android.widget.TextView","Preference");    // prefrance tuk click hoga 
	}
	

}
