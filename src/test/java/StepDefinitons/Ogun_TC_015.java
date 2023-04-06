package StepDefinitons;

import Pages.OgunPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Ogun_TC_015 {

    OgunPOM elements = new OgunPOM();
    @Given("Click on Forgotten Password link from Login page")
    public void clickOnForgottenPasswordLinkFromLoginPage() {
        elements.clickMethod(elements.getForgottenButtonUnderPassword());
    }

    @When("Don't enter anything into the E-Mail Address field")
    public void donTEnterAnythingIntoTheEMailAddressField() {
    }

    @Then("Verify warning message")
    public void verifyWarningMessage() {
        String expectedResult = "E-Mail must be between 4 and 20 characters!' should be displayed for";
        String actualResult = elements.getTextMethod(elements.getForgottenPasswordWarning());
        Assert.assertEquals(expectedResult,actualResult);


    }

    @And("Click on Continue button password forgotten page")
    public void clickOnContinueButtonPasswordForgottenPage() {
        elements.clickMethod(elements.getForgottenContinueButton());
    }
}
