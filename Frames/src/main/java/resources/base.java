package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base {
	
	public WebDriver driver;
	
	public Properties prop;
	
	@BeforeMethod
	
	public void openBrowser() throws IOException
	{
		driver=initializeDriver();
	}

	public WebDriver initializeDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("F:\\Automations\\Frames\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser");
			
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Automations\\Frames\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}else if(browser.equals("IE"))
		{
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
