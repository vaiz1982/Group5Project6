package StepDefinitions;

import Pages.SercanPOMPage;
import Utilities.BasicDriver;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SercanProductC extends MyMethods {
    SercanPOMPage page = new SercanPOMPage();

    @When("I hover over the Compare this Product option from one of the Products displayed in the Featured section of the home page")
    public void iHoverOverTheCompareThisProductOptionFromOneOfTheProductsDisplayedInTheFeaturedSectionOfTheHomePage() {
        scrollMethod(page.getSiteMapButton());
        WebElement randomButton = page.getCompareButtons().get((int) (Math.random() * page.getCompareButtons().size()));
    }

    @Then("Tool tip with the text Compare this Product should be displayed")
    public void toolTipWithTheTextCompareThisProductShouldBeDisplayed() {
        WebElement randomButton = page.getCompareButtons().get((int) (Math.random() * page.getCompareButtons().size()));
        Actions action = new Actions(BasicDriver.getDriver());
        action.moveToElement(randomButton).perform();
        String toolTip = randomButton.getAttribute("data-original-title");
        Assert.assertEquals(toolTip, "Compare this Product");
    }

    @And("I Select Compare This Product option")
    public void iSelectCompareThisProductOption() {
        scrollMethod(page.getSiteMapButton());
        WebElement randomButton = page.getCompareButtons().get((int) (Math.random() * page.getCompareButtons().size()));
        page.clickMethod(randomButton);

    }

    @Then("Success message with text - {string} should be displayed")
    public void successMessageWithTextSuccessYouHaveAddedProductNameToYourProductComparisonShouldBeDisplayed(String successMessage) {
        Assert.assertTrue(page.getCompareSuccessMessage().getText().contains("Success: You have added"));
    }

    @And("I click on product comparison link from the success message")
    public void iClickOnProductComparisonLinkFromTheSuccessMessage() {
        scrollMethod(page.getCompareSuccessMessage());
        wait(1);
        page.clickMethod(page.getProductComparisonLink());
    }

    @Then("I should be taken to the Product Comparison page with the details of the Product added for comparison.")
    public void iShouldBeTakenToTheProductComparisonPageWithTheDetailsOfTheProductAddedForComparison() {

        Assert.assertEquals(BasicDriver.getDriver().getTitle(), "Product Comparison");
    }

    @When("I enter {string} into the Search field")
    public void iEnterIntoTheSearchField(String product) {
        page.sendKeysMethod(page.getSearchBox(), product);
        page.clickMethod(page.getSearchButton());
    }

    @Then("I should see last four products are displayed in the product comparison page with all the proper product details and the buttons")
    public void iShouldSeeLastFourProductsAreDisplayedInTheProductComparisonPageWithAllTheProperProductDetailsAndTheButtons() {
        Assert.assertTrue(page.getProductDetails().isDisplayed());
        Assert.assertTrue(page.getAllProducts().size()==4 && page.getAddToCartButtons().size()==4 && page.getRemoveButtons().size()==4);
    }

    @Then("The first added product should be removed from the product comparison page")
    public void theFirstAddedProductShouldBeRemovedFromTheProductComparisonPage() {
        Assert.assertFalse(page.getAllDescriptions().contains("iMac"));
    }

    @And("I Select Compare This Product option in the search results")
    public void iSelectCompareThisProductOptionInTheSearchResults() {
        page.clickMethod(page.getCompareButtonInSearchResult());
    }

    @And("I clear the search data")
    public void iClearTheSearchData() {
        page.getSearchBox().clear();
    }
}
