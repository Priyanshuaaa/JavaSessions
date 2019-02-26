package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGBasics {
	
@BeforeSuite
public void getURL()
{
	System.out.println("Launching getURL Method");
}

public void launchbrowser()
{
	System.out.println("Launching Browser Method");
}

@BeforeTest
public void login()
{
	System.out.println("Launching login Method");
}

@BeforeClass
public void homepage()
{
	System.out.println("Launching Homepage Method");
}

@BeforeMethod
public void addtocart()

{
	System.out.println("Launching add to cart Method");
}


@AfterSuite
public void getURLs()
{
	System.out.println("Ending getURL Method");
}

@AfterTest
public void logins()
{
	System.out.println("Ending login Method");
}

@AfterClass
public void homepages()
{
	System.out.println("Ending Homepage Method");
}

@AfterMethod
public void addtocarts()

{
	System.out.println("Ending add to cart Method");
}




}
