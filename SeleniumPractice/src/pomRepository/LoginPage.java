package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement password;
	
	@FindBy(id = "RememberMe")
	WebElement rememberMe;
	
	@FindBy(xpath = "//span[@class='forgot-password']/a")
	WebElement forgotPwd;
	
	@FindBy(css = ".button-1.login-button")
	WebElement login;
	
	public void enterEmail(String emaill)
	{
		email.sendKeys(emaill);
	}
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		login.click();
	}

}
