package Pages.abstracts;

import Base.basePage;
import Constants.timeOutConstant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class LoginPage extends basePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //các phương thức tương tác với page (hành vi của lớp đối tượng)
    public abstract void inputLoginUserName(String username);

    public abstract void inputLoginPassword (String password);

    public abstract void clickBtnLogin ();
}
