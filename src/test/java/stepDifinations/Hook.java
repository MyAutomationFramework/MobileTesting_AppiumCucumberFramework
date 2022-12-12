package stepDifinations;



//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseGenricActionMethods.GenricBaseMethods;

import io.cucumber.java.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class Hook extends GenricBaseMethods{
	@Before
	public void startServer() {
		
		statrtServerhurray();
		
		
	}
	
	@After
	public void stopServer() {
		stopServerHurray();
		
	}
	
	// shetty and pranchi
	@AfterStep
	public void takeScreenShot(Scenario scenario) {
		if(scenario.isFailed())
	{
	final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		//attach image file report(data, media type, name of the attachment);
	scenario.attach(screenshot, "image/png", scenario.getName());
	}
	}
	
	
	}



