package Pages.Android.components;

import Constants.timeOutConstant;
import Pages.abstracts.components.NavbarComponent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AndroidNavbarComponent extends NavbarComponent {
    @AndroidFindBy(accessibility = "View menu")
    WebElement menuButton;

    @AndroidFindBy(uiAutomator ="new UiSelector().text(\"Log In\")" )
    WebElement loginButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log Out\")" )
    WebElement logoutButton;

    public AndroidNavbarComponent(WebDriver driver) {
        super(driver);
        //1 cơ chế ể khởi tạo các phần tử được định nghĩa bởi AndroidFindBy
        //AppiumFieldDecorator giúp cho appium hiểu và sử dụng annotation (cho Android, IOS)
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void NavigateToMainMenu(){
        clickButton(menuButton);
    }
    public void NavigateToLoginPage(){
        clickButton(loginButton);
    }

    public void NavigateToLogoutPage(){
        clickButton(logoutButton);
    }

    @Override
    public void NavigateToRegisterPage() {

    }
    public boolean isLogoutBtnDisplayed(){
        try {
            return waitForVisibilityOf(logoutButton, timeOutConstant.TIME_OUT_DEFAUT).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}

