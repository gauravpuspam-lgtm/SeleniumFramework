package testcase;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void testA(){
		Reporter.log("hi", true);
	}
	@Test
	public void TestB(){
		Reporter.log("Bye");
	}

}
