package Pages.abstracts;

import Base.basePage;
import Pages.PageFactory;
import Pages.abstracts.components.NavbarComponent;
import org.openqa.selenium.WebDriver;

public class CommonPage extends basePage {
    private NavbarComponent navbarComponent;

    //khởi tạo constructor:
    public CommonPage (WebDriver driver){
        super(driver); //driver đã tạo ở BasePage ròi, nên gọi super để dùng
        this.navbarComponent = PageFactory.getNavigatePage();
    }

    public NavbarComponent getNavbarComponent() {
        return navbarComponent;
    }



}
