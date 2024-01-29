package Basics;

import org.testng.annotations.Test;

public class TestngBasics {
	@Test(dependsOnMethods = "tc2",alwaysRun = true)
	public void demo()
	{
		System.out.println("printing");
	}
	
	@Test(priority = 1)
	
	public void tc1()
	{
		System.out.println("testcase 1");
	}
	
	@Test(priority = 2)
	public void tc2()
	{
		System.out.println("testcase 2"+" "+1/0);
	}

}
