package testRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
				features =	//{"src/test/feature/features/howManyLink.feature"},
							//{"src/test/feature/features/ClickOnSpecifcLink.feature"},
							//	{"src/test/feature/features/ClickOneByOneAllLinks.feature"},
								//{"src/test/feature/features/checkLinkIsClickable.feature"},	
								//{"src/test/feature/features/TouchActionClassClickTap.feature"},
								//{"src/test/feature/features/LongPress.feature"},
								{"src/test/feature/features/VerticalScroll.feature"},
								
						plugin={
				                "pretty",
				              "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", // extent report plagin
				                "json:target/cucumber-jason-reports/Cucumber.json",
				                "html:target/cucumber-html-reports/cucumber.html", // html report with screen shot  
				                 "junit:target/cucumber-xml-reports/Cucumber.xml",
				                "json:target/cucumber.json"},
						
								glue= {"stepDifinations"},
				dryRun = false,
				monochrome = true
)
public class TestRunner {

}
