package IDBC.Frames;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class HomePage extends base{
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	@Test
	public void basePageNavigation() throws IOException
	{
		
		driver.get("http://qaclickacademy.com");
		log.info("URL is entered...");
		
		LandingPage lp=new LandingPage(driver);
		lp.clickLoginbtn();
		log.info("Clicking on Log button");
		
	}
	
	/*@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2] ;
		data[0][0]="abc";
		data[0][1]="def";
		data[1][0]="ghi";
		data[1][1]="jkl";
		return data;
		
		
	}*/

}
