package StepDefinitons;

import Pages.OgunPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Ogun_TC_003 {

    OgunPOM elements = new OgunPOM();
    @Given("Enter registered email address into the E-Mail address field")
    public void enterRegisteredEmailAddressIntoTheEMailAddressField() {
        elements.sendKeysMethod(elements.getEmailInput(), "testersdet@test.com");

    }

    @When("Enter new password into the Password field")
    public void enterNewPasswordIntoThePasswordField() {
        elements.sendKeysMethod(elements.getPasswordInput(), "1234567890");
    }

    @And("Click on Login button")
    public void clickOnLoginButton() {
        elements.clickMethod(elements.getLoginButton());
    }

    @Then("Verify user can not login with invalid password")
    public void verifyUserCanNotLoginWithInvalidPassword() {
        Assert.assertTrue(elements.getWrongInputWarning().isDisplayed());
    }
}
