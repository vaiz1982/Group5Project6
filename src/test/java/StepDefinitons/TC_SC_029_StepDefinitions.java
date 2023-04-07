package StepDefinitons;

import Pages.HasanPOMPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC_SC_029_StepDefinitions {
    HasanPOMPage hp = new HasanPOMPage();
    @When("Click on Use Gift Certificate section")
    public void clickOnUseGiftCertificateSection() {
       hp.clickMethod(hp.getUseGiftCertificate());
    }

    @Then("I should see Enter your gift certificate code here displayed inside the text field")
    public void iShouldSeeEnterYourGiftCertificateCodeHereDisplayedInsideTheTextField() {
        Assert.assertTrue(hp.getPlaceHolderNameInTextField().isEnabled());
    }
}
