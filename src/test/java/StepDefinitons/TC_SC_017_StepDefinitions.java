package StepDefinitons;

import Pages.HasanPOMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC_SC_017_StepDefinitions {
    HasanPOMPage hp = new HasanPOMPage();

    @And("I click Add to Cart button in the displayed Product Display page")
    public void iClickAddToCartButtonInTheDisplayedProductDisplayPage() {
        hp.clickMethod(hp.getAddToCartButtonOnProductDisplayPage());
    }

    @When("I Click on the shopping cart! link in the displayed success message")
    public void iClickOnTheShoppingCartLinkInTheDisplayedSuccessMessage() {
        hp.clickMethod(hp.getShoppingCartLink());
    }

    @And("I click on Use Coupon Code section")
    public void iClickOnUseCouponCodeSection() {
        hp.clickMethod(hp.getUseCouponCode());
    }

    @When("I click on Apply Coupon without entering any coupon code")
    public void iClickOnApplyCouponWithoutEnteringAnyCouponCode() {
        hp.clickMethod(hp.getApplyCouponButton());
    }

    @Then("Warning message with text - Warning: Please enter a coupon code! should be displayed")
    public void warningMessageWithTextWarningPleaseEnterACouponCodeShouldBeDisplayed() {
        Assert.assertTrue(hp.getEnterCouponCodeWarningMessage().isDisplayed());
    }
}
