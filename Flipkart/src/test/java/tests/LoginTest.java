package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginPageOpens() {
        HomePage homePage = new HomePage(driver);
        homePage.closeLoginPopup();

        // Navigate directly to login page
        driver.get("https://www.flipkart.com/account/login");

        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println("Login URL: " + url);
        System.out.println("Login Title: " + title);

        Assert.assertTrue(
            url.contains("login") || url.contains("account") || title.contains("Login") || title.contains("Flipkart"),
            "Should be on login or account page"
        );
    }

    @Test
    public void verifyHomePageLoads() {
        HomePage homePage = new HomePage(driver);
        homePage.closeLoginPopup();

        String title = homePage.getPageTitle();
        System.out.println("Title: " + title);

        Assert.assertNotNull(title, "Page title should not be null");
        Assert.assertFalse(title.isEmpty(), "Page title should not be empty");
    }
}