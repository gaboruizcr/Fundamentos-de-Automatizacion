package Tests;

import PageObjects.HomePage;
import PageObjects.SearchResultsPage;
import org.testng.Assert;
import PageObjects.dashboardPage;
import org.testng.annotations.Test;

public class CartTests extends BaseTest{

    @Test(groups = {"sanity"})
    public void AddProductToCart() /*throws InterruptedException*/ {
        HomePage home = new HomePage(driver);
        SearchResultsPage searchResults = new SearchResultsPage(driver);
        dashboardPage dashboard = new dashboardPage(driver);
        home.SearchProduct( "iPhone");
        searchResults.addToCart();
        searchResults.goToShoppingCart();
        Assert.assertEquals(dashboard.getDashboardCheckout().isDisplayed(),true);

    }

}
