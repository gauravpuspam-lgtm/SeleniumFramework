package testcase;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase2 {
	@Test
	public void personalloan()
	{	
		Reporter.log("apply for personal loan ",true);
	}
	
	@BeforeTest(groups={"Smoke"})
	public void personalLoanDocument()
	{
		Reporter.log("documnet required for personal loan", true);
	}
}
