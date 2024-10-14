package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauceloginpage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement username2;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement login;
	
	public Sauceloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setValues(String username1 ,String password1)
	
	{
		System.out.println("setvalues");
		username2.clear();
		username2.sendKeys(username1);
		password.clear();
		password.sendKeys(password1);
	}
	
	public void loginbutton()
	{
		login.click();
		
    }
	
}