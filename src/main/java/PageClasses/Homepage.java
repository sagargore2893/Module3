package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.BasePage;

public class Homepage extends BasePage {
	WebDriver driver;
	
	@FindBy(css="#branding>a>img")
	private WebElement imageLink;
	
	@FindBy(css="#branding>a#welcome")
	private WebElement welcomeAdmin;
	
	@FindBy(css="#branding>div>ul>li>a#aboutDisplayLink")
	private WebElement aboutLink;
	
	@FindBy(css="#branding>div>ul>li>a[href='/index.php/auth/logout']")
	private WebElement logOutLink;
	
	@FindBy(css=".menu>ul>li>a#menu_admin_viewAdminModule")
	private WebElement admin;
	
	@FindBy(css=".menu>ul>li>a#menu_pim_viewPimModule")
	private WebElement pim;

	@FindBy(css=".menu>ul>li>a#menu_leave_viewLeaveModule")
	private WebElement leave;
	
	@FindBy(css=".menu>ul>li>a#menu_time_viewTimeModule")
	private WebElement time;
	
	@FindBy(css=".menu>ul>li>a#menu_recruitment_viewRecruitmentModule")
	private WebElement recruitment;
	
	@FindBy(css=".menu>ul>li>a#menu__Performance")
	private WebElement performance;
	
	@FindBy(css=".menu>ul>li>a#menu_dashboard_index")
	private WebElement dashboard;
	
	@FindBy(css="menu_directory_viewDirectory")
	private WebElement directory;
	
	public Homepage(WebDriver driver) {
		super(driver);
	}	

	public boolean isUserLoggedIn(){
		return welcomeAdmin.isDisplayed();
	}
	
	public void clickOnRecruitmentMenu(){
		recruitment.click();
	}
	
	public void clickOnrecruitmentTab(){
		recruitment.click();
	}
	
	public void clickOnAdminMenu(){
		admin.click();
	}
	
}
