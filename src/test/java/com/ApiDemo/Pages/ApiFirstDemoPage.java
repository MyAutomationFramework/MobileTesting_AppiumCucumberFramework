package com.ApiDemo.Pages;

import org.openqa.selenium.support.PageFactory;

import com.BaseGenricActionMethods.GenricBaseMethods;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ApiFirstDemoPage {
	public AppiumDriver<MobileElement> driver;
	
	// element xapth or locate
	
	
	
	
	//construtor parameter .jo class ess ka ess class ka object banay gee vaha sat driver send karay gay 
	//  exctuin step defination say driver ko send karay gay s
	public  ApiFirstDemoPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver) ,this);
	}
	
	
	
	public void HowManylinks() {
		GenricBaseMethods.HowManylinksAvliable("android.widget.TextView",13);
	}
	
	
	// relevent methods 
	
	
	
	
}
