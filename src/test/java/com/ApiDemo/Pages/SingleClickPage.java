package com.ApiDemo.Pages;

import org.openqa.selenium.support.PageFactory;

import com.BaseGenricActionMethods.GenricBaseMethods;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SingleClickPage extends GenricBaseMethods{
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"App\"]")
	 MobileElement  AppLink;
	
	
	
	
	public  SingleClickPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver) ,this);
	}
	
	
	public void clcikOnApp() {
		clickSimple(AppLink);
	}
	
	

}
