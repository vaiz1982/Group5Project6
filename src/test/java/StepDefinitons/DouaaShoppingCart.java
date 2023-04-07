package StepDefinitons;

import Pages.DouaaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DouaaShoppingCart {
    DouaaPage douaaPage = new DouaaPage();

    @Then("Check the Shopping Cart functionality in all the supported environments")
    public void check_the_shopping_cart_functionality_in_all_the_supported_environments() {
        douaaPage.clickingOnShoppingCart();
    }

    @And("Enter negative value or zero or non-numerical value into the Quantity field of the Product in the displayed Shopping Cart page")
    public void enterNegativeValueOrZeroOrNonNumericalValueIntoTheQuantityFieldOfTheProductInTheDisplayedShoppingCartPage() {
        douaaPage.inputtingProductQuantity();
    }

    @And("Click on Update icon option")
    public void clickOnUpdateIconOption() {
        douaaPage.clickingOnProductUpdate();
    }

    @Then("Proper warning message should be displayed informing the User to provide a positive numerical value")
    public void properWarningMessageShouldBeDisplayedInformingTheUserToProvideAPositiveNumericalValue() {
        douaaPage.verifyShoppingCartMessage();
    }

    @When("Click on Estimate Shipping & Taxes section")
    public void click_on_estimate_shipping_taxes_section() {
        douaaPage.clickingOnEstimateShippingAndTaxes();
    }

    @When("Select any Country from the Country dropdown field - {string}")
    public void select_any_country_from_the_country_dropdown_field(String country) {
        douaaPage.selectingCountry(country);
    }

    @When("Select any State from the Region or State field - {string}")
    public void select_any_state_from_the_region_state_field(String state) {
        douaaPage.selectingState(state);
    }

    @When("Enter any Post Code of the above selected State in Post Code field - {string}")
    public void enter_any_post_code_of_the_above_selected_state_in_post_code_field(String postcode) {
        douaaPage.enteringPostCode(postcode);
    }

    @When("Click on Get Quotes button")
    public void click_on_get_quotes_button() {
        douaaPage.clickingOnGetQuote();
    }

    @Then("Please select the preferred shipping method to use on this order dialog should be displayed.")
    public void please_select_the_preferred_shipping_method_to_use_on_this_order_dialog_should_be_displayed() {
        douaaPage.verifyShippingMethodTextIsDisplayed();
    }

    @Then("Flat Shipping Rate - '$5.00' radio button should be displayed in the displayed dialog and is not selected by default")
    public void flat_shipping_rate_$_radio_button_should_be_displayed_in_the_displayed_dialog_and_is_not_selected_by_default() {
        douaaPage.verifyFlatRateTextIsDisplayed();
    }

    @When("Select the radio button and Click on Apply Shipping button")
    public void select_the_radio_button_and_click_on_apply_shipping_button() {
        douaaPage.clickingOnFlatRateRadioButton();
    }

    @Then("Success message with text - Success: Your shipping estimate has been applied! should be displayed")
    public void success_message_with_text_success_your_shipping_estimate_has_been_applied_should_be_displayed() {
        douaaPage.verifyShippingEstimateText();
    }

    @Then("Flat Shipping Rate should be displayed and added to the Total Price")
    public void flat_shipping_rate_should_be_displayed_and_added_to_the_total_price() {
        douaaPage.verifyFlatRateIsDisplayedAndAdded();
    }
}
