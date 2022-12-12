package com.utility;

import org.testng.annotations.Test;

public class TestDemo {

	 @Test
	     public void test() {
		 // config ---url
		   // String saveAppiumUrl  =PropertyReader.getConfigProperty("appiumURL");
		   // String androidAutomationName  =PropertyReader.getConfigProperty("androidAutomationName");
		    String saveAppPackage =PropertyReader.getConfigProperty("androidAppPackage");
		    String saveAppActivity  =PropertyReader.getConfigProperty("androidAppActivity");
		    
		      // System.out.println(saveAppiumUrl);
		      // System.out.println(androidAutomationName);
		       System.out.println(saveAppPackage);
		       System.out.println(saveAppActivity);
	     }
	
		

	}


