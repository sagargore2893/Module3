package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Common.BasePage;

public class EditJobVacancyPage extends BasePage{

	WebDriver driver;
	
	@FindBy(className="savebutton")
	private WebElement edit;
	
	@FindBy(css="#frmAddJobVacancy>fieldset>p>input.cancel")
	private WebElement back;
	
	public EditJobVacancyPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean isEditButtonDisplayed(){
		return edit.isDisplayed();
	}

	public void clickOnBackButton(){
		back.click();
	}
}
