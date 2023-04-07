package StepDefinitons;

import Pages.HasanPOMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC_SF_008_StepDefinitions {
    HasanPOMPage hp = new HasanPOMPage();

    @When("I don't enter anything into the Search text box and I click on Search icon")
    public void iDonTEnterAnythingIntoTheSearchTextBoxAndIClickOnSearchIcon() {
        hp.clickMethod(hp.getSearchButton());
    }

    @And("I enter iLife into the Search Criteria text box field")
    public void iEnterILifeIntoTheSearchCriteriaTextBoxField() {
        hp.sendKeysMethod(hp.getSearchCriteriaBox(), "iLife");
        hp.clickMethod(hp.getSearchCriteriaBox());
    }

    @And("I select Search in product descriptions checkbox option and I click on Search button")
    public void iSelectSearchInProductDescriptionsCheckboxOptionAndIClickOnSearchButton() {
        hp.clickMethod(hp.getSearchDescriptionsCheckBox());
        hp.clickMethod(hp.getSearchButtonOnCriteriaPage());
    }

    @Then("Product having the given text in its description should be displayed in the search results")
    public void productHavingTheGivenTextInItsDescriptionShouldBeDisplayedInTheSearchResults() {
        String expected = "True";
       Assert.assertTrue(hp.getSearchResult().isDisplayed(),expected);

    }
}
