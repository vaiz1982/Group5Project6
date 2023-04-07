package StepDefinitons;

import Pages.DouaaPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DouaaSearchFunctionality {
    DouaaPage douaaPage = new DouaaPage();
    @When("Enter the search criteria in the Search text box field which can result in multiple products - {string}")
    public void enter_the_search_criteria_in_the_search_text_box_field_which_can_result_in_multiple_products(String searchText) {
        douaaPage.enteringSearchTerm(searchText);
    }
    @When("Click on the button having search icon")
    public void click_on_the_button_having_search_icon() {
        douaaPage.clickingOnSearchButton();
    }
    @Then("More than one products should be displayed in the search results page")
    public void more_than_one_products_should_be_displayed_in_the_search_results_page() {
        douaaPage.verifyMoreThanOneProductIsAvailable();
    }
    @When("Select List option")
    public void select_list_option(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Multiple product should be displayed in the List view without any problems and all the options \\(Add to Cart, Wish List and Compare Product) are working. Also User should be able to navigate to Product Display Page of products by clicking on Images and Product Name.")
    public void multiple_product_should_be_displayed_in_the_list_view_without_any_problems_and_all_the_options_add_to_cart_wish_list_and_compare_product_are_working_also_user_should_be_able_to_navigate_to_product_display_page_of_products_by_clicking_on_images_and_product_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Multiple product should be displayed in the Grid view without any problems and all the options \\(Add to Cart, Wish List and Compare Product) are working. Also User should be able to navigate to Product Display Page of products by clicking on Images and Product Name.")
    public void multiple_product_should_be_displayed_in_the_grid_view_without_any_problems_and_all_the_options_add_to_cart_wish_list_and_compare_product_are_working_also_user_should_be_able_to_navigate_to_product_display_page_of_products_by_clicking_on_images_and_product_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Select Grid option")
    public void selectGridOption() {
    }
}
