package StepDefinitons;

import Pages.HasanPOMPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC_HP_008_StepDefinitions {
    HasanPOMPage hp = new HasanPOMPage();
    @Then("I Click on Home icon option in different pages")
    public void iClickOnHomeIconOptionInDifferentPages() {
        hp.clickMethod(hp.getWishList());
        hp.clickMethod(hp.getHomeIcon());
        String expectedTitle = "Your Store";
        String actualTitle = BasicDriver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        hp.clickMethod(hp.getShoppingCartButton());
        hp.clickMethod(hp.getHomeIcon());
        Assert.assertEquals(expectedTitle,actualTitle);
        hp.clickMethod(hp.getCheckOutButton());
        hp.clickMethod(hp.getHomeIcon());
        Assert.assertEquals(expectedTitle,actualTitle);
        hp.clickMethod(hp.getTabletsPage());
        hp.clickMethod(hp.getHomeIcon());
        Assert.assertEquals(expectedTitle,actualTitle);
        hp.clickMethod(hp.getSoftwarePage());
        hp.clickMethod(hp.getHomeIcon());
        Assert.assertEquals(expectedTitle,actualTitle);
        hp.clickMethod(hp.getPhonesPage());
        hp.clickMethod(hp.getHomeIcon());
        Assert.assertEquals(expectedTitle,actualTitle);
        hp.clickMethod(hp.getCamerasPage());
        hp.clickMethod(hp.getHomeIcon());
        Assert.assertEquals(expectedTitle,actualTitle);
        hp.clickMethod(hp.getSearchButtonMainPage());
        hp.clickMethod(hp.getHomeIcon());
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
