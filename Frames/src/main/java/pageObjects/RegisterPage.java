package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	//declaration
		@FindBy(xpath="//span[.='Register']")
		private WebElement Registerbtn;
		
		@FindBy(xpath="//h1[contains(.,'Sign Up to Rahul Shetty Academy')]")
		private WebElement SignUpText;
		
		//Initialization
		
		public RegisterPage(WebDriver driver)
		{	
			super();
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		public void clickRegisterbtn()
		{
			Registerbtn.click();
		}
		
		public String signupTxt()
		{
			 return SignUpText.getText();
			
			
		}

}
