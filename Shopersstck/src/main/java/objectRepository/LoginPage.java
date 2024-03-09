package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{

	public LoginPage(WebDriver  driver) {
		super(driver);
	}
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(id="Password")
	private WebElement PasswordTextField;
	
	@FindBy(xpath="(//span[@class='MuiButton-label'])[1]")
	private WebElement LoginButton;

	public WebElement getEmailTextField() 
	{
		return emailTextField; 
	}

	public WebElement getPasswordTextField() 
	{
		return PasswordTextField;
	}

	public WebElement getLoginButton()
	{
		return LoginButton;
	}
}
