package com.hrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	// Object Repository or Page Objects / WebElements
	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginButton;
	
	@FindBy(xpath=".//*[@id='divLogo']/img")
	WebElement hrmImage;
	
	@FindBy(xpath=".//*[@id='content']/div[1]/font")
	WebElement credentialLabel;
	
	@FindBy(xpath="//span[contains(text(),'Username cannot be empty')]")
	WebElement errorMessage;
	
	//Initialize Page objects
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateOrangehrmImage(){
		return hrmImage.isDisplayed();
	}
	
	public boolean validateCredentialsLabel(){
		return credentialLabel.isDisplayed();
	}
	
	public boolean validateUsernameButton(){
		return username.isEnabled();
	}
	
	
	public boolean validatePasswordButton(){
		return password.isEnabled();
	}
	

	public boolean validateloginButton(){
		return loginButton.isEnabled();
	}
	
	public String validateErrorMessage(){
		
		loginButton.click();
		return errorMessage.getText();
		
	}
	
	public HomePage login(String un,String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		
		return new HomePage();
	}
	

}
