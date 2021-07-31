	package testcase;

import org.testng.Reporter;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;


public class Home {
	@Test
	public void webloginhomeloan()
	{
		Reporter.log("webloginhome",true);
	}
	
	@Test
	public void mobileloginhomeloan()
	{
		Reporter.log("mobileloginhomeloan", true);
		
	}
	@Test(dependsOnMethods={"webloginhomeloan"})
	public void loginApihomeloan()
	{
		Reporter.log("loginApihomeloan",true);	
	}
	

}
