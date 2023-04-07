package StepDefinitons;

import Pages.HasanPOMPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class TC_PC_010_StepDefinitions {
    HasanPOMPage hp = new HasanPOMPage();
    @When("I hover over on any Menu say Desktops")
    public void iHoverOverOnAnyMenuSayDesktops() {
        Actions action = new Actions(BasicDriver.getDriver());
        action.moveToElement(hp.getDesktops()).perform();
    }

    @And("I select Show All Desktops option")
    public void iSelectShowAllDesktopsOption() {
        hp.clickMethod(hp.getShowAllDesktops());
    }

    @And("In the displayed Desktops category page, click on Product Compare\\(Zero) link")
    public void inTheDisplayedDesktopsCategoryPageClickOnProductCompareZeroLink() {
        hp.clickMethod(hp.getProductCompareLink());
    }

    @Then("You have not chosen any products to compare. should be displayed on the page")
    public void youHaveNotChosenAnyProductsToCompareShouldBeDisplayedOnThePage() {
        String expected = "You have not chosen any products to compare.";
        String actual = hp.getProductCompareMessage().getText();
        Assert.assertEquals(expected,actual,"Actual message doesn't match. FAIL!!");
    }


}
