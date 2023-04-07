package StepDefinitons;

import Pages.DouaaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DouaWishList {
    DouaaPage douaaPage = new DouaaPage();

    @When("Click on Add to Wish List option of a product that is displayed in the Search Results page")
    public void click_on_add_to_wish_list_option_of_a_product_that_is_displayed_in_the_search_results_page() {
        douaaPage.clickingOnWishlistButton();
    }

    @Then("Success message with text - Success: You have added Product Name to your wish list! should be displayed")
    public void success_message_with_text_success_you_have_added_product_name_to_your_wish_list_should_be_displayed() {
        douaaPage.verifyWishlistSuccessMessage();
    }

    @When("Click on the wish list! link in the displayed success message")
    public void click_on_the_wish_list_link_in_the_displayed_success_message() {
        douaaPage.clickingOnWishlistLink();
    }

    @Then("Product should be successfully displayed in the My Wish List page")
    public void product_should_be_successfully_displayed_in_the_my_wish_list_page() {
        douaaPage.verifyIMacProductInWishList();
    }

    @Then("Two products should be successfully displayed in the My Wish List page")
    public void two_product_should_be_successfully_displayed_in_the_my_wish_list_page() {
        douaaPage.verifyIMacProductInWishList();
        douaaPage.verifySamsungSyncMasterProductInWishList();
    }

    @And("Clear the search box")
    public void clearTheSearchBox() {
        douaaPage.clearSearchField();
    }

    @And("Click on the Product displayed in the Search results for second product")
    public void clickOnTheProductDisplayedInTheSearchResultsForSecondProduct() {
        douaaPage.clickingOnSecondProductName();

    }
}
