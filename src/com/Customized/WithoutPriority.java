package com.Customized;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WithoutPriority {
	
	WebDriver driver;
	@BeforeMethod
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Open the chrome browser ");
	}
	@Test
	public void launch(){
		driver.get("https://www.google.com/");
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
	}
	@Test
	public void performSearchAndClick1stLink(){
		driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");
	}
	@Test
	public void FaceBookPageTitleVerification(){
		driver.findElement(By.xpath(".//*[@title='Search']")).click();
		Assert.assertEquals(driver.getTitle().contains("Facebook"),true);
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
