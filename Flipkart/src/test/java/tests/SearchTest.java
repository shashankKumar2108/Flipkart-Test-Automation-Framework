package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;
import utils.BaseTest;

public class SearchTest extends BaseTest {

    @Test
    public void searchForMobile() {
        HomePage homePage = new HomePage(driver);
        homePage.closeLoginPopup();
        homePage.searchProduct("samsung mobile");

        // Verify search worked via URL
        String url = driver.getCurrentUrl();
        System.out.println("Search URL: " + url);
        Assert.assertTrue(url.contains("samsung"),
                "URL should contain search keyword 'samsung'");
    }

    @Test
    public void searchForLaptop() {
        HomePage homePage = new HomePage(driver);
        homePage.closeLoginPopup();
        homePage.searchProduct("laptop");

        SearchPage searchPage = new SearchPage(driver);

        // Get first product using fallback locators
        String firstProduct = searchPage.getFirstProductName();
        System.out.println("First Product: " + firstProduct);

        Assert.assertNotNull(firstProduct, "Should find at least something on page");
        Assert.assertFalse(firstProduct.isEmpty(), "Product name should not be empty");
    }

    @Test
    public void verifySearchURLContainsKeyword() {
        HomePage homePage = new HomePage(driver);
        homePage.closeLoginPopup();
        homePage.searchProduct("iphone");

        String url = driver.getCurrentUrl();
        System.out.println("Search URL: " + url);

        Assert.assertTrue(url.toLowerCase().contains("iphone"),
                "URL should contain the searched keyword");
    }
}