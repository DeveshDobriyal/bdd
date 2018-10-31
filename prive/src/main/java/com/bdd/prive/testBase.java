package com.bdd.prive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testBase {
	@Given("^As an Advisor$")
	public void  advisor_user()
	{ 
		try {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://192.168.1.107:8080/SlyAWS/?locale=en_US");
	Thread.sleep(1000);
	driver.findElement(By.xpath("")).sendKeys("NetfondsAdmin");
	driver.findElement(By.xpath("")).sendKeys("NetfondsAdmin");
	
		System.out.println("@Given--When ");
	}
	catch(Exception e)
	{
		System.out.println(e);
		
	}
	
	}
	@When("A user tries to process a new order")
	public void newOrder()
	{
		System.out.println("@When--a user tries to process a new order");
	}
	@Then("An order should be created in the Order Proposal Queue")
	public void orderCreation()
	{
		System.out.println("@Then--An order should be created in the Order Proposal Queue");
	}
	@And("If it presses the CONFIRM button it goes to Pre-trade-queue.")
	public void orderProcessed()
	{
		System.out.println("@AND--");
	}

}
