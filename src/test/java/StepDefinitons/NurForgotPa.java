package StepDefinitons;

import Pages.NurPOMPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class NurForgotPa {
    NurPOMPage oc=new NurPOMPage();
    @And("I click on forgotten password button")
    public void iClickOnForgottenPasswordButton() {
        oc.clickMethod(oc.getForgotPasswordUnderPasswordButton());
    }

    @Then("user should see the login page again")
    public void userShouldSeeTheLoginPageAgain() {
        Assert.assertEquals(BasicDriver.getDriver().getCurrentUrl(),"https://opencart.abstracta.us/index.php?route=account/login");
    }

    @And("navigate back")
    public void navigateBack() {
        BasicDriver.getDriver().navigate().back();
    }
}
