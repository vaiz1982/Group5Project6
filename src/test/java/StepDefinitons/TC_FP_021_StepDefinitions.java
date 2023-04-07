package StepDefinitons;

import Utilities.BasicDriver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TC_FP_021_StepDefinitions {
    @Then("A proper working Breadcrumb should be displayed on the Forgotten Password page")
    public void aProperWorkingBreadcrumbShouldBeDisplayedOnTheForgottenPasswordPage() {
        List<String> expected = Arrays.asList("Account", "Forgotten Password");
        List<String> breadcrumbsElements = new ArrayList<>();
        List<WebElement> breadcrumbs = BasicDriver.getDriver().findElements(By.xpath("//ul[@class='breadcrumb']//a"));
        for (int i = 1; i < breadcrumbs.size(); i++) {
            breadcrumbsElements.add(breadcrumbs.get(i).getText());
        }
        Assert.assertEquals(expected, breadcrumbsElements);
    }
}
