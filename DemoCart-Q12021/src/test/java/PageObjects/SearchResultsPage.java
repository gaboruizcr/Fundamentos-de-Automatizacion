package PageObjects;

import org.openqa.selenium.*;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) { super(driver); }

    private WebElement setAddToCartButton() {
        return driver.findElement(By.xpath("//div[@class='button-group']//button[@type='button']//i[@class='fa fa-shopping-cart']"));
    }
    private WebElement setShoppingCartButton(){
        return driver.findElement(By.xpath("//a[@title='Shopping Cart']"));
    }

    public void addToCart(){
       this.setAddToCartButton().click();
    }
    public void goToShoppingCart(){
        this.setShoppingCartButton().click();
    }


}
