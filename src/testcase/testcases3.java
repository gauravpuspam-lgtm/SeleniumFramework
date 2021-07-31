package testcase;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class testcases3 {
	
	@Parameters({"URL"})
	@Test
	public void WebloginCarLoan(String urlName)
	{
		System.out.println("web log in car loan ");
		System.out.println(urlName);
	}
	
	@Test
	public void LoginforWeb()
	{
		Reporter.log("Login for web based application ");
	}
	
	@Test
	public void logformozilla()
	{
	       Reporter.log("chrome log in for home laon ", true);	
	}
	@Test(groups={"Smoke"})
	public void MobileLoginCarloan()
	{
		Reporter.log(" mobile login for car loan", true);
		
	}
	@Test(dataProvider="getData")
	public void MobilesignoutcarLoan(String username, String password)
	{
		Reporter.log("Mobile sign out ");
		Reporter.log(username);
		
		Reporter.log(password);
	}
	@BeforeTest
	public void LoginAPICarloan()
	{
		Reporter.log(" Api login for car loan first",true);
	}
	@Test(dependsOnMethods={"WebloginCarLoan"})
	public void windowlogincarloan()
	{
		Reporter.log("window login car loan ",true);
	}
	@DataProvider
	public Object[][] getData()
	{
		//combination of user name password good credit history
		//user name password---- no credit history
		//fraudulent credit history 
		Object[][] data= new Object[3][2];
		//1st set
		data[0][0] = "Firstsetusername";
		data[0][1] = "password";
		//2nd set
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		//3rd set
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
	}
	
}
