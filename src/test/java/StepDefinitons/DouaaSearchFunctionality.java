package StepDefinitons;

import Pages.DouaaPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DouaaSearchFunctionality {
    DouaaPage douaaPage = new DouaaPage();
    @When("Enter any existing Product name into the Search text box field - {string}")
    public void enter_any_existing_product_name_into_the_Search_text_box_field(String searchText) {
        douaaPage.enteringSearchTerm(searchText);
    }
    @When("Click on the button having search icon")
    public void click_on_the_button_having_search_icon() {
        douaaPage.clickingOnSearchButton();
    }
    @Then("More than one products should be displayed in the search results page")
    public void more_than_one_products_should_be_displayed_in_the_search_results_page() {
        douaaPage.verifyMoreThanOneProductIsAvailableInGrid();
    }
    @When("Select List option")
    public void select_list_option() {
        douaaPage.clickingOnListView();
    }
    @Then("Multiple product should be displayed in the List view without any problems and all the options \\(Add to Cart, Wish List and Compare Product) are working. Also User should be able to navigate to Product Display Page of products by clicking on Images and Product Name.")
    public void multiple_product_should_be_displayed_in_the_list_view_without_any_problems_and_all_the_options_add_to_cart_wish_list_and_compare_product_are_working_also_user_should_be_able_to_navigate_to_product_display_page_of_products_by_clicking_on_images_and_product_name() {
        douaaPage.verifyMoreThanOneProductIsAvailableInList();
        douaaPage.verifyAddToCartWishlistAndCompareButton();
        douaaPage.clickingOnProductNameAndVerifyItNavigatesToTheProductPage();
        douaaPage.clickingOnProductImageAndVerifyItNavigatesToTheProductPage();
    }
    @Then("Multiple product should be displayed in the Grid view without any problems and all the options \\(Add to Cart, Wish List and Compare Product) are working. Also User should be able to navigate to Product Display Page of products by clicking on Images and Product Name.")
    public void multiple_product_should_be_displayed_in_the_grid_view_without_any_problems_and_all_the_options_add_to_cart_wish_list_and_compare_product_are_working_also_user_should_be_able_to_navigate_to_product_display_page_of_products_by_clicking_on_images_and_product_name() {
        douaaPage.verifyMoreThanOneProductIsAvailableInGrid();
        douaaPage.verifyAddToCartWishlistAndCompareButton();
        douaaPage.clickingOnProductNameAndVerifyItNavigatesToTheProductPage();
        douaaPage.clickingOnProductImageAndVerifyItNavigatesToTheProductPage();
    }

    @When("Select Grid option")
    public void selectGridOption() {
        douaaPage.clickingOnGridView();
    }
}
