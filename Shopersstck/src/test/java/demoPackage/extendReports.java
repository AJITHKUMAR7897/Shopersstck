package demoPackage;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Baseclass.baseclass;

@Listeners(listnerImplimentation.listnerClass.class)
public class extendReports extends baseclass
{
	@Test
	public void loginTest()
	{
		test.log(LogStatus.INFO, "Navigated to WelcomePage");
		test.log(LogStatus.INFO, "Clicked on Login button");
		Assert.fail();
		test.log(LogStatus.INFO, "Enter the username and password and clicked on login button");
	}
}