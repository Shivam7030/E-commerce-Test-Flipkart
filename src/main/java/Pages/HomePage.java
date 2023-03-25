package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.keyword.keyword;


public class HomePage {

	public static WebDriver driver;

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

	public HomePage() {
		PageFactory.initElements(keyword.driver, this);
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
}
