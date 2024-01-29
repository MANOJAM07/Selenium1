package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	public Register(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "gender-male")
	WebElement maleBtn;

	@FindBy(id="gender-female")
	WebElement femaleBtn;
	
	@FindBy(id = "FirstName")
	WebElement firstNam;
	
	@FindBy(id="LastName")
	WebElement lastName;
	@FindBy(id = "Email")
	WebElement email;
	@FindBy(id="Password")
	WebElement password;
	@FindBy(id = "ConfirmPassword")
	WebElement confirmPwd;
	@FindBy(id = "register-button")
	WebElement register;
	
	
	
	public void genderMale()
	{
		maleBtn.click();
	}
	public void genderFeMale()
	{
		femaleBtn.click();
	}
	
	public void enterFirstname(String firstname)
	{
		firstNam.sendKeys(firstname);
	}
	public void enterLastname(String lastNam)
	{
		lastName.sendKeys(lastNam);
	}
	public void enterEmail(String mail)
	{
		email.sendKeys(mail);
	}
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void enterCOnfirmPwd(String Cpwd)
	{
		confirmPwd.sendKeys(Cpwd);
	}
	public void submit()
	{
		register.click();
	}
	
}
