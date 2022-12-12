package com.ApiDemo.Pages;

import org.openqa.selenium.support.PageFactory;

import com.BaseGenricActionMethods.GenricBaseMethods;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TouchActionDemoPage  extends GenricBaseMethods{
	
	public AppiumDriver<MobileElement> driver;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index=\"3\"]")
	 MobileElement  AppLink;
	
	
		
	//android.widget.TextView[@content-desc="App"]
	 
	
	public  TouchActionDemoPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver) ,this);
	}
	
	
	 public void tapOnLink() {
		     tap_UsingTouchActionClass(AppLink);
	 }
	
    public void vaidate_LinkIsclickable() {
    	  validate_ElementIsEnable(AppLink);
    }
	

}
