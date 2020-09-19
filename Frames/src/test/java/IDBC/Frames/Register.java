package IDBC.Frames;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.RegisterPage;
import resources.base;

public class Register extends base{
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@Test
	
	public void registerAccount() throws InterruptedException
	{
		//String url = prop.getProperty("url");
		driver.get("http://qaclickacademy.com");
		log.info("URL is entered");
		RegisterPage rp=new RegisterPage(driver);
		rp.clickRegisterbtn();
		log.info("Click on Register button");
		Thread.sleep(4000);
		String expectedval="Sign Up to Rahul Shetty Academy";
		Assert.assertEquals(rp.signupTxt(), expectedval);
		log.info("Verified text message");
	}

}
