package StepDefinitons;

import Pages.OgunPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Ogun_TC_PDP_004 {
    OgunPOM elements = new OgunPOM();

    @And("Click on the Product displayed in the Search results")
    public void clickOnTheProductDisplayedInTheSearchResults() {
        elements.clickMethod(elements.getiMacPictureLink());

    }

    @Then("Check the Price with tax and Price Ex Tax in the displayed Product Display Page")
    public void checkThePriceWithTaxAndPriceExTaxInTheDisplayedProductDisplayPage() {
        Assert.assertTrue(elements.getiMacPriceWithTax().isDisplayed());
        Assert.assertTrue(elements.getiMacPriceWithoutTax().isDisplayed());
    }
}
