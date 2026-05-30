package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {

        this.driver = driver;
    }

    By searchBox =By.name("search");

    By searchButton =  By.xpath("//button[@class='btn btn-default btn-lg']");

    By product =   By.linkText("HP LP3065");

    By addToCart =By.id("button-cart");

    By cart = By.id("cart-total");

    By productInCart = By.linkText("HP LP3065");

    public void searchProduct(String productName) {

        driver.findElement(searchBox)
        .sendKeys(productName);

        driver.findElement(searchButton)
        .click();
    }

    public void selectProduct() {

        driver.findElement(product).click();
    }

    public void clickAddToCart() {

        driver.findElement(addToCart).click();
    }

    public void goToCart() {

        driver.findElement(cart).click();
    }

    public boolean verifyProductInCart() {

        return driver.findElement(productInCart).isDisplayed();
    }
}