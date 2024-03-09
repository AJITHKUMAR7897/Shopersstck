package testScripts;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Baseclass.baseclass;
import fileUtillity.ReadExcel;
import objectRepository.Addaddresspage;
import objectRepository.UpdatePage;
@Listeners(listnerImplimentation.listnerClass.class)
public class UpdateAddressTest extends baseclass
{
	@Test(groups = "Smoke")
	public void updateAddressTest()
	{
		Addaddresspage addaddresspage=new Addaddresspage(driver);
		
		webDriverUtility.clickOnElement(addaddresspage.getHouseinfo());
		UpdatePage updatePage=new UpdatePage(driver);
		webDriverUtility.clickOnElement(updatePage.getHouseInfoAdd());
		ReadExcel excel=new ReadExcel();
		String houseInfo=excel.FetchsimgleData("Address", 2, 3);
		webDriverUtility.sendText(updatePage.getHomeIcon(), houseInfo);
		webDriverUtility.clickOnElement(updatePage.getUpdateAddress());
		Reporter.log("Address Updated Successfully");
	}
}
//driver.findElement(By.xpath("(//*[name()='svg' and @id='editaddress_fl'])[2]")).click();
//driver.findElement(By.id("House/Office Info")).sendKeys("23/36");
//driver.findElement(By.id("Update Address")).click();
//
//Assert.fail();
////SoftAssert soft=new SoftAssert();
////soft.assertEquals(driver.getCurrentUrl().contains("editaddress"),true);
//Reporter.log("Address Updated Successfully",true);
//
////soft.assertAll();
//driver.quit();