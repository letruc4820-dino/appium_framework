package Pages;

import Driver.DriverFactory;
import Pages.Android.AndroidHomePage;
import Pages.Android.AndroidLoginPage;
import Pages.Android.components.AndroidNavbarComponent;
import Pages.IOS.IOSHomePage;
import Pages.IOS.IOSLoginPage;
import Pages.IOS.components.IOSNavbarComponent;
import Pages.abstracts.HomePage;
import Pages.abstracts.LoginPage;
import Pages.abstracts.components.NavbarComponent;
import util.PlatFormUtil;

public class PageFactory {
    public static HomePage getHomePage(){
        if(PlatFormUtil.isAndroid()){
            return new AndroidHomePage(DriverFactory.getDriverThreadLocal());
        } else {
            return new IOSHomePage(DriverFactory.getDriverThreadLocal());
        }
    }
    public static LoginPage getLoginPage(){
        if(PlatFormUtil.isAndroid()){
            return new AndroidLoginPage(DriverFactory.getDriverThreadLocal());
        } else {
            return new IOSLoginPage(DriverFactory.getDriverThreadLocal());
        }
    }
    public static NavbarComponent getNavigatePage(){
        if(PlatFormUtil.isAndroid()){
            return new AndroidNavbarComponent(DriverFactory.getDriverThreadLocal());
        } else {
            return new IOSNavbarComponent(DriverFactory.getDriverThreadLocal());
        }
    }
}
