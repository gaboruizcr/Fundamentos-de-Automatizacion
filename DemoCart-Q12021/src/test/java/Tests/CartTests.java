package Tests;

import PageObjects.HomePage;
import PageObjects.SearchResultsPage;
import org.testng.Assert;
import PageObjects.dashboardPage;
import org.testng.annotations.Test;

public class CartTests extends BaseTest{

    @Test
    public void AddProductToCart() throws InterruptedException {
        HomePage home = new HomePage(driver);
        SearchResultsPage searchResults = new SearchResultsPage(driver);
        dashboardPage dashboard = new dashboardPage(driver);
        home.SearchProduct( "iPhone");
        searchResults.addToCart();
        Thread.sleep(3000);
        Assert.assertEquals(dashboard.setDashboardItemAdded().getText().contains("1 item"),true);

    }

}
