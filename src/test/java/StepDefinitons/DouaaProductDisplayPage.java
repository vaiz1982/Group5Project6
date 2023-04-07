package StepDefinitons;

import Pages.DouaaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DouaaProductDisplayPage {
    DouaaPage douaaPage = new DouaaPage();
    @Then("Check the Product Name, Brand and Product Code in the displayed Product Display Page")
    public void check_the_product_name_brand_and_product_code_in_the_displayed_product_display_page() {
        douaaPage.verifyProductNameBrandAndCode();
    }

    @Then("Check the average and number of reviews under the Add to Cart page")
    public void checkTheAverageAndNumberOfReviewsUnderTheAddToCartPage() {
        douaaPage.verifyReviewAvailability();
    }

    @And("Click on Add to Cart button")
    public void clickOnAddToCartButton() {
        douaaPage.clickingOnAddToCartButtonInProductDisplayPage();
    }

    @And("Click on shopping cart! link from the displayed success page")
    public void clickOnShoppingCartLinkFromTheDisplayedSuccessPage() {
        douaaPage.clickingOnShoppingCart();
    }

    @And("Click on the Product image from the displayed Shopping Cart page Then User should be taken to the Product Display page of the Product")
    public void clickOnTheProductImageFromTheDisplayedShoppingCartPageThenUserShouldBeTakenToTheProductDisplayPageOfTheProduct() {
        douaaPage.clickingOnProductImageFromShoppingCart();
    }
}
