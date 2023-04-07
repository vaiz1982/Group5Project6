package StepDefinitons;

import Pages.HasanPOMPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TC_SF_020_StepDefinitions {
    HasanPOMPage hp = new HasanPOMPage();
    @When("I enter mac into the Search box")
    public void iEnterILifeIntoTheSearchBox() {
        hp.sendKeysMethod(hp.getSearchBox(),"mac");
    }

    @And("I click search icon")
    public void iClickSearchIcon() {
        hp.clickMethod(hp.getSearchButtonMainPage());
    }

    @Then("A proper Page Heading, Page URL and Page Title should be displayed for Search page")
    public void aProperPageHeadingPageURLAndPageTitleShouldBeDisplayedForSearchPage() {
        String expectedHeader = "Search - mac";
        String actualHeader = hp.getTextMethod(hp.getSearchMacHeader());
        String expectedTitle = "Search - mac";
        String actualTitle = BasicDriver.getDriver().getTitle();
        String expectedUrl = "https://opencart.abstracta.us/index.php?route=product/search&search=mac";
        String actualUrl = BasicDriver.getDriver().getCurrentUrl().toString();
        Assert.assertEquals(expectedHeader,actualHeader,"Defect header");
        Assert.assertEquals(expectedTitle,actualTitle,"Defect title");
        Assert.assertEquals(expectedUrl,actualUrl,"Defect url");
    }
}
