package com.hrm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("Resources/config.properties");
		    try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initialization(){
			System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
			driver = new FirefoxDriver();
            driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    //driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		   // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   // driver.get(prop.getProperty("url"));
		    driver.navigate().to(prop.getProperty("url"));
	}

}
