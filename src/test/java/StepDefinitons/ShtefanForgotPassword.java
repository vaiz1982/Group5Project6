package StepDefinitons;

import Pages.ShtefanPOM;
import io.cucumber.java.en.Then;

public class ShtefanForgotPassword {
    ShtefanPOM sp = new ShtefanPOM();

    @Then("I enter email which doesnt exist and click on Continue button")
    public void iEnterEmailWhichDoesntExistAndClickOnContinueButton() {
        sp.sendKeysMethod(sp.getForgotPasswordEmailBox(), "qwertyuiop@unknown.com");
        sp.clickMethod(sp.getContinueButtonForgotPassword());
    }
}


