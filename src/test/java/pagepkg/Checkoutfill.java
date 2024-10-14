package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkoutfill {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement Firstname;
	
	@FindBy(xpath="//*[@id=\"last-name\"]")
    WebElement Lastname;
	
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement Postalcode;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement Continue;
	
}   
