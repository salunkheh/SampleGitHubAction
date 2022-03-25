package com.advantage.tests;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.advantage.utilities.AppData;


public class LoginTest {

	WebDriver driver;
	AppData data=new AppData();
	
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss")
			.format(Calendar.getInstance().getTime());
	
	@BeforeClass
	public void setup() {
		
		try {
  		  	//System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver");
			//System.setProperty("webdriver.gecko.driver","https://github.com/salunkheh/SampleGitHubAction/blob/main/Drivers/geckodriver");
		   // driver = new FirefoxDriver();
  		 //To trigger workflow demo login fix some issue
  		  	
  		  	FirefoxOptions options = new FirefoxOptions();
          options.setHeadless(true);
          
          //pass the options parameter in the Firefox driver declaration
           driver = new FirefoxDriver(options);
		    		
		   
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     } 
		catch (Exception e) {
		      throw new IllegalStateException("Can't start Web Driver", e);
		    }

	}
	
	@Test
	public void testLogin() throws InterruptedException {
		
		driver.get(AppData.BASEURL);
		//driver.get("https://advantage.advertiserreports.com/rip/launch/ring");
		 try{
		        AppData.waitForElement(driver, driver.findElement(By.id("rip-login-email")));
		        
		       // String loginFileName =  AppData.PASS_IMAGE_PATH + timeStamp +"_login.png";
		       // AppData.takeSnapShot(driver, loginFileName);        
		        
		        //System.out.println("Waiting for page to load....");
		        driver.findElement(By.id("rip-login-email")).sendKeys(AppData.userName);
		        driver.findElement(By.id("rip-login-password")).sendKeys(AppData.getdecodeString());
		        Thread.sleep(5000);
		        driver.findElement(By.id("rip-login-password")).submit();
		        Thread.sleep(5000);

		        //rip-user-name ng-binding      
		       // AppData.waitForElement(driver, driver.findElement(By.xpath(AppData.lgnnamepath)));
		               
		        String pathName = driver.findElement(By.className("rip-user-name")).getText();
		        System.out.println("Logged in as "+pathName);
		        
		        AppData.waitForElement(driver, driver.findElement(By.className("rip-user-name")));
		        
		        Assert.assertEquals("Harish Salunkhe", AppData.getPathName(driver, AppData.lgnnamepath));
		        
		        Assert.assertEquals("Manage", AppData.getPathName(driver, AppData.menuitempath));
			    
			    Assert.assertEquals("Campaigns", AppData.getPathName(driver, AppData.submenupath));
			       
			    Assert.assertEquals("Search", AppData.getPathName(driver, AppData.searchbtnpath));
			           
		        }catch(TimeoutException toe){
		        	System.out.println(toe.toString());
		        	
		        }
		 driver.close();
		
	}
		
}
