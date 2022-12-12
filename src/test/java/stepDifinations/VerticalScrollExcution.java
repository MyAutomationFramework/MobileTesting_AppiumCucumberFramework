package stepDifinations;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.ClickElement;

import com.ApiDemo.Pages.verticalScrollPage;
import com.BaseGenricActionMethods.GenricBaseMethods;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerticalScrollExcution extends GenricBaseMethods{
  public verticalScrollPage obj;
  
	@When("I tap on my  appications")
	public void i_tap_on_my_appications() throws Exception {
	     launchApk_switchCase();
	}

	@And("I click on view link")
	public void i_click_on_view_link() {
		 obj=new verticalScrollPage(driver);
		   obj.click_View();
	}

	@And("I want scroll till  element")
	public void i_want_scroll_till_element() {

		obj.Scroll_tillElement();
	}
	


	@And("After scroll I clciked on link")
	public void after_scroll_i_clciked_on_link() {
  
              obj.clickElement();
}
	


//	@Then("validate element clicked")
//	public void validate_element_clicked() {
//		
//	}

}
