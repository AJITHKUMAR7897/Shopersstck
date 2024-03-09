package listnerImplimentation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Baseclass.baseclass;
import genericUtility.javaUtility;
public class listnerClass implements ISuiteListener,ITestListener
{
	public static ExtentReports report;
	public static ExtentTest test;
	javaUtility javaUtility=new javaUtility();
	@Override
	public void onFinish(ISuite suite)
	{
		report.endTest(test);
		report.flush();
		Reporter.log(suite.getName() +"is finished", true);
	}
	@Override
	public void onStart(ISuite suite)
	{
		report=new ExtentReports("./AdvancedReports/"+suite.getName()+javaUtility.getSystemDateWithTime()+".html");
		Reporter.log(suite.getName() +"is started", true);
	}
	@Override
	public void onTestStart(ITestResult result)
	{
		test=report.startTest(result.getName());
		test.log(LogStatus.INFO, "Actual Test gets started");
		Reporter.log(result.getName() +"is Started", true);
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		test.log(LogStatus.PASS,result.getName()+"is passed");
		Reporter.log(result.getName() +"TestScript is Successfully executed", true);
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		test.log(LogStatus.SKIP,"TestScript has  Skipped");
		Reporter.log(result.getName() +"is skipped Successfully", true);
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		String ScreenshotPath="./Failed ScreenShots/"+ result.getName()+javaUtility.getSystemDateWithTime()+".png";
		File path=new File(ScreenshotPath);
		TakesScreenshot ts=(TakesScreenshot)baseclass.sdriver;
		File ssc=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(ssc, path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(LogStatus.INFO, test.addScreenCapture("."+ ScreenshotPath));
		test.log(LogStatus.FAIL, result.getName()+"has Failed and successfully captured the ScreenShot");
		Reporter.log(result.getName()+"is Failed and Successfully captured the ScreenShot", true);
	}
}
