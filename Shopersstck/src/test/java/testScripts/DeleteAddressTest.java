package testScripts;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Baseclass.baseclass;
import objectRepository.DeletePage;
import objectRepository.Homepage;
import objectRepository.MyProfile;
@Listeners(listnerImplimentation.listnerClass.class)
public class DeleteAddressTest extends baseclass
{
	@Test(groups="Regression")
	public void deleteAddressTest() throws InterruptedException
	{
		Homepage homepage=new Homepage(driver);
		
		webDriverUtility.clickOnElement(homepage.getSettingsIcon());
		webDriverUtility.clickOnElement(homepage.getMyProfile());
		MyProfile myProfile=new MyProfile(driver);
		webDriverUtility.clickOnElement(myProfile.getMyAddresses());
		DeletePage deletePage=new DeletePage(driver);
		webDriverUtility.clickOnElement(deletePage.getDeleteIcon());
		webDriverUtility.clickOnElement(deletePage.getClickYes());
		
		WebDriverWait driverWait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driverWait.until(ExpectedConditions.alertIsPresent());
		
		webDriverUtility.acceptAlert(driver);
		Reporter.log("Address Deleted Successfully");
		
	}
}		
		
//		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textError MuiButton-sizeSmall MuiButton-textSizeSmall  css-1bhvu8']")).click();
//		Assert.fail();
//		driver.findElement(By.xpath("(//button[text()='Yes'])[2]")).click();
//		//SoftAssert soft=new SoftAssert();
//		//soft.assertEquals(driver.findElement(By.xpath("//h3[text()='Remove Address']")).isDisplayed(),true);
//		Reporter.log(" Address Deleted Successfully ",true);
//		Thread.sleep(1000);
//		Alert popup=driver.switchTo().alert();
//		String text=popup.getText();
//		Reporter.log(text);
//		popup.accept();
		//soft.assertAll();