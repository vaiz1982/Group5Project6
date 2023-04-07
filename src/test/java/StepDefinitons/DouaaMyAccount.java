package StepDefinitons;

import Pages.DouaaPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DouaaMyAccount {
    DouaaPage douaaPage = new DouaaPage();
    @When("Click on My Account Drop menu and select My Account option")
    public void click_on_my_account_drop_menu_and_select_my_account_option() {
        douaaPage.clickingOnMyAccount();
        douaaPage.clickingOnMyAccountUnderMyAccount();
    }
    @Then("Validate the Breadcrumb in the displayed My Account page")
    public void validate_the_breadcrumb_in_the_displayed_my_account_page() {
        douaaPage.verifyAccountBreadCrumb();
    }
}
