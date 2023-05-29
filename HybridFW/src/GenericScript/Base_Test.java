package GenericScript;                                                                                   
                                                                                                   
import java.io.IOException;
import java.util.concurrent.TimeUnit;                                                              
                                                                                                   
import org.openqa.selenium.WebDriver;                                                              
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;                                                         
import org.testng.annotations.BeforeMethod;                                                        
                                                                                                   
public class Base_Test implements Framework_constant                                                              
{                                                                                                  
public WebDriver driver;                                                                           
                                                                                                   
@BeforeMethod                                                                                      
public void openAppln()                                                                            
                                                                                                   
	{                                                                                              
		System.setProperty(firefox_key,firefox_value);               
		driver = new FirefoxDriver();                                                              
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();                                                       
		                            
		                                                   
	}                                                                                              
@AfterMethod                                                                                       
public void closeAppln(ITestResult res) throws IOException                                                                           
	{        
		if(ITestResult.FAILURE==res.getStatus())
		{
			GenericSrcipt_SS.getPhoto(driver);
		}
		driver.close();                                                                            
	}                                                                                              
}                                                                                                  
                                                                                                   