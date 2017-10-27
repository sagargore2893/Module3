package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.BasePage;

public class Recruitment extends BasePage {
	WebDriver driver;
	
	@FindBy(id="menu_recruitment_viewCandidates")
	private WebElement candidates;
	
	@FindBy(id="menu_recruitment_viewJobVacancy")
	private WebElement vacancy;
	
	public Recruitment(WebDriver driver) {
		super(driver);
	}
	
	public void clickOnCandidates(){
		candidates.click();
	}
	
	public void clickOnVacancy(){
		vacancy.click();
	}
}
