package testpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagepkg.SaucedAddtodemo;
import pagepkg.Sauceloginpage;
import utilities.Excelutils1;


public class Saucelogintest {
	WebDriver  driver;

	
		@BeforeTest
		public void beforeclass()
		{
			driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
		}
		
		@Test
		public void loginpage () 

		{
			 Sauceloginpage p1 = new Sauceloginpage(driver);
			 SaucedAddtodemo s1= new SaucedAddtodemo(driver);
			 
		            String xl = "C:\\Users\\NIVIYA\\OneDrive\\Documents\\OneDrive\\Documents\\datadriven.xlsx";
		            String Sheet = "Sheet1";
		            int rowCount =   Excelutils1.getRowCount(xl, Sheet);
		            for (int i=1;i<=rowCount;i++)
		            {

		                        String UserName=Excelutils1.getCellValue(xl, Sheet, i, 0);
	                            System.out.println("username---"+UserName);
		                        String Pwd=Excelutils1.getCellValue(xl, Sheet, i, 1);
	                            System.out.println("password---"+Pwd);		                       
		                        p1.setValues(UserName, Pwd);              
	                            p1.loginbutton();
		                        
		            }	
		            
		            	String expectedurl="https://www.saucedemo.com/inventory.html";
		            	String actualurl= driver.getCurrentUrl();
        			  
        			     if(actualurl.equals(expectedurl))
        			     {
        			    	System.out.println("pass");
        			    	s1.addtocart();
        			     }else
        			     {
        			    	System.out.println("fail");
        			     }
        			     String parentwindow= driver.getWindowHandle(); // current window 
        					driver.findElement(By.xpath("")).click();
        					Set<String> allWindowHandles = driver.getWindowHandles();
        					for(String handle :allWindowHandles)
        						if(!handle.equalsIgnoreCase(parentwindow)) {
        							driver.switchTo().window(handle);
        							System.out.println("Title : "+driver.getTitle());
        							
        							driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")).click();
        			     
                      
          }
		}
}

	


