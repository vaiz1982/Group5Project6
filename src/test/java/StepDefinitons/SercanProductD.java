package StepDefinitons;

import Pages.SercanPOMPage;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SercanProductD extends MyMethods {
    SercanPOMPage page = new SercanPOMPage();

    @When("I click on product displayed on the search results")
    public void iClickOnProductDisplayedOnTheSearchResults() {
        page.clickMethod(page.getiMacResultText());
    }

    @And("I click on Add to Wish List option in the Product Display page")
    public void iClickOnAddToWishListOptionInTheProductDisplayPage() {
        page.clickMethod(page.getAddToWishlist());
    }

    @Then("Success message with text - {string} is displayed")
    public void successMessageWithTextSuccessYouHaveAddedProductNameToYourWishListIsDisplayed(String message) {
        Assert.assertTrue(page.getCompareSuccessMessage().isDisplayed());
    }

    @And("click on the Wish List link in the success message")
    public void clickOnTheWishListLinkInTheSuccessMessage() {
        page.clickMethod(page.getWishListFromSuccessMessage());
    }

    @Then("product added should be displayed in the Wish List page")
    public void productAddedShouldBeDisplayedInTheWishListPage() {
        Assert.assertTrue(page.getiMacResultText().isDisplayed());
    }

    @When("I click on Apple Cinema on the search results")
    public void iClickOnAppleCinemaOnTheSearchResults() {
        page.clickMethod(page.getAppleCinema());
    }

    @Then("correct reward points should be displayed")
    public void correctRewardPointsShouldBeDisplayed() {
        Assert.assertTrue(page.getRewardPoints().isDisplayed());
    }
}
