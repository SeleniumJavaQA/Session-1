package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_001Udemy extends BaseClass {

	@Test
	public void logging_In() {

		LoginPage lp = new LoginPage(driver);
		
		boolean b=lp.verifyST();
		logger.info("Verifying Element is present");
		Assert.assertEquals(b, true,"Not Present");
		
		String confmsg = lp.getCnfrmMsg();
		logger.info("Validating expected message");
		Assert.assertEquals(confmsg, confmsg, "Test failed");
		
	}

}
