package com.hrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.hrm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//div[@id='wrapper']")
	WebElement welcomeAdminButton;
	
	@FindBy(xpath="//div[@id='wrapper']")
	WebElement aboutDispLink;
	
    @FindBy(xpath="//div[@id='wrapper']")
	WebElement logOutLink;
	
	public HomePage(){
		PageFactory.initElements(driver,this);
	}
	
	public boolean validatedWelcomAdminButtonDisplay1(){
		return welcomeAdminButton.isDisplayed();
		
	}
  	public boolean validateWelcomAdminButtonEnable(){
		return welcomeAdminButton.isEnabled();
		
	}
	public boolean validateAboutLinkButtonDisplay(){
		return aboutDispLink.isDisplayed();
	}
	public boolean validateAboutLinkButtonEnable(){
		return aboutDispLink.isEnabled();
		
	}
	public boolean validatedLogoutButtonDisplay(){
		return logOutLink.isDisplayed();
		
	}
	public boolean validatedLogoutButtonEnable(){
		return logOutLink.isEnabled();
	
	}
	@FindBy(xpath="//div[@id='wrapper']")
	WebElement admin;
	
	public boolean validateAdminButton(){
	return admin.isEnabled();
	}
}
