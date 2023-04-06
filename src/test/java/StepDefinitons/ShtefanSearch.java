package StepDefinitons;

import Pages.ShtefanPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ShtefanSearch {
    ShtefanPOM sp = new ShtefanPOM();

    @Given("I navigate to all pages of the Application")
    public void iNavigateToAllPagesOfTheApplication() {
        sp.clickMethod(sp.getTabletsPage());
        Assert.assertEquals(sp.getSearchBox().getDomProperty("placeholder"),"Search");
        Assert.assertEquals(sp.getSearchButton().getDomProperty("type"), "button");
        sp.clickMethod(sp.getSoftwarePage());
        Assert.assertEquals(sp.getSearchBox().getDomProperty("placeholder"),"Search");
        Assert.assertEquals(sp.getSearchButton().getDomProperty("type"), "button");
        sp.clickMethod(sp.getPhonesPage());
        Assert.assertEquals(sp.getSearchBox().getDomProperty("placeholder"),"Search");
        Assert.assertEquals(sp.getSearchButton().getDomProperty("type"), "button");
        sp.clickMethod(sp.getCamerasPage());
        Assert.assertEquals(sp.getSearchBox().getDomProperty("placeholder"),"Search");
        Assert.assertEquals(sp.getSearchButton().getDomProperty("type"), "button");
        sp.clickMethod(sp.getMp3playerPage());
        Assert.assertEquals(sp.getSearchBox().getDomProperty("placeholder"),"Search");
        Assert.assertEquals(sp.getSearchButton().getDomProperty("type"), "button");


    }

    @Then("I validate textbox and search icon are displayed on all the pages")
    public void iValidateTextboxAndSearchIconAreDisplayedOnAllThePages() {
    }
}
