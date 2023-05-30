package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericScript.Base_Test;
import GenericScript.GenericScript_ES;
import POMScript.POM;


public class TestScript1 extends Base_Test
{
@Test 

public void validlogin() throws InterruptedException
{
	String user = GenericScript_ES.get_data("Sheet1", 0, 0);
	String pass = GenericScript_ES.get_data("Sheet1", 0, 1);
	POM p = new POM(driver);
	p.unText(user);
	p.pwText(pass);
	Thread.sleep(3000);
	p.clickLogin();
	Assert.fail();
	//updated on 30-05-2023
}

}