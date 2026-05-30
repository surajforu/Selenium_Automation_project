package stepDefinitions;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import hooks.Hooks;

import io.cucumber.java.en.*;

import pages.ProductPage;

public class ProductSteps {

    WebDriver driver = Hooks.driver;

    ProductPage pp =  new ProductPage(driver);

    @When("User searches for {string}")
    public void user_searches_product(String product) {

        pp.searchProduct(product);
    }

    @When("User selects the product")
    public void user_selects_product() {

        pp.selectProduct();
    }

    @When("User clicks Add To Cart button")
    public void user_clicks_add_to_cart() throws InterruptedException {

        pp.clickAddToCart();
        Thread.sleep(3000);
    }

    @When("User goes to cart")
    public void user_goes_to_cart() {

        pp.goToCart();
    }

    @Then("Product should be visible in cart")
    public void verify_product_in_cart() throws InterruptedException {

        Assert.assertTrue( pp.verifyProductInCart());
        Thread.sleep(3000);
    }
}