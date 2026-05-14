package Base;

import Constants.timeOutConstant;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.remote.http.DumpHttpExchangeFilter.LOG;

public class basePage {
    //các thuộc tính
    protected final Logger LOGGER = LogManager.getLogger(getClass());
    protected WebDriver driver;
    //constructor khởi tạo
    public basePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement waitForVisibilityOf(WebElement element, long timeOutInSec){
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(timeOutInSec));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    //phương thức
    public WebElement waitForElementVisible(By locator, long timeOutInSec){
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(timeOutInSec));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element;
    }
    //appium
    public WebElement waitForElementVisible(WebElement element, long timeOutInSec){
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(timeOutInSec));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitForElementClickable(By locator, long timeOutInSec){
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(timeOutInSec));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        return element;
    }

        //appium
    public WebElement waitForElementClickable(WebElement element, long timeOutInSec){
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(timeOutInSec));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void inputText(By locator, String value, long timeOutInSec) {
        WebElement element = waitForElementVisible(locator, timeOutInSec);
        LOG.info("Nhập dữ liệu: " + value + " vào element có locator: " + locator);
        element.sendKeys(value);
    }

    public void inputText(By locator, String value) {
        inputText(locator, value, timeOutConstant.TIME_OUT_DEFAUT);
    }

    //appium
    public void inputText(WebElement element, String value, long timeOutInSec) {
        waitForElementVisible(element, timeOutInSec).sendKeys(value);
        LOG.info("Nhập dữ liệu: " + value + " vào element" + element);
    }

    public void inputText(WebElement element, String value) {
        inputText(element, value, timeOutConstant.TIME_OUT_DEFAUT);
    }

    public void clickButton (By locator, long timeOutInSec){
        LOG.info("Click vào element có locator: " + locator);
        WebElement element = waitForElementClickable(locator, timeOutInSec);
        element.click();
    }

    public void clickButton (By locator) {
        clickButton(locator, timeOutConstant.TIME_OUT_DEFAUT);
    }

    //appium
    public void clickButton (WebElement element, long timeOutInSec){
        LOG.info("Click vào element có locator: " + element);
       waitForElementClickable(element, timeOutInSec).click();
    }

    public void clickButton (WebElement element) {
        clickButton(element, timeOutConstant.TIME_OUT_DEFAUT);
    }

    public String getTextElement (By locator, long timeOutInSec) {
        WebElement element = waitForElementVisible(locator, timeOutInSec);
        return element.getText();
    }

    public String getTextElement (By locator) {
        return getTextElement(locator, timeOutConstant.TIME_OUT_DEFAUT);
    }

    //appium
    public String getTextElement(WebElement element, long timeOutInSec){
        return waitForElementVisible(element, timeOutInSec).getText();

    }
    public String getTextElement(WebElement element){
        return getTextElement(element, timeOutConstant.TIME_OUT_DEFAUT);}

}
