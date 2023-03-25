package Flipkart;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.HomePage;

public class HomePageTest extends BaseClass {

	@Test
	public void CloseLoginPopUp() throws IOException, InterruptedException {
		HomePage home = new HomePage();
		home.closePopUp();
		home.searchProduct();
	}
}
