package StepDefinitons;

import Pages.OgunPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class Ogun_TC_002 {

    OgunPOM elements = new OgunPOM();
    @Given("Enter non existing product name into the Search text box field")
    public void enterNonExistingProductNameIntoTheSearchTextBoxField() {
        elements.sendKeysMethod(elements.getSearchBox(),"knife"+Keys.TAB+Keys.ENTER);
    }

    @When("Click on the button having search icon")
    public void clickOnTheButtonHavingSearchIcon() {
    }

    @Then("Verify shopping car is empty")
    public void verifyShoppingCarIsEmpty() {
        String expectedResult = "There is no product that matches the search criteria";
        String actualResult = elements.getTextMethod(elements.getCartEmptyAlert());
        Assert.assertEquals(expectedResult,actualResult);
        //There is no product that matches the search criteria
    }
}
