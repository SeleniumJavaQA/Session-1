package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@title='Software Testing']")
	WebElement one_clk;

	public boolean verifyST() {
		
		return one_clk.isDisplayed();
		
	}
	
	public String getCnfrmMsg() {
		try {
			return (one_clk.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}
}
