package StepDefinitons;

import Pages.AslanbekPOM;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AslanbekForgotPasswordSteps {
    AslanbekPOM ap = new AslanbekPOM();
    @And("I Click on Forgotten Password link from Login page")
    public void iClickOnForgottenPasswordLinkFromLoginPage() {
        ap.clickMethod(ap.getForgotPassword());
    }

    @And("I Enter the email address of an existing account for which you have forgot the password")
    public void iEnterTheEmailAddressOfAnExistingAccountForWhichYouHaveForgotThePassword() {
        ap.sendKeysMethod(ap.getForgotPasswordEmail(),"testersdet@test.com");

    }

    @And("I Click on Continue button")
    public void iClickOnContinueButton() {
        ap.clickMethod(ap.getContinueBtnForgotPassword());
    }

    @Then("Proper Placeholder text is displayed inside the E-Mail Address fields  of the Forgotten Password page")
    public void properPlaceholderTextIsDisplayedInsideTheEMailAddressFieldsOfTheForgottenPasswordPage() {
        String actualResult = ap.getForgotPasswordEmail().getAttribute("placeholder");
        String expectedResult = "E-Mail Address";
        Assert.assertEquals(actualResult,expectedResult);
    }
}
