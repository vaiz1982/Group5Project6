package StepDefinitions;

import Pages.SercanPOMPage;
import Utilities.MyMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SercanLogout extends MyMethods {
    SercanPOMPage page = new SercanPOMPage();

    @When("I click on My Account drop menu")
    public void iClickOnMyAccountDropMenu() {
        page.clickMethod(page.getMyAccountButton());
    }

    @Then("Logout Option should not be displayed")
    public void logoutOptionShouldNotBeDisplayed () {
        try {
            page.getLogoutButton().isDisplayed();
            Assert.fail("Logout option is displayed");
        } catch (org.openqa.selenium.NoSuchElementException e) {
            // Logout option not displayed, test passed
        }
    }
}
