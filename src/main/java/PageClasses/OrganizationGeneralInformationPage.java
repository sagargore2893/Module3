package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.BasePage;

public class OrganizationGeneralInformationPage extends BasePage {
 
	WebDriver driver;
	
	@FindBy(css="#genInfoHeading")
	private WebElement generalInfoHeading;
	
	@FindBy(css="#organization_name")
	private WebElement organizationName;
	
	@FindBy(css="#organization_taxId")
	private WebElement taxId;
	
	@FindBy(id="numOfEmployees")
	private WebElement noOfEmployees;
	
	@FindBy(css="#organization_registraionNumber")
	private WebElement registrationNumber;
	
	public OrganizationGeneralInformationPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean isGeneralInfoPageDisplayed(){
		return generalInfoHeading.isDisplayed();
	}
	
	public void getOrganizationName(){
		System.out.println(organizationName.getAttribute("value"));
	}
	
	public void getTaxId(){
		System.out.println(taxId.getAttribute("value"));
	}
	
	public void getNoOfEmployees(){
		System.out.println(noOfEmployees.getText());
	}
	
	public void getRegistrationNumber(){
		System.out.println(registrationNumber.getAttribute("value"));
	}
	
	

}
