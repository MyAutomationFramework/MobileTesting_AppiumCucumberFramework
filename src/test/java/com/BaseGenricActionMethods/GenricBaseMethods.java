package com.BaseGenricActionMethods;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


import com.aventstack.extentreports.Status;
import com.utility.PropertyReader;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.Scenario;

public class GenricBaseMethods  {
	public static final long WAIT=10;
	public AppiumDriverLocalService service; 
	public static AppiumDriver<MobileElement> driver;
	 public static String savePlatFormName;
	 
public  void statrtServerhurray() {
		// first three four methods for hook anotasion 
		// start server 
				 String NodeExePath="C:\\Program Files\\nodejs\\node.exe";
				 String NodeJsMainPath ="C:\\Users\\Shaily's Pc\\AppData\\Local\\Programs\\Appium Server GUI\\resources\\app\\node_modules\\appium\\build\\lib\\main.js";
				          service=AppiumDriverLocalService
				        		                   .buildService(new AppiumServiceBuilder()
				        		                   .usingDriverExecutable(new File(NodeExePath))
			       		                   .withAppiumJS(new File(NodeJsMainPath))
			       		                   .withLogFile(new File("C:\\Users\\Shaily's Pc\\OneDrive\\Desktop\\appiumlog\\new 1.txt"))); // log genrate
			      		           service.start();          
				           System.out.println(" server start hurray....");	
				          }
	          // ******************************************
	                          // start server singleton way 
 
    public void getstartSeverService() {
    	 
    	if(service==null) {
    		
    		 String NodeExePath="C:\\Program Files\\nodejs\\node.exe";
			 String NodeJsMainPath ="C:\\Users\\Shaily's Pc\\AppData\\Local\\Programs\\Appium Server GUI\\resources\\app\\node_modules\\appium\\build\\lib\\main.js";
			          service=AppiumDriverLocalService
			        		                   .buildService(new AppiumServiceBuilder()
			        		                   .usingDriverExecutable(new File(NodeExePath))
		       		                   .withAppiumJS(new File(NodeJsMainPath))
		       		                   .withLogFile(new File("C:\\Users\\Shaily's Pc\\OneDrive\\Desktop\\appiumlog\\new 1.txt"))); // log genrate
		      		           service.start();          
			           System.out.println(" server start hurray....");	
			          }
    	}



    public void stopServerHurray() {
		service.stop();
		System.out.println("Stop server Hurray");
	}

    
	  
	
	
	//************************************
	// useing switch case ----Launch app 
	public  void launchApk_switchCase() throws Exception {
		 String save=PropertyReader.getConfigProperty("choosePlatformName");
		
		     switch(save) {
		     case"emulator":
		     {   // emulator information
		    	 			DesiredCapabilities caps=new DesiredCapabilities();
				     		caps.setCapability(MobileCapabilityType.DEVICE_NAME,PropertyReader.getConfigProperty("Device_Name"));
				   			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,PropertyReader.getConfigProperty("androidAutomationName"));
				   			caps.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME,PropertyReader.getConfigProperty("PlatformName"));
				   			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,PropertyReader.getConfigProperty("PlatformVersion"));
			// app package activity	   					
				   			caps.setCapability("appPackage",PropertyReader.getConfigProperty("androidAppPackage"));
				   			caps.setCapability("appActivity",PropertyReader.getConfigProperty("androidAppActivity"));
				   			//caps.setCapability("autoGrantPermissions","true");
			// incialize driver
				   			System.out.println(" app or apk launch success");
					driver	 =new AndroidDriver<MobileElement>(new URL(PropertyReader.getConfigProperty("appiumURL")),caps);
				   		}
		     break;
		     
		     case"RealAndroid":
		     {
		    	 DesiredCapabilities cap1 = new DesiredCapabilities();
	  				cap1.setCapability("BROWSER_NAME",PropertyReader.getConfigProperty("BROWSERNAME"));
	  				cap1.setCapability("automationName",PropertyReader.getConfigProperty("automationName"));
	  				cap1.setCapability("VERSION",PropertyReader.getConfigProperty("VERSION"));
	  				cap1.setCapability("deviceName",PropertyReader.getConfigProperty("deviceName"));
	  				cap1.setCapability("platformName",PropertyReader.getConfigProperty("platformName"));
	  				cap1.setCapability("appPackage",PropertyReader.getConfigProperty("androidAppPackage"));
	  				cap1.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,PropertyReader.getConfigProperty("androidAppActivity"));
	  				AndroidDriver<AndroidElement> 	 driver1 = new AndroidDriver<>(new URL(PropertyReader.getConfigProperty("appiumURL")),cap1);
	  				System.out.println(" app or apk launch successssss");
		     }
		     break;
		     case"simulatour":
		     {
		    	 }
		     break;
		    
		     
		     case"Iphone":
		     {
		    	 }
		     break;
		     
		      default:
		        	throw new Exception("invalid platform");  
		     
		     }
	}

	
	
	//*****************-Launch app - if elese************************************************
	
	public static void launchApk_IFElse() throws MalformedURLException, InterruptedException {
		DesiredCapabilities	cap= new DesiredCapabilities();
		savePlatFormName =PropertyReader.getConfigProperty("choosePlatformName");
			System.out.println(savePlatFormName);
			
			if(savePlatFormName.equals("emulator")) {
			cap.setCapability(MobileCapabilityType.DEVICE_NAME,PropertyReader.getConfigProperty("Device_Name"));
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,PropertyReader.getConfigProperty("androidAutomationName"));
			cap.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME,PropertyReader.getConfigProperty("PlatformName"));
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,PropertyReader.getConfigProperty("PlatformVersion"));
//app package activity	   					
		cap.setCapability("appPackage",PropertyReader.getConfigProperty("androidAppPackage"));
		cap.setCapability("appActivity",PropertyReader.getConfigProperty("androidAppActivity"));	   	 
//incialize driver 		 
			 driver = new AndroidDriver<>(new URL(PropertyReader.getConfigProperty("appiumURL")),cap);
			System.out.println(" app or apk launch successdddddd");
			System.out.println("driver pritttttt"+driver);
			Thread.sleep(2000);
			//driver.findElement(MobileBy.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]")).sendKeys("aaabbbbbbbb");           
			//driver.findElementByAccessibilityId("test-Username").sendKeys("standard_user");
			
			}	
			
		else if(savePlatFormName.equals("RealAndroid")) {
			
				DesiredCapabilities cap1 = new DesiredCapabilities();
				cap1.setCapability("BROWSER_NAME",PropertyReader.getConfigProperty("BROWSERNAME"));
				cap1.setCapability("automationName",PropertyReader.getConfigProperty("automationName"));
				cap1.setCapability("VERSION",PropertyReader.getConfigProperty("VERSION"));
				cap1.setCapability("deviceName",PropertyReader.getConfigProperty("deviceName"));
				cap1.setCapability("platformName",PropertyReader.getConfigProperty("platformName"));
				cap1.setCapability("appPackage",PropertyReader.getConfigProperty("androidAppPackage"));
				cap1.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,PropertyReader.getConfigProperty("androidAppActivity"));
				AndroidDriver<AndroidElement> 	 driver = new AndroidDriver<>(new URL(PropertyReader.getConfigProperty("appiumURL")),cap1);
				System.out.println(" app or apk launch success");
				
				System.out.println(" app or apk launch successdddddd"+ driver);
			System.out.println("driverrr print "+driver);
				
			}	
		
		else if(savePlatFormName.equals("ios")) {
			
		}
		
		else if(savePlatFormName.equals("Iphone")) {
			
		}	
			}//end method
	
	public void takeScreenShot(Scenario scenario) {
		if(scenario.isFailed())
	{
	final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		//attach image file report(data, media type, name of the attachment);
	scenario.attach(screenshot, "image/png", scenario.getName());
	}
		}
	
	     // genric explict comman  wait 
	
	   // visibility---  we can fix wait time .--- check cucumber framework saucelab
   
     
	public void sendText(MobileElement element , String testData) {
		 waitForVisibility(element);
		 element.sendKeys(testData);
	}
	

	public void clickSimple(MobileElement element) {
		waitForVisibility(element);
		element.click();
	}
	
	public void waitForVisibility(MobileElement element) {
		 WebDriverWait wait_WithElement=new WebDriverWait(driver,WAIT); 
			 wait_WithElement.until(ExpectedConditions.visibilityOf(element));
		 }
	
	public void clear(MobileElement element) {
		waitForVisibility(element);
		element.clear();
	}
	
	// findeElements need call  wait method -- wait time we can parameter when we call that time can send 
      public  static void HowManylinksAvliable( String className, int expectedNumberofLink) {
    	List <MobileElement>   saveAllActualLink  = driver.findElements(By.className(className));
    			int saveNumberOfLink =saveAllActualLink.size();
    			System.out.println("Links  number ---->"+saveNumberOfLink);
    	         SoftAssert soft=new SoftAssert();
 	            soft.assertEquals(saveNumberOfLink, expectedNumberofLink);
 	            soft.assertAll();
    	        for(MobileElement saveElement:saveAllActualLink) {
    	        	System.out.println("element name-------->"+saveElement.getText());
    	        	}
    	            }
     
      // All element click one by one 
      public void click_AllElementOneByOne(String className, String tillLinkName ) throws InterruptedException {
    	  List <MobileElement> saveElement  = driver.findElements(By.className(className));
    	   for(int i =1; i<saveElement.size(); i++) {
    		   System.out.println("value of element is ---->"+saveElement.get(i).getText()); 
    		   // explcit wait 
    		    MobileElement    waitWithReturnElement   =  (MobileElement) WaitForElementClickable(saveElement.get(i), 10);
    		         //validate all link is clickable 
    		    validate_ElementIsEnable(waitWithReturnElement);
    		           waitWithReturnElement.click();
    		  // saveElement.get(i).click();
    		  
    		   //Thread.sleep(2000);
    		      driver.navigate().back();
    		 // Thread.sleep(2000);
    		  
    		  // kaha tuk link ko click kurwana hain , we are giving condtion 
    		  
    		  if(saveElement.get(i).getText().equals(tillLinkName)) {
    			  break;
    		  }
    	   }
      }
      
      
    // specefic link click ---> need call  wait method 
      public void click_specifcLink(String className,String ClickLinkName) throws InterruptedException {
			List<MobileElement> bts	= driver.findElementsByClassName(className);
					for(int i=0; i<bts.size(); i++) 
					    if(bts.get(i).getText().contains(ClickLinkName)) {
					    	System.out.println("LinkName--->"+bts.get(i).getText());
					    	
					    	bts.get(i).click();
					    	break;
					    	 }
      }
      
      
      // click single element
      
      public void validate_singleLink(String xpath) {
    	  
    	boolean retutrTrueOrFalse = driver.findElement(By.xpath(xpath)).isEnabled();
    	   System.out.println("pritttttttttt-------?"+retutrTrueOrFalse);
      }
      
      			//click single element with java excuter
      
      public static void clickBy_javaExcutu(WebElement element ,int timeout) {
     	  WebElement	 element1=WaitForElementClickable(element,timeout);                   
    	    	 JavascriptExecutor executor = (JavascriptExecutor)driver;
    	    	  executor.executeScript("arguments[0].click();", element1);}
    	    	  
    	    	  
  //********************************validate Methods*********need call  wait method -- we can add one more parameter for time . eask element  we can proide time 
      public void validate_ElementDisplayed(MobileElement element) {
     	 SoftAssert soft=new SoftAssert();
  		    boolean returntrueOrFalse= element.isDisplayed();
  		    	System.out.println("printttttttttttassertinnnn-->"+returntrueOrFalse);
  		    soft.assertTrue(returntrueOrFalse);
  		    	 soft.assertAll();
      }

        
        	//need call  wait method 
      public void validate_ElementDisplayedByXpath(String xpath) {
    	  
    	  
     	 SoftAssert soft=new SoftAssert();
  		    boolean returntrueOrFalse= driver.findElement(By.xpath(xpath)).isDisplayed();
  		    	System.out.println("printttttttttttassertinnnn-->"+returntrueOrFalse);
  		    soft.assertTrue(returntrueOrFalse);
  		    	 soft.assertAll();
      }
         
	
      
      public void validate_buttonSelectable(MobileElement element) {
    	  SoftAssert soft=new SoftAssert();
		    boolean returntrueOrFalse= element.isSelected();
		    System.out.println("printttt Return value-->"+returntrueOrFalse);
		    soft.assertTrue(returntrueOrFalse);
		    	 soft.assertAll();
      }
	
	// button ,hyper link image radui button 
      public void validate_ElementIsEnable(MobileElement element) {
    	  			MobileElement elementWithWait	=(MobileElement) WaitForElementClickable(element, 10);
    	  			SoftAssert soft=new SoftAssert();
		    boolean returntrueOrFalse= elementWithWait.isEnabled();
		    	System.out.println("printt Return value -->"+returntrueOrFalse);
		    	soft.assertTrue(returntrueOrFalse);
		    	 soft.assertAll();
		    	 
		    	  }
      
       public void validate_ExpectActual(MobileElement Element,String expectElement) {
			waitForVisibility(Element);  
		String actualElmentText	=Element.getText();
		System.out.println("Actaul testttttt   ---->"+actualElmentText);
		SoftAssert	soft  = new SoftAssert();
		soft.assertEquals(actualElmentText, expectElement);
		soft.assertAll();
	
}

      //********************************* explicit wait by condition ********************************************************
      public static WebElement WaitForElementClickable(WebElement element1 , int timeout) 
     	{
     		WebDriverWait wait = new WebDriverWait(driver, timeout);
     		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(element1));
     				return element;
     	}
      
      
      public static WebElement WaitForVisibilityOf(WebElement element1, int timeout) // jo method call karaga vo ess ko value bhayjayga 
   	{
   		WebDriverWait wait = new WebDriverWait(driver,timeout);
   		WebElement element = wait.until(ExpectedConditions.visibilityOf(element1));
   		return element;
   	}
      
     // ********************************************************************************************8
      // tap or click using tap action class 
      public static void tap_UsingTouchActionClass( MobileElement elementName) 
  	{
     	MobileElement element1=null;
  		try
  		{
 		MobileElement elementWithWait=(MobileElement) WaitForVisibilityOf(elementName,10);
 				
		       AndroidTouchAction  touch    = new AndroidTouchAction(driver);
		      // Thread.sleep(2000);
		   touch.tap(TapOptions.tapOptions().withElement(ElementOption.element(elementName))).perform();
		                
		}
		catch (Exception e) 
		{
		e.printStackTrace();
      }
      
      }

      // long press 
      public void  longPress(MobileElement element) {
    	  LongPressOptions  longpressObj=new LongPressOptions();
    	   longpressObj.withDuration(Duration.ofSeconds(5)).withElement(ElementOption.element(element));
    	   AndroidTouchAction  touch    = new AndroidTouchAction(driver);
    	        touch.longPress(longpressObj).release().perform();
    	        }
      
     // scroll with AndroidUiAutomator  findElement Byid -----jiskee rehsorceid comman hum koi bhee comman class name bhee lay suktay hain 
       public void vertical_scrollTillElement(String commanResourceId ) {
    	   MobileElement list =driver.findElementById(commanResourceId);
    	   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+"new UiSelector().description(\"Visibility\"));"));
    	   // es method main visibility tuk scroll ho raha hain 
       }
     
// driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+"new UiSelector().description(\"Visibility\"));"));
    
  	    
}//end class 
