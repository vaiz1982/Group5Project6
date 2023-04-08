package StepDefinitons;

import Pages.AslanbekPOM;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AslanbekSearchSteps {
    AslanbekPOM ap = new AslanbekPOM();

    @When("I Do not enter anything into the Search text box field and I Click on the button having search icon")
    public void iDoNotEnterAnythingIntoTheSearchTextBoxFieldAndIClickOnTheButtonHavingSearchIcon() {
        ap.clickMethod(ap.getSearchButton());

    }

    @Then("Message {string} should be displayed in the Search Results page")
    public void messageThereIsNoProductThatMatchesTheSearchCriteriaShouldBeDisplayedInTheSearchResultsPage(String message) {
        String actualResult = BasicDriver.getDriver().findElement(By.xpath("//*[text()='There is no product that matches the search criteria']")).getText();
        Assert.assertEquals(actualResult, message);
    }

    @When("I Enter the search criteria in the Search text box field which can result in mutliple products")
    public void iEnterTheSearchCriteriaInTheSearchTextBoxFieldWhichCanResultInMutlipleProducts() {
        ap.sendKeysMethod(ap.getSearchField(), "Mac");
    }

    @And("I Click on the button having search icon")
    public void iClickOnTheButtonHavingSearchIcon() {
        ap.clickMethod(ap.getSearchButton());
    }

    @Then("More than one product should be displayed in the search results page")
    public void moreThanOneProductShouldBeDisplayedInTheSearchResultsPage() {
        Assert.assertTrue(ap.getItemsResultFromSearch().size() > 1);
    }

    public String actualResult;
    public String expectedResult;

    @When("I Select the number of Products to be displayed from the Show dropdown")
    public void iSelectTheNumberOfProductsToBeDisplayedFromTheShowDropdown() {
        Select select = new Select(ap.getShowAmountSearchPage());
        select.selectByVisibleText("25");
        actualResult = select.getFirstSelectedOption().getText();
        expectedResult = "25";

    }

    @Then("The selected number of products should be displayed in the current search page")
    public void theSelectedNumberOfProductsShouldBeDisplayedInTheCurrentSearchPage() {
        Assert.assertEquals(actualResult,expectedResult);
    }

    @And("I enter iMac on search field")
    public void iEnterIMacOnSearchField() {
        ap.sendKeysMethod(BasicDriver.getDriver().findElement(By.id("input-search")),"iMac");
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        ap.clickMethod(BasicDriver.getDriver().findElement(By.cssSelector("input[id='button-search']")));
    }
}
