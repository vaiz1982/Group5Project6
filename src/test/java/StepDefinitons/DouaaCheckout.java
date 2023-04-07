package StepDefinitons;

import Pages.DouaaPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DouaaCheckout {
    DouaaPage douaaPage = new DouaaPage();

    @When("Click on Checkout button in the Shopping Cart page")
    public void click_on_checkout_button_in_the_shipping_cart_page() {
        douaaPage.clickingOnCheckoutButton();
    }

    @Then("User should be taken to the checkout page")
    public void user_should_be_taken_to_the_checkout_page() {
        douaaPage.verifyUserInTheCheckoutPage();
    }

    @When("Click on continuePaymentAddressButton button")
    public void click_on_continue_payment_address_button_button() {
        douaaPage.clickingOnContinuePaymentAddressButton();
    }

    @When("Click on continueShippingAddressButton button")
    public void click_on_continue_shipping_address_button_button() {
        douaaPage.clickingOnContinueShippingAddressButton();
    }

    @When("Enter any text into the Add Comments About Your Order text field")
    public void enter_any_text_into_the_add_comments_about_your_order_text_field() {
        douaaPage.enteringCommentInTextArea();
    }

    @When("Click on continueShippingMethod button")
    public void click_on_continue_shipping_method_button() {
        douaaPage.clickingOnContinueShippingMethodButton();
    }

    @Then("Comment entered should be displayed as it is in the Payment Method section")
    public void comment_entered_should_be_displayed_as_it_is_in_the_payment_method_section() {
        douaaPage.verifyUserComment();
    }

    @When("Select the Terms & Conditions checkbox field")
    public void select_the_terms_conditions_checkbox_field() {
        douaaPage.clickingOnCheckbox();
    }

    @When("Click on continuePaymentMethod button")
    public void click_on_continue_payment_method_button() {
        douaaPage.clickingOnContinuePaymentMethodButton();
    }

    @When("Click on Confirm Order button")
    public void click_on_confirm_order_button() {
        douaaPage.clickingOnConfirmOrderButton();
    }

    @Then("Order should be placed and User should be taken to Success page \\(Proper details should be displayed in the Order Success page)")
    public void order_should_be_placed_and_user_should_be_taken_to_success_page_proper_details_should_be_displayed_in_the_order_success_page() {
        douaaPage.verifyOrderSuccessfulText();
    }
}
