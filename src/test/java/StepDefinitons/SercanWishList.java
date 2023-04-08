package StepDefinitons;

import Pages.SercanPOMPage;
import Utilities.BasicDriver;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SercanWishList extends MyMethods {
    SercanPOMPage page = new SercanPOMPage();

    @And("I Click on the Wish List link in the Footer options")
    public void iClickOnTheWishListLinkInTheFooterOptions() {
        page.clickMethod(page.getWishListLink());
    }

    @Then("I should be taken to the My Wish List page")
    public void iShouldBeTakenToTheMyWishListPage() {
        Assert.assertEquals(BasicDriver.getDriver().getTitle(), "My Wish List");
    }
}
