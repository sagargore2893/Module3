package PageClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Common.BasePage;

public class VacanciesPage extends BasePage {
	WebDriver driver;
	
	@FindBy(css=".head>h1")
	private WebElement headtagVacancies;
	
	@FindBy(id="btnAdd")
	private WebElement addButton;
	
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr")
	private List<WebElement> tableData;
	
	public  VacanciesPage(WebDriver driver) {
		super(driver);
	}

	public boolean isVacancyTabdisplayed(){
		return headtagVacancies.isDisplayed();
	}
	
	public void clickOnAddButton(){
		addButton.click();
	}
	
	public void printLastEnteredData(){
		System.out.println(tableData.get(tableData.size()-1).getText());
	}

}
