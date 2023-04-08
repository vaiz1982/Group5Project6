package StepDefinitons;

import Pages.SercanPOMPage;
import Utilities.BasicDriver;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SercanSearch extends MyMethods {
    SercanPOMPage page = new SercanPOMPage();

    @When("I click on the site map link in the footer options")
    public void iClickOnTheSiteMapLinkInTheFooterOptions() {
        page.clickMethod(page.getSiteMapButton());

    }

    @And("I click on the Search link from the Site Map page")
    public void iClickOnTheSearchLinkFromTheSiteMapPage() {
        page.clickMethod(page.getSearchLink());
    }

    @Then("I should be navigated to Search Page")
    public void iShouldBeNavigatedToSearchPage() {
        Assert.assertEquals(BasicDriver.getDriver().getTitle(), "Search");
    }

    @When("I enter {string} in the Search text box")
    public void iEnterInTheSearchTextBox(String query) {
        page.sendKeysMethod(page.getSearchBox(), query);
    }

    @And("click on the Search button")
    public void clickOnTheSearchButton() {
        page.clickMethod(page.getSearchButton());
    }

    @Then("more then one product should be displayed in the search results page")
    public void moreThenOneProductShouldBeDisplayedInTheSearchResultsPage() {
        Assert.assertTrue(page.getSearchResults().size()>1);
    }
}
