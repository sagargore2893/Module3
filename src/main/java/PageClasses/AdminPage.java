package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.BasePage;

public class AdminPage extends BasePage{
	WebDriver driver;
	
	@FindBy(css="#menu_admin_Organization")
	private WebElement organization; 
	
	@FindBy(css="#menu_admin_viewOrganizationGeneralInformation")
	private WebElement generalinfo;
	public AdminPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnOrganization(){
		organization.click();
	}
	
	public void clickOnGenerealInformatiom(){
		generalinfo.click();
	}
	
	
	
}
