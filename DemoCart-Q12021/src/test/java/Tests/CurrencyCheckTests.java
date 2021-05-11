package Tests;

import DataProviders.UsersDataProvider;
import PageObjects.CurrencyPage;
import PageObjects.LoginPage;
import PageObjects.dashboardPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.loginData;

public class CurrencyCheckTests extends BaseTest{

    @Test(groups = {"regression", "sanity"}, dataProvider = "getUserDataFromJson", dataProviderClass = UsersDataProvider.class)
    public void checkEuroCurrency(loginData _LoginData) throws InterruptedException{
        LoginPage login = new LoginPage(driver);
        dashboardPage dashboard = new dashboardPage(driver);
        CurrencyPage checkCurrency = new CurrencyPage(driver);
        login.doLogin(_LoginData.getEmail(), _LoginData.getPassword());
        checkCurrency.goToHomePage();
        checkCurrency.selectProduct();
        checkCurrency.expandCurrencyDropdown();
        checkCurrency.selectCurrency("EUR");
        Assert.assertEquals(dashboard.setDashboardCurrency().getText().contains("€"),true);
    }

    @Test(groups = {"regression", "sanity"}, dataProvider = "getUserDataFromJson", dataProviderClass = UsersDataProvider.class)
    public void checkDollarCurrency(loginData _LoginData) throws InterruptedException{
        LoginPage login = new LoginPage(driver);
        dashboardPage dashboard = new dashboardPage(driver);
        CurrencyPage checkCurrency = new CurrencyPage(driver);
        login.doLogin(_LoginData.getEmail(), _LoginData.getPassword());
        checkCurrency.goToHomePage();
        checkCurrency.selectProduct();
        checkCurrency.expandCurrencyDropdown();
        checkCurrency.selectCurrency("EUR");
        checkCurrency.expandCurrencyDropdown();
        checkCurrency.selectCurrency("USD");
        Assert.assertEquals(dashboard.setDashboardCurrency().getText().contains("$"),true);
    }

    @Test(groups = {"regression", "sanity"}, dataProvider = "getUserDataFromJson", dataProviderClass = UsersDataProvider.class)
    public void checkPoundsCurrency(loginData _LoginData) throws InterruptedException{
        LoginPage login = new LoginPage(driver);
        dashboardPage dashboard = new dashboardPage(driver);
        CurrencyPage checkCurrency = new CurrencyPage(driver);
        login.doLogin(_LoginData.getEmail(), _LoginData.getPassword());
        checkCurrency.goToHomePage();
        checkCurrency.selectProduct();
        checkCurrency.expandCurrencyDropdown();
        checkCurrency.selectCurrency("GBP");
        Assert.assertEquals(dashboard.setDashboardCurrency().getText().contains("£"),true);
    }

}
