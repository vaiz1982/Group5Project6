package StepDefinitons;

import Pages.OgunPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Ogun_TC_WL_007 {

    OgunPOM elements = new OgunPOM();
    @And("Click on Add to Wish List option in the displayed Product Display page")
    public void clickOnAddToWishListOptionInTheDisplayedProductDisplayPage() {
        elements.clickMethod(elements.getAddToWishListButton());

    }

    @Then("Click on the Wish List header option")
    public void clickOnTheWishListHeaderOption() {
        elements.clickMethod(elements.getWishListInTheSuccessMessage());
        Assert.assertTrue(elements.getMyWishListHeader().isDisplayed());
    }
}
