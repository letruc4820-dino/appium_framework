package testcase.login;

import Base.baseTest;
import Driver.DriverFactory;
import ExtentReport.ExtentReportManager;
import Pages.PageFactory;
import Pages.abstracts.CommonDialog;
import Pages.abstracts.HomePage;
import Pages.abstracts.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v135.page.Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login01_Verify_Successfully extends baseTest {
    @Test(description = "Verify that user can login successfully with valid credentials")
    public void testValidLogin() {


        //khởi tạo page
        LoginPage loginPage = PageFactory.getLoginPage();
        HomePage homePage = PageFactory.getHomePage();

        ExtentReportManager.info("Step 1: Click main menu");
        LOG.info("Step 1: Click main menu");
        homePage.getNavbarComponent().NavigateToMainMenu();

        ExtentReportManager.info("Step 2: Click login button");
        LOG.info("Step 2: Click login button");
        homePage.getNavbarComponent().NavigateToLoginPage();

        ExtentReportManager.info("Step 3: Input username and password");
        LOG.info("Step 3: Input username and password");
        loginPage.inputLoginUserName("mickey");
        loginPage.inputLoginPassword("Test@1234");

        ExtentReportManager.info("Step 4: click login button");
        LOG.info("Step 4: click login button");
        loginPage.clickBtnLogin();

        ExtentReportManager.info("VP1: Verify login successfully");
        LOG.info("VP1: Verify login successfully");
        String actualMessage = homePage.getTitleHomePage();
        Assert.assertEquals(actualMessage, "Products", "Products title is not displayed");

        ExtentReportManager.info("VP2: Verify logout button display");
        LOG.info("VP2: Verify logout button display");
        homePage.getNavbarComponent().NavigateToMainMenu();
        Assert.assertTrue(homePage.getNavbarComponent().isLogoutBtnDisplayed(), "Logout button is not displayed");
    }
}
