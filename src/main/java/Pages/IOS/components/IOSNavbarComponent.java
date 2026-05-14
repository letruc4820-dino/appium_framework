package Pages.IOS.components;

import Constants.timeOutConstant;
import Pages.abstracts.components.NavbarComponent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class IOSNavbarComponent extends NavbarComponent {
    @iOSXCUITFindBy(accessibility = "More-tab-item")
    WebElement btnMainMenu;

    @iOSXCUITFindBy(accessibility = "Logout-menu-item") //do dev để tên sai, button Login nhưng name Logout
    WebElement btnLogin;

    @iOSXCUITFindBy(accessibility = "Logout-menu-item")
    WebElement btnLogout;

    public IOSNavbarComponent(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Override
    public void NavigateToMainMenu() {
        clickButton(btnMainMenu);
    }

    @Override
    public void NavigateToLoginPage() {
        clickButton(btnLogin);
    }

    public void NavigateToLogout(){
        clickButton(btnLogout);
    }

    @Override
    public void NavigateToRegisterPage() {

    }

    public boolean isLogoutBtnDisplayed() {
        try {
            return waitForVisibilityOf(btnLogout, timeOutConstant.TIME_OUT_DEFAUT).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
