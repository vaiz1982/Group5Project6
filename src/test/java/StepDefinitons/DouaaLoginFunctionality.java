package StepDefinitons;

import Pages.DouaaPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DouaaLoginFunctionality {
    DouaaPage douaaPage = new DouaaPage();
    @Given("Open the Application URL in any supported Browser")
    public void openTheApplicationURLInAnySupportedBrowser() {
        BasicDriver.getDriver().get("https://opencart.abstracta.us/");
    }

    @When("Click on My Account Drop menu")
    public void click_on_drop_menu() {
        douaaPage.clickingOnMyAccount();
    }

    @When("Click on Login option")
    public void click_on_login_option() {
        douaaPage.gotoLoginPage();
    }

    @And("Enter valid email address into the E-Mail Address field - {string}")
    public void enterValidEmailAddressIntoTheEMailAddressField(String email) {
        douaaPage.enteringEmailAddress(email);
    }

    @And("Enter valid password into the Password field - {string}")
    public void enterValidPasswordIntoThePasswordField(String password) {
        douaaPage.enteringPassword(password);
    }

    @When("Click on Login button")
    public void click_on_login_button() {
        douaaPage.clickingOnLoginButton();
    }

    @When("Click on My Account Drop menu and select Logout option")
    public void click_on_my_account_drop_menu_and_select_logout_option() {
        douaaPage.clickingOnMyAccount();
        douaaPage.clickingOnLogoutButton();
    }

    @And("Click on Browser back button")
    public void clickOnBrowserBackButton() {
        BasicDriver.getDriver().navigate().back();
    }

    @Then("User should not get logged in again")
    public void user_should_not_get_logged_in_again() {
        douaaPage.clickingOnMyAccount();
        douaaPage.verifyUserCannotLogin();
    }

    @Then("Login functionality should work correctly in all the supported environments")
    public void loginFunctionalityShouldWorkCorrectlyInAllTheSupportedEnvironments() {
        douaaPage.verifyUserInLoginPage();
    }
}
