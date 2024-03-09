package testScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Baseclass.baseclass;
import fileUtillity.ReadExcel;
import genericUtility.WebDriverUtility;
import objectRepository.Addaddresspage;
import objectRepository.Homepage;
import objectRepository.MyProfile;


@Listeners(listnerImplimentation.listnerClass.class)
public class AddAddressTest extends baseclass
{
	@Test
	public void addAddressTest() 
	{
		Homepage homepage=new Homepage(driver);
		WebDriverUtility webDriverUtility=new WebDriverUtility();
		webDriverUtility.clickOnElement(homepage.getSettingsIcon());
		webDriverUtility.clickOnElement(homepage.getMyProfile());
		MyProfile myprofile=new MyProfile(driver);
		webDriverUtility.clickOnElement(myprofile.getMyAddresses());
		Addaddresspage Addaddresspage=new Addaddresspage(driver);
		webDriverUtility.clickOnElement(Addaddresspage.getAddaddress1());
		webDriverUtility.clickOnElement(Addaddresspage.getHome());
		ReadExcel readexcel=new ReadExcel();
		String nameValue=readexcel.FetchsimgleData("Address", 1, 0);
		
		webDriverUtility.sendText(Addaddresspage.getName(), nameValue);
		String houseInfo=readexcel.FetchsimgleData("Address", 2, 1);
		webDriverUtility.sendText(Addaddresspage.getHouseinfo(), houseInfo);
		String streetInfo=readexcel.FetchsimgleData("Address", 3, 2);
		webDriverUtility.sendText(Addaddresspage.getStreetInfo(), streetInfo);
		String landmark=readexcel.FetchsimgleData("Address", 4, 3);
		webDriverUtility.sendText(Addaddresspage.getLandmark(), landmark);
		
		webDriverUtility.selectByVisibleText(Addaddresspage.getCountry(), "India");
		webDriverUtility.selectByVisibleText(Addaddresspage.getState(), "TamilNadu");
		webDriverUtility.selectByVisibleText(Addaddresspage.getCity(), "Nagercoil");
		
		
		String pincode=readexcel.FetchsimgleData("Address", 5, 4);
		webDriverUtility.sendText(Addaddresspage.getPincode(), pincode);
		String phonenumber=readexcel.FetchsimgleData("Address", 6, 5);
		webDriverUtility.sendText(Addaddresspage.getPhonenumber(), phonenumber);
		
		
//		driver.findElement(By.xpath("//div[text()='My Addresses']")).click();
//		driver.findElement(By.id("Home")).click();
//		driver.findElement(By.id("Name")).sendKeys("ajithkumar");
//		driver.findElement(By.id("House/Office Info")).sendKeys("23/33");
//		driver.findElement(By.id("Street Info")).sendKeys("western street");
//		driver.findElement(By.id("Landmark")).sendKeys("kanyakumari");
//		Select country=new Select(driver.findElement(By.id("Country")));
//		country.selectByVisibleText("India");
//		Select state=new Select(driver.findElement(By.id("State")));
//		state.selectByVisibleText("Tamil Nadu");
//		
//		Select city=new Select(driver.findElement(By.id("City")));
//		city.selectByVisibleText("Dharmapuri");
		
		Assert.fail();
		driver.findElement(By.id("Pincode")).sendKeys("629806");
		driver.findElement(By.id("Phone Number")).sendKeys("9876543210");
		driver.findElement(By.id("addAddress")).click();
		//SoftAssert soft=new SoftAssert();
		//soft.assertEquals(driver.getCurrentUrl().contains("addressform"),true);
		Reporter.log(" Address Added Successfully ",true);
	//	soft.assertAll();
	}
}
