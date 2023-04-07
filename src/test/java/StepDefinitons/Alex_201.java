package StepDefinitons;

import Pages.AlexPOMPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Alex_201 {


    AlexPOMPage oc=new AlexPOMPage();

    @When("Provide complete details into the {string}, {string} and {string} sections")
    public void provide_complete_details_into_the_and_sections(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should be taken to {string} Page")
    public void user_should_be_taken_to_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
