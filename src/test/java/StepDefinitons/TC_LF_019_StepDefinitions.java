package StepDefinitons;

import Pages.HasanPOMPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC_LF_019_StepDefinitions {
    HasanPOMPage hp = new HasanPOMPage();
    @When("I Click on Continue button under New Customer section")
    public void iClickOnContinueButtonUnderNewCustomerSection() {
        hp.clickMethod(hp.getContinueUnderNewCustomer());
    }

    @Then("I should be navigated to Register page")
    public void iShouldBeNavigatedToRegisterPage() {
        String expectedTitle = "Register Account";
        String actualTitle = BasicDriver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @And("I navigate back to Login page")
    public void iNavigateBackToLoginPage() {
        BasicDriver.getDriver().navigate().back();
        String expectedTitle = "Account Login";
        String actualTitle = BasicDriver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("I should be able to navigate to applicable options")
    public void iShouldBeAbleToNavigateToApplicableOptions() {
        hp.clickMethod(hp.getTabletsPage());
        String expectedTabletsTitle = "Tablets";
        String actualTabletsTitle = BasicDriver.getDriver().getTitle();
        Assert.assertEquals(expectedTabletsTitle,actualTabletsTitle);
        BasicDriver.getDriver().navigate().back();

        hp.clickMethod(hp.getSoftwarePage());
        String expectedSoftwareTitle = "Software";
        String actualSoftwareTitle = BasicDriver.getDriver().getTitle();
        Assert.assertEquals(expectedSoftwareTitle,actualSoftwareTitle);
        BasicDriver.getDriver().navigate().back();

        hp.clickMethod(hp.getPhonesPage());
        String expectedPhonesTitle = "Phones & PDAs";
        String actualPhonesTitle = BasicDriver.getDriver().getTitle();
        Assert.assertEquals(expectedPhonesTitle,actualPhonesTitle);
        BasicDriver.getDriver().navigate().back();

        hp.clickMethod(hp.getCamerasPage());
        String expectedCamerasTitle = "Cameras";
        String actualCamerasTitle = BasicDriver.getDriver().getTitle();
        Assert.assertEquals(expectedCamerasTitle,actualCamerasTitle);
        BasicDriver.getDriver().navigate().back();

        hp.clickMethod(hp.getRegisterOnLoginPage());
        String expectedRegisterTitle = "Register Account";
        String actualRegisterTitle = BasicDriver.getDriver().getTitle();
        Assert.assertEquals(expectedRegisterTitle,actualRegisterTitle);
        BasicDriver.getDriver().navigate().back();

        hp.clickMethod(hp.getForgottenPasswordPage());
        String expectedForgetPassTitle = "Forgot Your Password?";
        String actualForgetPassTitle = BasicDriver.getDriver().getTitle();
        Assert.assertEquals(expectedForgetPassTitle,actualForgetPassTitle);
        BasicDriver.getDriver().navigate().back();

    }
}
