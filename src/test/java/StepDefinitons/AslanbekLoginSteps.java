package StepDefinitons;

import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AslanbekLoginSteps {
    @Then("I should be navigated to Login page")
    public void iShouldBeNavigatedToLoginPage() {
        Assert.assertEquals(BasicDriver.getDriver().getTitle(),"Account Login");
    }

    @And("I should get logged in and taken to the Account page")
    public void iShouldGetLoggedInAndTakenToTheAccountPage() {
        Assert.assertEquals(BasicDriver.getDriver().getTitle(),"My Account");
    }
}
