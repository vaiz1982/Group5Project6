package StepDefinitons;

import Pages.HasanPOMPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC_ATC_009_StepDefinitions {
    HasanPOMPage hp = new HasanPOMPage();
    @When("I click on Add To Cart on the displayed product")
    public void iClickOnAddToCartOnTheDisplayedProduct() {
        hp.clickMethod(hp.getAddToCartForRelatedProductAppleCinema());
    }

    @Then("I should see the Success Message displayed")
    public void iShouldSeeTheSuccessMessageDisplayed() {
        Assert.assertTrue(hp.getAddCartSuccessMessage().isDisplayed());

    }
}
