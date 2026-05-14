package util;

import Driver.DriverFactory;
import Driver.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class PlatFormUtil {
    public static boolean isAndroid() {
        AppiumDriver driver = DriverFactory.getDriverThreadLocal();

        if (driver instanceof AndroidDriver) {
            return true;
        } else {
            return false;
        }
    }
}
