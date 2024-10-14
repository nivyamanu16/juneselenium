package pagepkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaucedAddtodemo {
	
	WebDriver driver;
	@FindBy(xpath="//*[@class=\"btn btn_primary btn_small btn_inventory \"]")
	List<WebElement>addtocart;
	
	public SaucedAddtodemo (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void addtocart()
	{
		for(WebElement cart : addtocart)
		{
			cart.click();
		}
	}
}


