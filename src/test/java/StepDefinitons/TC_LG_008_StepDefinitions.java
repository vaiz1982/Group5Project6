package StepDefinitons;

import Pages.HasanPOMPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Base64;

public class TC_LG_008_StepDefinitions {
    HasanPOMPage hp = new HasanPOMPage();
    @When("I click on Logout button")
    public void iClickOnLogoutButton() {
        hp.clickMethod(hp.getLogoutButton());
    }

    @Then("I should be logged out and taken to the Account Logout page")
    public void iShouldBeLoggedOutAndTakenToTheAccountLogoutPage() {
        String expectedTitle = "Account Logout";
        String actualTitle = BasicDriver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
