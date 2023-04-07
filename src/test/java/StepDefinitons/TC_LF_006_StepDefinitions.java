package StepDefinitons;

import Pages.HasanPOMPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TC_LF_006_StepDefinitions {
    HasanPOMPage hp = new HasanPOMPage();
    @Given("I navigate to OpenCart webpage")
    public void iNavigateToOpenCartWebPage() {
        BasicDriver.getDriver().get("https://opencart.abstracta.us/");
    }
    @When("I click on My Account drop menu")
    public void iClickOnMyAccountDropmenu() {
        hp.clickMethod(hp.getMyAccount());
    }
    @Then("I click on Login button")
    public void iClickOnLoginButton() {
        hp.clickMethod(hp.getLogInPage());
    }

    @And("I click on Forgotten Password link")
    public void iClickOnForgottenPasswordLink() {
        hp.clickMethod(hp.getForgottenPasswordPage());
    }

    @Then("I should be on Forgotten Password Page")
    public void iShouldBeOnForgottenPasswordPage() {
        String expected = "Enter the e-mail address associated with your account. Click submit to have a password reset link e-mailed to you.";
        String actual = hp.getTextMethod(BasicDriver.getDriver().findElement(By.xpath("//div[@id='content']/../..//p[text()='Enter the e-mail address associated with your account. Click submit to have a password reset link e-mailed to you.']")));
        Assert.assertEquals(expected,actual);
    }

}
