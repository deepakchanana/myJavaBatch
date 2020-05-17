package pkg1;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JunitPractice
{
	Scanner s=new Scanner(System.in);
	
	@BeforeClass
	public static void bclass()
	{
		System.out.println("Before CLass");
	}
	
	@AfterClass
	public static void aclass()
	{
		System.out.println("After CLass");
	}
	
	@Test
	public void abc()
	{
	System.out.println("Please enter value for firstname");	
	String first_name=s.nextLine();
	WebElement firstname=	driver.findelement(By.id("f1"));
	firstname.sendKeys(first_name);
	}
	
	@Ignore
	@Test
	public void xyz()
	{
		System.out.println("THis is my first test case");
	}
	
	@After // whatever you want to execute after test case
	public void aft()
	{  // write code here
		System.out.println("After test case");
	}

	@Before  // whatever code you want to execute before test case
	public void bef()
	{ // write code here
		System.out.println("Before test case");
	}
	

	
}
