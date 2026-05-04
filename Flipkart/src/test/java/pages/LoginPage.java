package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // Locators
    By mobileNumberField = By.xpath("//input[@type='text']");
    By continueButton    = By.xpath("//button[contains(text(),'Continue')]");
    By passwordField     = By.xpath("//input[@type='password']");
    By loginButton       = By.xpath("//button[contains(text(),'Login')]");
    By errorMessage      = By.xpath("//div[contains(@class,'_2b1Tp')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterMobileNumber(String mobile) {
        driver.findElement(mobileNumberField).clear();
        driver.findElement(mobileNumberField).sendKeys(mobile);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    // Full login flow
    public void login(String mobile, String password) {
        enterMobileNumber(mobile);
        clickContinue();
        enterPassword(password);
        clickLogin();
    }
}
