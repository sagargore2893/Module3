package TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseTest;
import PageClasses.AdminPage;
import PageClasses.Homepage;
import PageClasses.LoginPage;
import PageClasses.OrganizationGeneralInformationPage;
import PageClasses.Recruitment;
import PageClasses.VacanciesPage;


public class TestCases extends BaseTest{
	
	@Test
	public void loginWithInCorrectCredential(){
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginIntoPortal("Admin", "test123");
		Assert.assertEquals(loginPage.loginValidation(), "Invalid credentials");
	}
	
	@Test
	public void verifyVacanciesPagesIsDisplayed(){
		LoginPage loginPage = new LoginPage(driver);
		Homepage homePage = new Homepage(driver);
		Recruitment recruitment = new Recruitment(driver);
		VacanciesPage vacancies =new VacanciesPage(driver);
		loginPage.loginIntoPortal("Admin", "admin");
		homePage.clickOnRecruitmentMenu();
		recruitment.clickOnVacancy();
		Assert.assertTrue(vacancies.isVacancyTabdisplayed());
	}
	
	
	@Test
	public void printGeneralIformation(){
		LoginPage loginPage = new LoginPage(driver);
		Homepage homePage = new Homepage(driver);
		AdminPage adminPage = new AdminPage(driver);
		OrganizationGeneralInformationPage generalInfoPage = new OrganizationGeneralInformationPage(driver);
		loginPage.loginIntoPortal("Admin", "admin");
		homePage.clickOnAdminMenu();
		adminPage.clickOnOrganization();
		adminPage.clickOnGenerealInformatiom();
		Assert.assertTrue(generalInfoPage.isGeneralInfoPageDisplayed());
		generalInfoPage.getOrganizationName();
		generalInfoPage.getTaxId();
		generalInfoPage.getNoOfEmployees();
		generalInfoPage.getRegistrationNumber();
	}
	
	
	
}


