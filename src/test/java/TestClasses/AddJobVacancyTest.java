package TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseTest;
import PageClasses.EditJobVacancyPage;
import PageClasses.Homepage;
import PageClasses.LoginPage;
import PageClasses.Recruitment;
import PageClasses.VacanciesPage;
import PageClasses.addJobVacancyPage;

public class AddJobVacancyTest extends BaseTest {

	
	@Test
	public void addJobVacancyAndVerify()  {
		LoginPage login = new LoginPage(driver);
		Homepage homepage = new Homepage(driver);
		Recruitment recruitment = new Recruitment(driver);
		VacanciesPage vacancies = new VacanciesPage(driver);
		addJobVacancyPage addJobVacancy = new addJobVacancyPage(driver);
		EditJobVacancyPage editVacancy = new EditJobVacancyPage(driver);
		
		login.loginIntoPortal("Admin", "admin");
		homepage.clickOnRecruitmentMenu();
		recruitment.clickOnVacancy();
		Assert.assertTrue(vacancies.isVacancyTabdisplayed());
		
		vacancies.clickOnAddButton();
	    addJobVacancy.selectJobTitle("Finance Manager");
		addJobVacancy.enterJobVacancyName("QA Engineer");
		addJobVacancy.enterHiringManager("Linda Anderson");
		addJobVacancy.enterNumberOfPosition(5);
		addJobVacancy.enterJobDescription("2 years Experiance required");
		addJobVacancy.uncheckCheckbox2();
		addJobVacancy.clickOnSubmit();
		Assert.assertTrue(editVacancy.isEditButtonDisplayed());
	
		editVacancy.clickOnBackButton();
		vacancies.printLastEnteredData();

		
		
	}
	
}
