package StepDefinitions;

import Pages.SercanPOMPage;
import Utilities.BasicDriver;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SercanLogin extends MyMethods {
    SercanPOMPage page = new SercanPOMPage();

    @Given("Navigate to OpenCart web page")
    public void navigateToOpenCartWebPage() {
        BasicDriver.getDriver().get("https://opencart.abstracta.us/");
    }

    @When("I navigate to login page")
    public void iNavigateToLoginPage() {
        page.clickMethod(page.getMyAccountButton());
        page.clickMethod(page.getLoginLink());

    }

    @And("I enter valid {string} and valid {string} and click login button")
    public void iEnterAndValidAndClickLoginButton(String email, String password) {
        page.sendKeysMethod(page.getEmailTextBox(), email);
        page.sendKeysMethod(page.getPasswordTextBox(), password);
        page.clickMethod(page.getLoginButton());
    }

    @Then("I should be logged in and taken to the Account page")
    public void iShouldBeLoggedInAndTakenToTheAccountPage() {
        Assert.assertEquals(BasicDriver.getDriver().getTitle(), "My Account");
    }

    @When("I enter invalid {string} and valid {string} and click login button")
    public void iEnterInvalidAndValidAndClickLoginButton(String email, String password) {
        page.sendKeysMethod(page.getEmailTextBox(), email);
        page.sendKeysMethod(page.getPasswordTextBox(), password);
        page.clickMethod(page.getLoginButton());
    }

    @Then("I should see a warning message with the text {string}")
    public void iShouldSeeAWarningMessageWithTheText(String warningMessage) {
        Assert.assertEquals(true, page.getPasswordWarningMessage().isDisplayed());
    }

    @And("I click on change your password link")
    public void iClickOnChangeYourPasswordLink() {
        page.clickMethod(page.getChangePasswordButton());
    }


    @And("I click on Continue button")
    public void iClickOnContinueButton() {
        page.clickMethod(page.getContinueButton());
    }

    @When("I click on My Account dropmenu and select Logout Option")
    public void iClickOnMyAccountDropmenuAndSelectLogoutOption() {
        page.clickMethod(page.getMyAccountButton());
        page.clickMethod(page.getLogoutButton());
    }

    @And("I clear the current email and password data")
    public void iClearTheCurrentEmailAndPasswordData() {
        page.getEmailTextBox().clear();
        page.getPasswordTextBox().clear();
    }

    @When("I enter new valid {string} and new valid {string} and click login button")
    public void iEnterNewValidAndNewValidAndClickLoginButton(String newEmail, String newPassword) {
        page.sendKeysMethod(page.getEmailTextBox(), newEmail);
        page.sendKeysMethod(page.getPasswordTextBox(), newPassword);
        page.clickMethod(page.getLoginButton());
    }

    @And("I enter {string} into the Password and Password Confirm fields")
    public void iEnterIntoThePasswordAndPasswordConfirmFields(String newPassword) {
        page.sendKeysMethod(page.getPasswordTextBox(), newPassword);
        page.sendKeysMethod(page.getConfirmPasswordField(), newPassword);
    }
}
