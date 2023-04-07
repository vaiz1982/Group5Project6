package StepDefinitons;

import Pages.YusufPOM;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;

public class YusufSteps {
    YusufPOM ya = new YusufPOM();
    @And("click login button")
    public void clickLoginButton() {
        ya.clickMethod(ya.getLoginButton());

    }

    @Then("Warning message should be displayed")
    public void warningMessageShouldBeDisplayed() {
        String warningMessage = ya.getTextMethod(ya.getWarningMessage());
        String expectedResult = "Warning: No match for E-Mail Address and/or Password.";
        Assert.assertEquals(warningMessage,expectedResult);
    }

    @And("click forgotten password option")
    public void clickForgottenPasswordOption() {
        ya.clickMethod(ya.getForgottenPassword());
    }

    @Then("user should navigated to forgotten password page")
    public void userShouldNavigatedToForgottenPasswordPage() {
        Assert.assertEquals(BasicDriver.getDriver().getTitle(),"Forgot Your Password?");
    }

    @Then("Click on the search icon")
    public void clickOnTheSearchIcon() {
        ya.clickMethod(ya.getClickButton());
    }

    @And("Enter any existing product name into the Search Criteria text box field")
    public void enterAnyExistingProductNameIntoTheSearchCriteriaTextBoxField() {
        ya.sendKeysMethod(ya.getInputSearch(),"iMac");
    }

    @And("Click on Search button")
    public void clickOnSearchButton() {
        ya.clickMethod(ya.getButtonSearch());
    }

    @Then("Searched product should be displayed in the search results")
    public void searchedProductShouldBeDisplayedInTheSearchResults() {
        String actualResult = ya.getTextMethod(ya.getSearchedProduct());
        Assert.assertEquals(actualResult,"iMac");
    }

    @Then("I hover over to Desktops")
    public void iHoverOverToDesktops() {
        Actions actions = new Actions(BasicDriver.getDriver());
        Action hoverOverDesktopAction = actions.moveToElement(ya.getHoverOverDesktops()).build();
        hoverOverDesktopAction.perform();
    }

    @And("I click to Show All Desktops")
    public void iClickToShowAllDesktops() {
        ya.clickMethod(ya.getClickShowAllDesktops());
    }

    @And("I click to Product Compare link")
    public void iClickToProductCompareLink(){
        ya.clickMethod(ya.getClickProductCompareLink());
    }

    @Then("User should be taken to Product Compare page")
    public void userShouldBeTakenToProductComparePage() {
        Assert.assertEquals(BasicDriver.getDriver().getTitle(),"Product Comparison");

    }
}
