package StepDefinitions;

import Pages.NurPOMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class NurWishList {
    NurPOMPage oc=new NurPOMPage();
    @And("I click on the wish list button")
    public void iClickOnTheWishListButton() {
        oc.clickMethod(oc.getWishListButton());
    }

    @Then("user see the my wish list on the bread crumb")
    public void userSeeTheMyWishListOnTheBreadCrumb() {
        Assert.assertTrue(oc.getMyWishListButtonOnTheBreadCrumb().isDisplayed());
    }
}
