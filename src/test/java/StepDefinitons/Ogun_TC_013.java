package StepDefinitons;

import Pages.OgunPOM;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Ogun_TC_013 {
    OgunPOM elements = new OgunPOM();

    @Given("Click on Logout option from the Right Column")
    public void clickOnLogoutOptionFromTheRightColumn() {
        elements.clickMethod(elements.getRightColumnLogout());
    }

    @And("Click on Continue button")
    public void clickOnContinueButton() {
        elements.clickMethod(elements.getRightColumnLogoutContinueButton());
    }

    @Then("User should be taken to the Home page")
    public void userShouldBeTakenToTheHomePage() {
        Assert.assertTrue(elements.getYourStoreHeaderHomePage().isDisplayed());


    }
}
