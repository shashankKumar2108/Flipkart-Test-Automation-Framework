package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.BaseTest;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyFlipkartTitle() {
        HomePage homePage = new HomePage(driver);
        homePage.closeLoginPopup();

        String title = homePage.getPageTitle();
        System.out.println("Page Title: " + title);

        Assert.assertTrue(title.contains("Flipkart") || title.contains("Online Shopping"),
                "Title should contain 'Flipkart' or 'Online Shopping'");
    }

    @Test
    public void verifySearchBoxIsPresent() {
        HomePage homePage = new HomePage(driver);
        homePage.closeLoginPopup();

        homePage.searchProduct("laptop");

        String currentUrl = driver.getCurrentUrl();
        System.out.println("URL after search: " + currentUrl);

        Assert.assertTrue(currentUrl.contains("laptop"),
                "URL should contain search keyword");
    }
}