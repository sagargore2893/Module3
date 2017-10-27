package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Common.BasePage;

public class addJobVacancyPage extends BasePage {

	WebDriver driver;
	
	@FindBy(css="#addJobVacancy>div>h1")
	private WebElement headTagAddJobVacancy;
	
	@FindBy(id="addJobVacancy_jobTitle")
	private WebElement dropdownElement;
	
	@FindBy(id="addJobVacancy_name")
	private WebElement jobVacancyName;
	
	@FindBy(id="addJobVacancy_hiringManager")
	private WebElement hiringManager;
	
	@FindBy(id="addJobVacancy_noOfPositions")
	private WebElement numberOfPosition;
	
	@FindBy(id="addJobVacancy_description")
	private WebElement description;
	
	@FindBy(id="addJobVacancy_publishedInFeed")
	private WebElement checkBox2;
	
	@FindBy(className="savebutton")
	private WebElement save;
	
	
	public addJobVacancyPage(WebDriver driver) {
		super(driver);
	}

	
	

	public void selectJobTitle(String title){
		Select jobtitle = new Select (dropdownElement);
		jobtitle.selectByVisibleText(title);
	}
	

	public  void enterJobVacancyName(String vacancyName ){
		jobVacancyName.sendKeys(vacancyName);
	}
	
	
		
	public void enterHiringManager(String manager){
		hiringManager.sendKeys(manager);
	}
	
	public void enterNumberOfPosition(int No){
		numberOfPosition.sendKeys(No + "");
	}
	
	public void enterJobDescription(String descrip){
		description.sendKeys(descrip);
	}
	
	public void uncheckCheckbox2(){
		checkBox2.click();
	}
	
	public void clickOnSubmit(){
		save.click();;
	}
}
