package StepDefinitons;

import Pages.AlexPOMPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Alex_213 {

    AlexPOMPage oc=new AlexPOMPage();


    @Given("Check the {string} page functionality in all the supported environments \\(Validate ER-{int})")
    public void check_the_page_functionality_in_all_the_supported_environments_validate_er(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("{string} page functionality should work correctly in all the supported environments")
    public void page_functionality_should_work_correctly_in_all_the_supported_environments(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
