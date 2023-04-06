package StepDefinitons;

import Pages.OgunPOM;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Ogun_TC_PDP_016 {
    OgunPOM elements = new OgunPOM();
    @Then("Click on the x reviews link in the Product Display page")
    public void clickOnTheXReviewsLinkInTheProductDisplayPage() {
        elements.clickMethod(elements.getxReviews());
        Assert.assertTrue(elements.getxReviews().isDisplayed());
    }
}
