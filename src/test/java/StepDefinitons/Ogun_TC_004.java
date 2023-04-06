package StepDefinitons;

import Pages.OgunPOM;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Ogun_TC_004 {

    OgunPOM elements = new OgunPOM();
    @Given("Hover the mouse on any Menu say Desktops and select Show All Desktops option")
    public void hoverTheMouseOnAnyMenuSayDesktopsAndSelectShowAllDesktopsOption() {
        Actions actions = new Actions(BasicDriver.getDriver());
        actions.moveToElement(elements.getDesktopsHeader()).build().perform();
        elements.clickMethod(elements.getShowAllDesktopsButton());


    }

    @When("In the displayed Desktops category page, select List View option")
    public void inTheDisplayedDesktopsCategoryPageSelectListViewOption() {

    }

    @And("Hover the mouse cursor on Compare this Product option available on the Product that is displayed in the Product Category page")
    public void hoverTheMouseCursorOnCompareThisProductOptionAvailableOnTheProductThatIsDisplayedInTheProductCategoryPage() {
        Actions actions = new Actions(BasicDriver.getDriver());
        actions.moveToElement(elements.getCompareThisProductButton()).click().perform();

    }

    @And("Select Compare this Product option")
    public void selectCompareThisProductOption() {
        Assert.assertTrue(elements.getProductCompareLinkAssert1().isDisplayed());

    }

    @Then("Click on product comparision link from the displayed success message")
    public void clickOnProductComparisionLinkFromTheDisplayedSuccessMessage() throws InterruptedException {
        Assert.assertTrue(elements.getSuccessMessageAssert2().isDisplayed());
        Thread.sleep(3000);
        elements.clickMethod(elements.getProductComparisonLinkInTheSuccessMessage());
        Assert.assertTrue(elements.getProductComparisonHeader().isDisplayed());
    }
}
