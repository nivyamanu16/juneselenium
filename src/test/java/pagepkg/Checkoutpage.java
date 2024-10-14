package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {

	WebDriver driver;
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement addtocart;
	
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement checkoutbutton;
	
	public Checkoutpage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory .initElements(driver, this);
	}
	public void addtocartclick()
	{
		addtocart.click();
	}
	public void checkoutbutton()
	{
		checkoutbutton.click();
	}
}
