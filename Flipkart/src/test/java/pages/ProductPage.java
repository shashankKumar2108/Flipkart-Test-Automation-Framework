package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    // Locators
    By productTitle   = By.xpath("//span[@class='VU-ZEz']");
    By productPrice   = By.xpath("//div[@class='Nx9bqj CxhGGd']");
    By addToCartBtn   = By.xpath("//button[contains(text(),'Add to cart')]");
    By buyNowBtn      = By.xpath("//button[contains(text(),'Buy Now')]");
    By ratingSection  = By.xpath("//div[@class='XQDdHH']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductTitle() {
        return driver.findElement(productTitle).getText();
    }

    public String getProductPrice() {
        return driver.findElement(productPrice).getText();
    }

    public void clickAddToCart() {
        driver.findElement(addToCartBtn).click();
    }

    public void clickBuyNow() {
        driver.findElement(buyNowBtn).click();
    }

    public String getRating() {
        return driver.findElement(ratingSection).getText();
    }

    public boolean isAddToCartDisplayed() {
        try {
            return driver.findElement(addToCartBtn).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
