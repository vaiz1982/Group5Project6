package StepDefinitons;

import Pages.HasanPOMPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.When;

public class TC_MA_002_StepDefinitions {
    HasanPOMPage hp = new HasanPOMPage();
    @When("I enter valid email and password and click login button")
    public void iEnterValidEmailAndPasswordAndClickLoginButton() {
        hp.sendKeysMethod(hp.getLoginEmailField(),"aston@martin.com");
        hp.sendKeysMethod(hp.getLoginPasswordField(),"password");
        hp.clickMethod(hp.getLoginButton());

        String expectedTitle = "My Account";
        String actualTitle = BasicDriver.getDriver().getTitle();
    }
}
