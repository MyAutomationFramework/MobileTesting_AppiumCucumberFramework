package com.ApiDemo.Pages;

import org.openqa.selenium.support.PageFactory;

import com.BaseGenricActionMethods.GenricBaseMethods;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LongPressPage extends GenricBaseMethods {
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Views\"]")
	 MobileElement  viewLink;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Expandable Lists\"]")
	MobileElement ExpandableLists;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")
	MobileElement customeAdaptor;

	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='People Names']")
	MobileElement peopleNames;

	//android.widget.TextView[@text='People Names']
	// construtor
	public  LongPressPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver) ,this);
	}
	
	public void click_ViewLinkAndotherLink() {
		
		tap_UsingTouchActionClass(viewLink);
		tap_UsingTouchActionClass(ExpandableLists);
		tap_UsingTouchActionClass(customeAdaptor);
	}
	
	
	public void longpress_OnPeopleName() {
		longPress(peopleNames);
	}
	

}
