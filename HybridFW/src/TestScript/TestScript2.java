package TestScript;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericScript.Base_Test;
import POMScript.POM;


public class TestScript2 extends Base_Test
{
@Test (dataProvider = "testdata")

public void validlogin(String d1, String d2) throws InterruptedException
{
	POM p = new POM(driver);
	p.unText(d1);
	p.pwText(d2);
	Thread.sleep(3000);
	p.clickLogin();
	Assert.fail();
}

@DataProvider(name = "testdata")
public Object[][] createData1()
{
return new Object[][] {	{"Siddesh", "1234"}};
}
}