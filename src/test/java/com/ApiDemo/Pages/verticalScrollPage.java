package com.ApiDemo.Pages;

import org.openqa.selenium.support.PageFactory;

import com.BaseGenricActionMethods.GenricBaseMethods;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class verticalScrollPage extends GenricBaseMethods{
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Views\"]")
	MobileElement ViewsElement;

	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Visibility\"]")
	MobileElement Visibility;

	
	public  verticalScrollPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver) ,this);
	}
	
	public void click_View() {
		clickSimple(ViewsElement);
	}
	
	
	public void Scroll_tillElement() {
		vertical_scrollTillElement("android:id/text1"); // comman resource id for all element "
	}
	
	
	public void clickElement() {
		clickSimple(Visibility);
	}
}
