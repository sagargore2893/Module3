package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.BasePage;

public class LoginPage extends BasePage {

	WebDriver driver;
	
	@FindBy(id="txtUsername")
	private WebElement username;
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(className="button")
	private WebElement loginButton;
	
	@FindBy(id="spanMessage")
    private WebElement spanMessage;	
	
	public LoginPage(WebDriver driver) {
		super(driver);	
	}

	public void loginIntoPortal(String Username, String Password){
		username.sendKeys(Username);
		password.sendKeys(Password);
		actions.waitElementToBeClickable(loginButton, 5);
		loginButton.click();
	}
	
	public String loginValidation(){
		return spanMessage.getText().trim();
	}

}
