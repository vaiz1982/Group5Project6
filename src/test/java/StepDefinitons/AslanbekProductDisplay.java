package StepDefinitons;

import Pages.AslanbekPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AslanbekProductDisplay {
    AslanbekPOM ap = new AslanbekPOM();

    @When("I Enter any existing Product name into the Search text box field, which has no minimum quantity set")
    public void iEnterAnyExistingProductNameIntoTheSearchTextBoxFieldWhichHasNoMinimumQuantitySet() {
        ap.sendKeysMethod(ap.getSearchField(), "iMac");
    }

    @And("I Click on the Product displayed in the Search results")
    public void iClickOnTheProductDisplayedInTheSearchResults() {
        ap.clickMethod(ap.getProductImacAfterSearch());
    }

    @Then("Default quantity should be displayed 1 for this product which has not minimum quantity set")
    public void defaultQuantityShouldBeDisplayedForThisProductWhichHasNotMinimumQuantitySet() {
        String expectedResult = "1";
        String actualResult = ap.getProductQuantity().getAttribute("value");
        Assert.assertEquals(actualResult,expectedResult);
    }

    @When("I Update the quantity by increasing it to more than one and click on Add to Cart button")
    public void iUpdateTheQuantityByIncreasingItToMoreThanOneAndClickOnAddToCartButton() {
        ap.sendKeysMethod(ap.getProductQuantity(), "2");
        ap.clickMethod(ap.getAddToCartWithQuantity());
    }

    @Then("Quantity should get updated accordingly and the User should be able to add the Product to cart without any issues")
    public void quantityShouldGetUpdatedAccordinglyAndTheUserShouldBeAbleToAddTheProductToCartWithoutAnyIssues() {
        String expectedResult = "2";
        String actualResult = ap.getProductQuantity().getAttribute("value");
        Assert.assertEquals(actualResult,expectedResult);
    }

    @And("I Select the Reviews tab of the Product in the displayed Product Display page")
    public void iSelectTheReviewsTabOfTheProductInTheDisplayedProductDisplayPage() {
        ap.clickMethod(ap.getReviewTabInProductDisplay());
    }

    @And("I Do not provide Name, Your Review and Ratings and click on Continue button")
    public void iDoNotProvideNameYourReviewAndRatingsAndClickOnContinueButton() {
        ap.clickMethod(ap.getContinueButtonOnProductDisplayReview());
    }

    @Then("Proper warning messages informing the User to fill the mandatory fields to submit the review should be displayed")
    public void properWarningMessagesInformingTheUserToFillTheMandatoryFieldsToSubmitTheReviewShouldBeDisplayed() {
        String expectedResult = "Warning";
        String actualResult = ap.getTextMethod(ap.getWarningMessageOnReviewOnProductDisplay());
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @And("I Click on Add to Cart option on the product that is displayed in the Search Results")
    public void iClickOnAddToCartOptionOnTheProductThatIsDisplayedInTheSearchResults() {
        ap.clickMethod(ap.getAddToCartButtonOnProductDisplayed());
    }

    @And("I Click on Cart button which is in black color beside the search icon button on the top of the page")
    public void iClickOnCartButtonWhichIsInBlackColorBesideTheSearchIconButtonOnTheTopOfThePage() {
        ap.clickMethod(ap.getCartBlackButton());
    }

    @And("I Click on the Product Image in the displayed toggle box")
    public void iClickOnTheProductImageInTheDisplayedToggleBox() {
        ap.clickMethod(ap.getProductImageUnderCartBlackToggleBox());
    }

    @Then("User should be taken to the Product Display page of the Product")
    public void userShouldBeTakenToTheProductDisplayPageOfTheProduct() {
        
    }
}
