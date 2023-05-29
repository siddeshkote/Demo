package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericScript.Base_Page;

public class POM extends Base_Page
{
//declaration
	@FindBy(id="email")
	private WebElement unData;
	@FindBy(name="pass")
	private WebElement pwData;
	@FindBy(xpath="//button[@name='login']")
	private WebElement lginBtn;
//Initialization
	public POM(WebDriver driver)
	{
		super(driver);
	}
//Utilization
	public void unText(String data)
	{
		unData.sendKeys(data);
	}
	public void pwText(String data1)
	{
		pwData.sendKeys(data1);
	}
	public void clickLogin()
	{
		lginBtn.click();
	}
}
