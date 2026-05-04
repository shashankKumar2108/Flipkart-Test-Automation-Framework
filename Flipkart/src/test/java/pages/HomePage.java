package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    // Locators
    By loginPopupCloseBtn = By.xpath("//button[contains(text(),'✕')]");
    By searchBox          = By.name("q");
    By loginLink          = By.xpath("//a[contains(text(),'Login')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Close the login popup that appears on Flipkart homepage
    public void closeLoginPopup() {
        try {
            WebElement closeBtn = driver.findElement(loginPopupCloseBtn);
            closeBtn.click();
        } catch (Exception e) {
            System.out.println("Login popup not found, continuing...");
        }
    }

    public void searchProduct(String productName) {
        WebElement searchField = driver.findElement(searchBox);
        searchField.clear();
        searchField.sendKeys(productName);
        searchField.sendKeys(Keys.ENTER);  // Press ENTER instead of clicking button
    }

    public void clickLogin() {
        driver.findElement(loginLink).click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}