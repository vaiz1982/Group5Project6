package StepDefinitons;

import Pages.HasanPOMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_PDP_010_StepDefinitions {
    HasanPOMPage hp = new HasanPOMPage();
    @And("I enter any existing Product name into the Search text box field such as Apple Cinema Thirty")
    public void iEnterAnyExistingProductNameIntoTheSearchTextBoxFieldSuchAsAppleCinema() {
        hp.sendKeysMethod(hp.getSearchBox(),"Apple Cinema 30");
    }

    @And("Click on the Product displayed in the Search results")
    public void clickOnTheProductDisplayedInTheSearchResults() {
        hp.clickMethod(hp.getAppleCinema30());
    }

    @Then("Click on the Reviews tab of the Product in the displayed Product Display page")
    public void clickOnTheReviewsTabOfTheProductInTheDisplayedProductDisplayPage() {
        hp.clickMethod(hp.getReviewsTab());
    }

    @When("I Enter your name into the Your Name text field")
    public void iEnterYourNameIntoTheYourNameTextField() {
        hp.sendKeysMethod(hp.getYourNameOnReview(),"Aston Martin");
    }

    @And("I Enter review text into the Your Review text are field")
    public void iEnterReviewTextIntoTheYourReviewTextAreField() {
        hp.sendKeysMethod(hp.getYourReview(),"Very nice product booo come on");
    }

    @And("Select any radio button to give the rating and Click on Continue button")
    public void selectAnyRadioButtonToGiveTheRatingAndClickOnContinueButton() {
        hp.clickMethod(hp.getRadioButton4());
        hp.clickMethod(hp.getReviewContinueButton());
    }

    @Then("Success message with text Thank you for your review. It has been submitted to the webmaster for approval. should be displayed")
    public void successMessageWithTextThankYouForYourReviewItHasBeenSubmittedToTheWebmasterForApprovalShouldBeDisplayed() {
        String expectedMessage = "Thank you for your review. It has been submitted to the webmaster for approval.";
        String actualMessage = hp.getTextMethod(hp.getSuccessfulReviewAlert());
    }
}
