package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class day3 {

	@BeforeClass
	public void beforclass()
	{
		System.out.println("before executing any method in the class ");
	}
	
	@Test
	public void WebLoginCarLoan(String urlName)
	{
		System.out.println("web login car");
	}
	@BeforeMethod
	public void BeforeEachNDEvery()
	{
		System.out.println("i will execute before every method in day3 class ");
	}
	@AfterMethod
	public void AfterEvery()
	{
		System.out.println("i will execute before every test method in day3 class ");
	}

}
