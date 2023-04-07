package StepDefinitons;

import Pages.DouaaPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DouaaAddToCart {
    DouaaPage douaaPage = new DouaaPage();
    @Then("Success message with text - Success: You have added Product Name to your shopping cart! should be displayed")
    public void success_message_with_text_success_you_have_added_product_name_to_your_shopping_cart_should_be_displayed() {
        douaaPage.verifyShoppingCartSuccessMessage();
    }
    @When("Click on the shopping cart! link in the displayed success message")
    public void click_on_the_shopping_cart_link_in_the_displayed_success_message() {
        douaaPage.ClickingOnShoppingCartFromSuccessMessage();
    }
    @When("Product should be successfully displayed in the Shopping Cart page")
    public void product_should_be_successfully_displayed_in_the_shopping_cart_page() {
        douaaPage.productDisplayedInShoppingCart();
    }
}
