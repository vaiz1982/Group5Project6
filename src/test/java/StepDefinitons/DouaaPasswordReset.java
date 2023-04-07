package StepDefinitons;

import Pages.DouaaPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DouaaPasswordReset {
    DouaaPage douaaPage = new DouaaPage();
    @When("Click on Forgotten Password link from Login page")
    public void click_on_forgotten_password_link_from_login_page() {
        douaaPage.clickingOnMyAccount();
        douaaPage.gotoLoginPage();
        douaaPage.clickingOnForgottenPasswordLink();
    }
    @Then("User should be taken to Forgotten Password page")
    public void user_should_be_taken_to_forgotten_password_page() {
        douaaPage.verifyUserInForgotPasswordPage();
    }
    @When("Enter the email address of an existing account for which you have forgot the password")
    public void enter_the_email_address_of_an_existing_account_for_which_you_have_forgot_the_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click on Continue button")
    public void click_on_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Success message with text - An email with a confirmation link has been sent your email address. should be displayed in green color")
    public void success_message_with_text_an_email_with_a_confirmation_link_has_been_sent_your_email_address_should_be_displayed_in_green_color() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Check the registered email address for which the password got reset")
    public void check_the_registered_email_address_for_which_the_password_got_reset() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Validate that an email is received regarding resetting of the password to the registered email address")
    public void validate_that_an_email_is_received_regarding_resetting_of_the_password_to_the_registered_email_address() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click on the link for resetting the password from the received email body")
    public void click_on_the_link_for_resetting_the_password_from_the_received_email_body() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should be taken Reset your Password page")
    public void user_should_be_taken_reset_your_password_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Enter new password into the Password and Confirm fields")
    public void enter_new_password_into_the_password_and_confirm_fields() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Success message with text - Success: Your password has been successfully updated. should be displayed in green color and User should be navigated to Login page")
    public void success_message_with_text_success_your_password_has_been_successfully_updated_should_be_displayed_in_green_color_and_user_should_be_navigated_to_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Enter the email address into the E-Mail address field and the new reset password into the Password field")
    public void enter_the_email_address_into_the_e_mail_address_field_and_the_new_reset_password_into_the_password_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should be able to login with the new password")
    public void user_should_be_able_to_login_with_the_new_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Click on the reset password link available in the email")
    public void clickOnTheResetPasswordLinkAvailableInTheEmail() {
        
    }

    @Then("Check and verify the Page Heading, Page URL and Page Title")
    public void checkAndVerifyThePageHeadingPageURLAndPageTitle() {
    }
}
