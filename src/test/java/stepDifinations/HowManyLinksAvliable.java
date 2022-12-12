package stepDifinations;

import org.openqa.selenium.By;

import com.ApiDemo.Pages.ApiFirstDemoPage;
import com.BaseGenricActionMethods.GenricBaseMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HowManyLinksAvliable extends GenricBaseMethods{
	// server start and stop from hook anoatation 
	
	@When("I tap on app")
	public void i_tap_on_app() throws Exception {
		
	  launchApk_switchCase();
	  
	}

	@Then("Check Thirteen links are avliable")
	public void check_Thirteen_links_are_avliable() throws InterruptedException {
	        HowManylinksAvliable("android.widget.TextView", 13); // providing comman class name xpath 
		}

	

}
