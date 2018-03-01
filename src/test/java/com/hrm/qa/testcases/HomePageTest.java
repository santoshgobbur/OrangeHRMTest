package com.hrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.HomePage;
import com.hrm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTest(){
		super();
	}
   
	@BeforeMethod
	public void setUp(){
		super.initialization();
		loginPage = new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
    @Test(priority=1)
    public void validatedWelcomAdminButtonDisplay1Test(){
		boolean flag = homePage.validatedWelcomAdminButtonDisplay1();
		Assert.assertTrue(flag);
	}
    @Test(priority=2)
	public void validateWelcomAdminButtonEnableTest(){
		boolean flag = homePage.validateWelcomAdminButtonEnable();
		Assert.assertTrue(flag);
		
	}
   @Test(priority=3)
	public void validateAboutLinkButtonDisplayTest(){
		boolean flag = homePage.validateAboutLinkButtonDisplay();
		Assert.assertTrue(flag);
    }
		
    @Test(priority=4)
	public void validateAboutLinkButtonEnableTest(){
		boolean flag = homePage.validateAboutLinkButtonEnable();
	    Assert.assertTrue(flag);
	}
    @Test(priority=5)
	public void validatedLogoutButtonDisplayTest(){
		boolean flag = homePage.validatedLogoutButtonDisplay();
		Assert.assertTrue(flag);
		
	}
    @Test(priority=6)
	public void validatedLogoutButtonEnableTest(){
		boolean flag = homePage.validatedLogoutButtonEnable();
		Assert.assertTrue(flag);
    } 
	
	@AfterMethod()
	public void end(){
		driver.quit();
	}
	@Test(priority=7)
	public void validateAdminButtonTest(){
		boolean flag = homePage.validateAdminButton();
		Assert.assertTrue(flag);
	}
}
