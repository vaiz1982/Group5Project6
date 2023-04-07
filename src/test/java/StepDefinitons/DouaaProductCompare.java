package StepDefinitons;

import Pages.DouaaPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class DouaaProductCompare {
    DouaaPage douaaPage = new DouaaPage();
    @When("Hover the mouse cursor on Compare this Product option available on the Product that is displayed in the Search Results")
    public void hover_the_mouse_cursor_on_compare_this_product_option_available_on_the_product_that_is_displayed_in_the_search_results() {
        douaaPage.mouseHover(BasicDriver.getDriver().findElement(By.xpath("//button[3]")));
    }
    @Then("Tool tip with the text - Compare this Product should be displayed")
    public void tool_tip_with_the_text_compare_this_product_should_be_displayed() {
        douaaPage.verifyTooltip(BasicDriver.getDriver().findElement(By.xpath("//button[3]")),"Compare this Product");
    }
    @When("Select Compare this Product option")
    public void select_compare_this_product_option() {
        douaaPage.clickingOnCompareProduct();
    }
    @Then("Success message with text - Success: You have added Product Name to your product comparison! should be displayed")
    public void success_message_with_text_success_you_have_added_product_name_to_your_product_comparison_should_be_displayed() {
        douaaPage.VerifyAddToCompareSuccessText();
    }
    @When("Click on product comparison link from the displayed success message")
    public void click_on_product_comparison_link_from_the_displayed_success_message() {
        douaaPage.clickingOnProductComparisonLink();
    }
    @Then("User should be taken to the Product Comparison page with the details of the Product that we have added for comparison.")
    public void user_should_be_taken_to_the_product_comparison_page_with_the_details_of_the_product_that_we_have_added_for_comparison() {
        douaaPage.verifyProductDetailsInProductComparisonPage();
    }

    @And("Click on the Product displayed in the Search results")
    public void clickOnTheProductDisplayedInTheSearchResults() {
        douaaPage.clickingOnProductName();
    }

    @And("Check the Product Comparison page having one product added to the page for comparison")
    public void checkTheProductComparisonPageHavingOneProductAddedToThePageForComparison() {
        douaaPage.verifySingleProductInProductComparisonPage();
    }

    @Then("Validate that a single product is displayed in the Product Comparison page with all the proper product details and the buttons \\(Add to Cart and Remove buttons)")
    public void validateThatASingleProductIsDisplayedInTheProductComparisonPageWithAllTheProperProductDetailsAndTheButtonsAddToCartAndRemoveButtons() {
        douaaPage.verifyAddToCartAndRemoveButtonIsAvailable();
    }

    @And("Select Compare this Product option from product display page")
    public void selectCompareThisProductOptionFromProductDisplayPage() {
        BasicDriver.getDriver().findElement(By.xpath("(//button[@type='button'])[9]")).click();
    }
}
