package Baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import fileUtillity.Readproperty;
import genericUtility.WebDriverUtility;
import listnerImplimentation.listnerClass;
import objectRepository.Homepage;
import objectRepository.LoginPage;
import objectRepository.LogoutPage;
import objectRepository.MyProfile;
import objectRepository.WelcomePage;


public class baseclass extends listnerClass
{
	public WebDriver driver;
	public static WebDriver sdriver;
	public WebDriverUtility webDriverUtility;
	
	@BeforeClass(alwaysRun = true)
	public void openBrowser() throws Throwable
	{
		driver=new ChromeDriver();
		sdriver=driver;
		driver.manage().window().maximize();
		
		Readproperty prop=new Readproperty();
		String url=prop.fetchProperty("Url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[@class='MuiButton-label'])[1]")).click();
		//WelcomePage welcomepage=new WelcomePage(driver);
		//webDriverUtility.clickOnElement(welcomepage.getLoginbutton());
		Reporter.log("Browser Opened and Navigate Successfully", true);
	}
	
	@BeforeMethod(alwaysRun = true)
	public void logintest() throws Throwable
	{
		Readproperty prop=new Readproperty();
		String username=prop.fetchProperty("Un");
		String password=prop.fetchProperty("Pwd");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getEmailTextField().sendKeys(username);
		loginpage.getPasswordTextField().sendKeys(password);
		webDriverUtility.clickOnElement(loginpage.getLoginButton());
		Homepage homepage=new Homepage(driver);
		webDriverUtility.clickOnElement(homepage.getSettingsIcon());
		webDriverUtility.clickOnElement(homepage.getMyProfile());
		homepage.getMyProfile().click();
		MyProfile myProfile=new MyProfile(driver);
		webDriverUtility.clickOnElement(myProfile.getMyAddresses());
		//SoftAssert soft=new SoftAssert();
		//soft.assertEquals(driver.getCurrentUrl().contains("user-signin"), true);
		//soft.assertAll();
        //driver.findElement(By.id("Email")).sendKeys(username);
        //driver.findElement(By.id("Password")).sendKeys(password);
        //driver.findElement(By.xpath("//span[text()='Login']")).click();
        //driver.findElement(By.xpath("(//div[text()='A'])[1]")).click();
        //driver.findElement(By.xpath("(//li[@role='menuitem'])[1] ")).click();
        //driver.findElement(By.xpath("//div[text()='My Addresses'] ")).click();
	}
	@AfterMethod(alwaysRun = true)
	public void logout() 
	{
		LogoutPage logoutpage=new LogoutPage(driver);
		webDriverUtility=new WebDriverUtility();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(logoutpage.getSettingsicon())).click();
		wait.until(ExpectedConditions.elementToBeClickable(logoutpage.getLogout())).click();
		
		
		//driver.findElement(By.xpath("//*[name()='svg'and @data-testid='SettingsIcon']")).click();
		//driver.findElement(By.xpath("(//li[@role='menuitem'])[7]")).click();
		Reporter.log("Logout Done Successfully", true);
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() 
	{
		driver.quit();
		Reporter.log("Browser Closed Successfully", true);
	}
}

