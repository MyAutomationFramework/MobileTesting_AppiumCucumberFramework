package stepDifinations;

import com.ApiDemo.Pages.SingleClickPage;
import com.BaseGenricActionMethods.GenricBaseMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckLinkIsClickableExcution extends GenricBaseMethods {
	public SingleClickPage	obj;
	@When("I click on app")
	public void i_click_on_app() throws Exception {
	  launchApk_switchCase();
	}

	@And("click on link")
	public void click_on_link() {
		
		// plase fix -- feature file is diffrent 
	    //Click_singleLink("//android.widget.TextView[@content-desc=\"App\"]");
		//obj = new SingleClickPage(driver);
	  
			//obj.clcikOnApp();
		
		
	}

//	@Then("validate click is enable")
//	public void validate_click_is_enable() {
//	   
//	}

	

}
