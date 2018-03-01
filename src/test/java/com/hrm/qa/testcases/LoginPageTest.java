package com.hrm.qa.testcases;

import junit.framework.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.HomePage;
import com.hrm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		super.initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String actualTitle=loginPage.validateLoginPageTitle();
		Assert.assertEquals("OrangeHRM", actualTitle);
	}
	
	@Test(priority=4)
	public void loginTest(){
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@Test(priority=3)
	public void validateOrangehrmImageTest(){
		boolean flag = loginPage.validateOrangehrmImage();
		Assert.assertTrue(flag);
	}
     
	@Test(priority=2)
	public void validateCredentialsLabelTest(){
		boolean flag = loginPage.validateCredentialsLabel();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5)
	public void validateUsernameButtonTest(){
		boolean flag = loginPage.validateUsernameButton();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=6)
	public void validatePasswordButtonTest(){
		boolean flag = loginPage.validatePasswordButton();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=7)
	public void validateloginButtonTest(){
	    boolean flag = loginPage.validateloginButton();
		Assert.assertTrue(flag);
	}
	@Test(priority=8)
    public void validateErrorMessageTest(){
		String actualErrorMessage = loginPage.validateErrorMessage();
		String expectedErrorMessage = "Username cannot be empty";
		Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
	}
	@Test(priority=9)
	public void loginFunctionTest(){
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
    @AfterMethod
	public void end(){
		driver.quit();
	}
}
