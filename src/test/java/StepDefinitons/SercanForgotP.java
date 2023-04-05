package StepDefinitons;

import Pages.SercanPOMPage;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SercanForgotP extends MyMethods {
    SercanPOMPage page = new SercanPOMPage();

    @And("I click on the Forgotten Password link")
    public void iClickOnTheForgottenPasswordLink() {
        page.getForgottenPasswordButton().click();
    }

    @And("Enter any {string} into the E-Mail Address field")
    public void enterAnyIntoTheEMailAddressField(String invalidFormattedEmailAddress) {
        page.getEmailTextBox().sendKeys(invalidFormattedEmailAddress);
    }


    @Then("Warning message informing the User to provide a valid formatted email address should be displayed")
    public void warningMessageInformingTheUserToProvideAValidFormattedEmailAddressShouldBeDisplayed() {
        Assert.assertFalse(page.getEmailWarningMessage().getText().contains("valid") ||
                page.getEmailWarningMessage().getText().contains("invalid"));
    }


}
