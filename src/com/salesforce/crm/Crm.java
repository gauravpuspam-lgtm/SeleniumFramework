package com.salesforce.crm;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Crm 
{
	
	@Test
    public void newCompaign()
    {
    	Reporter.log("Creat new Task and Event", true);
    }
	@Test
	public void NewLead()
	{
		Reporter.log("create lead", true);
	}
	@Test
	public void NewContact()
	{
		Reporter.log("New lead contact details ", true);
	}
	@Test
	public void NewAccount()
	{
		Reporter.log("New Customer Account ", true);
	}
	@Test
	public void PotentialLead()
	{
		Reporter.log("Potential Customer", true);
	}
	@Test
	public void NewProduct()
	{
		Reporter.log("New Product", true);
	}
	@Test
	public void NewPriceBook()
	{
		Reporter.log("New Price Book", true);
	}
	@Test
	public void NewQuatation()
	{
		Reporter.log("Quataion for Customer", true);
	}
	@Test
	public void PurchaseOrder()
	{
		Reporter.log("Purchased Order", true);
	}
	@Test
	public void SalesOrder()
	{
		Reporter.log("Order Sales", true);
	}
	@Test
	public void Invoice()
	{
		Reporter.log("Print Invoice", true);
	}
}
