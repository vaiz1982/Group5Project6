package StepDefinitons;

import Pages.HasanPOMPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC_WL_013_StepDefinitions {
    HasanPOMPage hp = new HasanPOMPage();
    @Given("I navigate to my Wish List")
    public void iNavigateToMyWishList() {
        hp.clickMethod(hp.getWishList());
    }

    @And("I should see text Your wish list is empty.")
    public void iShouldSeeTextYourWishListIsEmpty() {
        String expectedMessage = "Your wish list is empty.";
        String actualMessage = hp.getTextMethod(hp.getWishListEmptyMessage());
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @When("I Click on Continue button")
    public void iClickOnContinueButton() {
        hp.clickMethod(hp.getReviewContinueButton());
    }

    @Then("I should be taken to My Account page")
    public void iShouldBeTakenToMyAccountPage() {
        String expectedTitle = "My Account";
        String actualTitle = BasicDriver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
