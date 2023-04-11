package Flipkart;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.flipkart.keyword.Keyword;

import Base.BaseClass;
import Pages.HomePage;

public class HomePageTest extends BaseClass {
	public static WebDriver driver;

	@Test
	public void SearchPhoneAndClickOnByNow() throws InterruptedException {

		HomePage home = new HomePage();
		Thread.sleep(10000);
		home.closePopUp();
		home.searchProduct();
		Thread.sleep(10000);
		home.selectProduct();
		Keyword.switchWindows();
		home.clickOnBYNOWbutton();
	}

}
