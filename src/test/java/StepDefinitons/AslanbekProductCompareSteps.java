package StepDefinitons;

import Pages.AslanbekPOM;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.awt.*;

public class AslanbekProductCompareSteps {
    AslanbekPOM ap = new AslanbekPOM();

    @When("I Hover the mouse on any Menu say Desktops and select Show All Desktops option")
    public void iHoverTheMouseOnAnyMenuSayDesktopsAndSelectShowAllDesktopsOption() {
        ap.clickMethod(ap.getDesktopsMenuOption());
        ap.clickMethod(ap.getShowAllDesktops());


    }

    @And("In the displayed Desktops category page, I select Grid View option")
    public void inTheDisplayedDesktopsCategoryPageISelectGridViewOption() {
        ap.clickMethod(ap.getGridViewOption());
    }

    @And("I Hover the mouse cursor on Compare this Product option available on the Product that is displayed in the Product Category page")
    public void iHoverTheMouseCursorOnCompareThisProductOptionAvailableOnTheProductThatIsDisplayedInTheProductCategoryPage() {
        Actions actions = new Actions(BasicDriver.getDriver());
        Action hoverOver = actions.moveToElement(ap.getCompareThisProduct()).build();
        hoverOver.perform();
    }

    @And("I Select Compare this Product option")
    public void iSelectCompareThisProductOption() {
        ap.clickMethod(ap.getCompareThisProduct());
    }

    @And("I Click on product comparison link from the displayed success message")
    public void iClickOnProductComparisonLinkFromTheDisplayedSuccessMessage() {
        ap.clickMethod(ap.getProductComparisonLink());
    }

    @Then("Tool tip with the text - Compare this Product should be displayed")
    public void toolTipWithTheTextCompareThisProductShouldBeDisplayed() {
        Assert.assertTrue(ap.getCompareThisProductToolTip().isDisplayed());
    }


    @And("User should be taken to the Product Comparison page with the details of the Product that we have added for comparison.")
    public void userShouldBeTakenToTheProductComparisonPageWithTheDetailsOfTheProductThatWeHaveAddedForComparison() {
        String actualResult = BasicDriver.getDriver().getTitle();
        String expectedResult = "Product Comparison";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Then("Success message with text - Success: You have added Product Name to your product comparison! should be displayed")
    public void successMessageWithTextSuccessYouHaveAddedProductNameToYourProductComparisonShouldBeDisplayed() {
        String actualResult = ap.getTextMethod(ap.getSuccessMessageProductComparison());
        String expectedResultPart = "Success: You have added";
        Assert.assertTrue(actualResult.contains(expectedResultPart));

    }

    public void enterSearchProduct(String product) {
        ap.sendKeysMethod(ap.getSearchField(),product);
    }

    @When("I Enter any existing Product name into the Search text box field")
    public void iEnterAnyExistingProductNameIntoTheSearchTextBoxField() {
        enterSearchProduct("iMac");
    }

    @And("I Repeat Steps 1 to 3, three times until three different products are added to the Product Comparison page")
    public void iRepeatStepsToThreeTimesUntilThreeDifferentProductsAreAddedToTheProductComparisonPage() {
        enterSearchProduct("iPhone");
        ap.clickMethod(ap.getSearchButton());
        iSelectCompareThisProductOption();
        enterSearchProduct("MacBook Air");
        ap.clickMethod(ap.getSearchButton());
        iSelectCompareThisProductOption();
    }

    @Then("In the Product Comparison page should be three products added to the page for comparison")
    public void inTheProductComparisonPageShouldBeThreeProductsAddedToThePageForComparison() {
        Assert.assertTrue(ap.getItemsResultFromComparison().size()==3);
    }
}
