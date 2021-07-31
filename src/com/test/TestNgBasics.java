package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 /*setup system property for chrome 
    login to app 
	launch chrome browser 
	enter ulr 
	google title Test
	logout from app 
	close Browser
	delete all cookeis 
	PASSED: googletitle*/




public class TestNgBasics {
	
	@BeforeSuite
	public void setUp(){
		System.out.println("@BeforeSuite---setup system property for chrome ");
	}
	
	@BeforeTest
	public void launchBrowsers(){
		System.out.println("@BeforeTest----launch chrome browser ");
	}
	
	@BeforeClass
	public void login()
	{
		System.out.println("@BeforeClass--- login to app");
	}
	
	@BeforeMethod
	public void enterURL(){
		System.out.println("@BeforeMethod--- enter ulr ");
	}
	
	/*@BeforeSuite---setup system property for chrome 
	@BeforeTest----launch chrome browser 
	@BeforeClass--- login to app
	
	@BeforeMethod--- enter ulr 
	@Test--- google logo Test 
	@AfterMethod--- logout from app 
	
	@BeforeMethod--- enter ulr 
	@Test--- google title Test
	@AfterMethod--- logout from app 
	
	@BeforeMethod--- enter ulr 
	@Test--- search test 
	@AfterMethod--- logout from app 
	
	@AfterClass--- close Browser
	@AfterTest--- delete all cookeis 
	*/
	@Test
	public void googletitle(){
		System.out.println("@Test--- google title Test");
	}
	
	@Test
	public void searchTest(){
		System.out.println("@Test--- search test ");
	}
	
	@Test
	public void googlelogoTest(){
		System.out.println("@Test--- google logo Test ");
	}
	
	@AfterMethod
	public void logout(){
		System.out.println("@AfterMethod--- logout from app ");
	}
	
	@AfterTest
	public void deleteCookeis(){
		System.out.println("@AfterTest--- delete all cookeis ");
	}
	
	@AfterClass
	public void closeBrowser(){
		System.out.println("@AfterClass--- close Browser");
	}

}
