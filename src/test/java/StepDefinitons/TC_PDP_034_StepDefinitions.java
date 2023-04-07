package StepDefinitons;

import Pages.HasanPOMPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_PDP_034_StepDefinitions {
    HasanPOMPage hp = new HasanPOMPage();
    @When("I click on the Apple Cinema Thirty displayed in the Search results")
    public void iClickOnTheAppleCinemaThirtyDisplayedInTheSearchResults() {
        hp.clickMethod(hp.getAppleCinema30());
    }

    @Then("I should be able to select all the available options")
    public void iShouldBeAbleToSelectAllTheAvailableOptions() {
        String expectedTitle = "Apple Cinema 30";
        String actualTitle = BasicDriver.getDriver().getTitle();
    }
}
