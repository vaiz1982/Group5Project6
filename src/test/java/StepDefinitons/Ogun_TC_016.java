package StepDefinitons;

import Pages.OgunPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class Ogun_TC_016 {
    OgunPOM elements = new OgunPOM();

    @When("Enter any existing Product name into the Search text box field --iMAC")
    public void enterAnyExistingProductNameIntoTheSearchTextBoxFieldIMAC() {
        elements.sendKeysMethod(elements.getSearchBox(),"iMac"+ Keys.ENTER);
    }

    @And("Select Compare this Product option on the Product that is displayed in the search results")
    public void selectCompareThisProductOptionOnTheProductThatIsDisplayedInTheSearchResults() throws InterruptedException {
        elements.clickMethod(elements.getCompareThisProductButton());
        Thread.sleep(3000);
    }

    @And("Enter the same Product name into the Search text box field")
    public void enterTheSameProductNameIntoTheSearchTextBoxField() throws InterruptedException {;
        Thread.sleep(3000);
        elements.clickMethod(elements.getCompareThisProductButton());
        Thread.sleep(1000);
    }

    @And("Click on the Product Comparison link in the displayed success message")
    public void clickOnTheProductComparisonLinkInTheDisplayedSuccessMessage() {
        elements.clickMethod(elements.getProductComparisonLinkInTheSuccessMessage());

    }

    @Then("Check the Product Comparison page having the same product added twice to the page for comparison")
    public void checkTheProductComparisonPageHavingTheSameProductAddedTwiceToThePageForComparison() {
        Assert.assertTrue(elements.getAddToCartButtonInTheProductComparisonPage().isDisplayed());
        Assert.assertTrue(elements.getRemoveButtonInTheProductComparisonPage().isDisplayed());


    }
}
