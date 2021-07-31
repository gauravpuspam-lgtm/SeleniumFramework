package com.Customized;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomizedTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() 
	{
		System.setProperty("webdriver.driver.chrome", "D:\\Driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://selenium-examples.nichethyself.com/");
	}

	@Test(priority=1)
	public void CustomizedLink(){
		
		driver.findElement(By.linkText("Customized tours")).click();
	}

	@Test(priority=2)
	public void HomeStay(){
		driver.findElement(By.linkText("Homestays")).click();
	}

	@Test(priority=3) 
	public void EnglandCheckbox(){
		WebElement selectCheckbox = driver.findElement(By.xpath("//label[contains(text(),'England')]//input"));
		selectCheckbox.click();
	}

	@Test(priority=4)
	public void ClickContactLink(){
		
		driver.findElement(By.xpath("//button[@class='link']")).click();
	}
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}


/*1. http://selenium-examples.nichethyself.com/
2. Go to "Customized tours"
3. Select "Home Stay" in preferred stay.
4. Click on England checkbox
5. From above now click on "Contact Us" menu on top right corner
6. On "Contact Us" window, click on Search icon.
7. Enter "London" on the pop window and click on OK.
8. Close "Contact Us" window and click on "Submit" button on customized tour
 */
