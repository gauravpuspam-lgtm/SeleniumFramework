package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	//1 //4
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.driver.chrome","D:\\Driver\\chromedriver.exe" );
		driver = new ChromeDriver();  // launch browser 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	//2 
	@Test(priority=1,groups="title")
	public void Googletitle(){
		String title = driver.getTitle();
		
		System.out.println(title);
	}
	
	@Test(priority=2,groups="logo")
	public void googleLogoTest(){
		boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();	
	}
	
	@Test(priority=3,groups="linktext")
	public void GmailLinkTest(){
		driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@Test(priority=4,groups="Test")
	public void test1(){
		System.out.println("test 1 ");
	}
	
	@Test(priority=5,groups="Test")
	public void test2(){
		System.out.println("test2");
	}
	
	@Test(priority=6)
	public void test3(){
		System.out.println("test3 ");
	}
	
	//3
	@AfterMethod
	public void tearDown(){
		driver.quit();	
	}

}
