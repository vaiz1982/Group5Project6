package StepDefinitons;

import Pages.HasanPOMPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC_SC_005_StepDefinitions {
    HasanPOMPage hp = new HasanPOMPage();
    @And("I Click on Add to Cart button on the Product displayed in the Search results")
    public void iClickOnAddToCartButtonOnTheProductDisplayedInTheSearchResults() {
        hp.clickMethod(hp.getAddToCartButtonOnProductDisplayPage());
    }

    @And("I Click on Cart button which is displayed in black color on the top of the page beside the search icon button")
    public void iClickOnCartButtonWhichIsDisplayedInBlackColorOnTheTopOfThePageBesideTheSearchIconButton() {
        hp.clickMethod(hp.getBlackCartButton());
    }

    @When("I click on View Cart option in the displayed Cart block")
    public void iClickOnViewCartOptionInTheDisplayedCartBlock() {
        hp.clickMethod(hp.getViewCartFromBlackCartButton());
    }

    @Then("I should be taken to the Shopping Cart page")
    public void iShouldBeTakenToTheShoppingCartPage() {
        String expectedTitle = "Shopping Cart";
        String actualTitle = BasicDriver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
