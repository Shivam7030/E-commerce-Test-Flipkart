package Pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.keyword.Keyword;

public class HomePage {

	public WebDriver driver;
	public static WebDriverWait wait;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")
	public WebElement loginButton;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	public WebElement enterNumberOrEmail;

	@FindBy(xpath = "/html/body/div[2]/div/div/button")
	public WebElement closeLoginPageButton;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	public WebElement searchBox;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")
	public WebElement searchButton;

	@FindBy(xpath = "//div[@class='col col-7-12']//*[contains(text(),'APPLE iPhone 14 (Starlight, 128 GB)')]")
	public WebElement selectProduct;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")
	public WebElement ByNowButton;

	public HomePage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	public void closePopUp() throws InterruptedException {
		closeLoginPageButton.click();
		System.out.println("Clicked On Close Button Of Login Popup Page");
	}

	public void searchProduct() {
		searchBox.click();
		searchBox.sendKeys("Iphone 14");
		searchButton.click();
	}

	public void selectProduct() {
		selectProduct.click();
	}

	public void clickOnBYNOWbutton() {
		ByNowButton.click();
	}

}