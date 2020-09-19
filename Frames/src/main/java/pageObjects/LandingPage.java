package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	//declaration
	@FindBy(xpath="//span[.='Login']")
	private WebElement loginbtn;
	
	//Initialization
	
	public LandingPage(WebDriver driver)
	{	
		super();
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void clickLoginbtn()
	{
		loginbtn.click();
	}
}
