package StepDefinitons;

import Pages.NurPOMPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class NurLoginFunc {
    NurPOMPage oc=new NurPOMPage();
    @And("I enter {string} and invalid {string} and click login button")
    public void iEnterAndInvalidAndClickLoginButton(String email, String password) {
        oc.sendKeysMethod(oc.getEmailField(),email);
        oc.sendKeysMethod(oc.getPasswordField(),password);
        oc.clickMethod(oc.getLoginButton());
    }
    @Then("user should see the Warning message with the text Warning: No match for E-Mail Address and or Password. should be displayed")
    public void userShouldSeeTheWarningMessageWithTheTextWarningNoMatchForEMailAddressAndOrPasswordShouldBeDisplayed() {
        Assert.assertTrue(oc.getEmailNotMatchMessage().isDisplayed());
    }

    @And("I close the browser")
    public void iCloseTheBrowser() throws InterruptedException {
        BasicDriver.getDriver().close();
    }

    @Then("user should see logged in page again")
    public void userShouldSeeLoggedInPageAgain() {
        Assert.assertEquals(BasicDriver.getDriver().getCurrentUrl(),"https://opencart.abstracta.us/index.php?route=account/account");
    }

    @And("I navigate to OpenCart web page again")
    public void iNavigateToOpenCartWebPageAgain() throws InterruptedException {
        Thread.sleep(3000);
        BasicDriver.getDriver().get("https://opencart.abstracta.us/");

    }
}
