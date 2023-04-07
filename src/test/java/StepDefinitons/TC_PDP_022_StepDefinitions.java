package StepDefinitons;

import Pages.HasanPOMPage;
import Utilities.BasicDriver;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC_PDP_022_StepDefinitions {
    HasanPOMPage hp = new HasanPOMPage();
    @And("I click on the Product displayed in the Search results")
    public void iClickOnTheProductDisplayedInTheSearchResults() {
        hp.clickMethod(hp.getSearchResult());
    }

    @When("I Click on the Related Products section in the displayed Product Display Page")
    public void iClickOnTheRelatedProductsSectionInTheDisplayedProductDisplayPage() {
        hp.clickMethod(hp.getAppleCinema30());
    }

    @Then("User should see the Product displayed in the Related Products section and is able ot click it and navigate to the Product Display Page of it")
    public void userShouldSeeTheProductDisplayedInTheRelatedProductsSectionAndIsAbleOtClickItAndNavigateToTheProductDisplayPageOfIt() {
        String expectedTitle = "Apple Cinema 30";
        String actualTitle = BasicDriver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
