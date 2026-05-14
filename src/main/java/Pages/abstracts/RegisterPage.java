package Pages.abstracts;

import Constants.timeOutConstant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends CommonPage{
    //các locator của page (thuộc tính của lớp đối tượng)
    private By byInputUserName = By.id("taiKhoan");
    private By byInputPassword = By.id("matKhau");
    private By byConfirmPassword = By.id("confirmPassWord");
    private By byInputHoTen = By.id("hoTen");
    private By byInputEmail = By.id("email");
    private By btnClickRegister = By.xpath("//button[@type=\"submit\"]");

    private WebDriver driver;

    //constructor khởi tạo
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    //các phương thức tương tác với page (hành vi của lớp đối tượng)
    public void inputUserName (String username) {
        inputUserName(username, timeOutConstant.TIME_OUT_DEFAUT);
    }

    public void inputUserName (String username, long timeOutInSec) {
        inputText(byInputUserName, username, timeOutInSec);
    }

    public void inputPassword (String password){
        inputPassword(password, timeOutConstant.TIME_OUT_DEFAUT);
    }

    public void inputPassword (String password, long timeOutInSec){
        inputText(byInputPassword, password, timeOutInSec);
    }

    public void inputConfirmPassword (String confirmPassword){
        inputConfirmPassword(confirmPassword, timeOutConstant.TIME_OUT_DEFAUT);
    }

    public void inputConfirmPassword (String confirmPassword, long timeOutInSec){
        inputText(byConfirmPassword, confirmPassword, timeOutInSec);
    }

    public void inputHoTen (String hoTen){
        inputHoTen(hoTen, timeOutConstant.TIME_OUT_DEFAUT
        );
    }

    public void inputHoTen (String hoTen, long timeOutInSec){
        inputText(byInputHoTen, hoTen, timeOutInSec);
    }

    public void inputEmail (String email){
        inputEmail(email, timeOutConstant.TIME_OUT_DEFAUT);
    }

    public void inputEmail (String email, long timeOutInSec){
        inputText(byInputEmail, email, timeOutInSec);
    }

    public void clickBtnRegister (){
        clickBtnRegister(timeOutConstant.TIME_OUT_DEFAUT);
    }

    public void clickBtnRegister (long timeOutInSec){
        clickButton(btnClickRegister, timeOutInSec);
    }

}

