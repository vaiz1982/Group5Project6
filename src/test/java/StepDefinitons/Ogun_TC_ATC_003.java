package StepDefinitons;

import Pages.OgunPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;


public class Ogun_TC_ATC_003 {
    OgunPOM elements = new OgunPOM();
    @And("Click on Add to Cart option on the product that is displayed in the Search Results")
    public void clickOnAddToCartOptionOnTheProductThatIsDisplayedInTheSearchResults() {
        elements.clickMethod(elements.getiMacPictureLink());
        elements.clickMethod(elements.getAddToCartButtonForIMac());
        Assert.assertTrue(elements.getSuccessMessageForImac().isDisplayed());

    }

    @And("Click on Cart button which is in black color beside the search icon button on the top of the page")
    public void clickOnCartButtonWhichIsInBlackColorBesideTheSearchIconButtonOnTheTopOfThePage() {
        elements.clickMethod(elements.getBlackAddToCartButton());
    }

    @Then("Click on View Cart option in the displayed box")
    public void clickOnViewCartOptionInTheDisplayedBox() {
        elements.clickMethod(elements.getViewCartButton());
        Assert.assertTrue(elements.getiMacInTheShoppingCart().isDisplayed());

    }
}
