package Pages.abstracts;

import Base.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonDialog extends basePage {
    private By titleDialog = By.id("swal2-title");
    private By btnCloseDiaglog = By.xpath("//button[text()=\"Đóng\"]");

    public CommonDialog (WebDriver driver) {
        super(driver);
    }

    public String getTitleDialog() {
        return getTextElement(titleDialog);
    }

    public void clickBtnCloseDialog() {
        clickButton(btnCloseDiaglog);
    }
}
