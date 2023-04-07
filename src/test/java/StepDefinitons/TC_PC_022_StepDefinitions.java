package StepDefinitons;

import Pages.HasanPOMPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC_PC_022_StepDefinitions {
    HasanPOMPage hp = new HasanPOMPage();

    @And("I enter any existing Product name into the Search text box field")
    public void iEnterAnyExistingProductNameIntoTheSearchTextBoxField() {
        hp.sendKeysMethod(hp.getSearchBox(), "iMac");
    }

    @When("Select Compare this Product option on the Product that is displayed in the search results")
    public void selectCompareThisProductOptionOnTheProductThatIsDisplayedInTheSearchResults() {
        hp.clickMethod(hp.getCompareThisProductButton());
    }

    @And("Click on the Product Comparison link in the displayed success message")
    public void clickOnTheProductComparisonLinkInTheDisplayedSuccessMessage() {
        hp.clickMethod(hp.getProductComparisonLink());
    }

    @Then("I should see proper Page Title, Page Heading and Page URL of the Product Comparison page are displayed.")
    public void iShouldSeeProperPageTitlePageHeadingAndPageURLOfTheProductComparisonPageAreDisplayed() {
        String expectedHeading = "Product Comparison";
        String actualHeading = hp.getTextMethod(hp.getProductComparisonHeading());
        String expectedTitle = "Product Comparison";
        String actualTitle = BasicDriver.getDriver().getTitle();
        String expectedUrl = "http://opencart.abstracta.us/index.php?route=product/compare";
        String actualUrl = BasicDriver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedHeading, actualHeading, "Heading Failed");
        Assert.assertEquals(expectedTitle, actualTitle, "Title Failed");
        Assert.assertEquals(expectedUrl, actualUrl, "URL Failed");
    }
}
