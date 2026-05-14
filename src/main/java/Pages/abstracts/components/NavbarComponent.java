package Pages.abstracts.components;

import Base.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class NavbarComponent extends basePage {


    public NavbarComponent(WebDriver driver) {
        super(driver);
    }

    public abstract void NavigateToMainMenu();

    public abstract void NavigateToLoginPage();

    public abstract void  NavigateToRegisterPage();

    public abstract boolean isLogoutBtnDisplayed();

}
