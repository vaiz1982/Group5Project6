package StepDefinitons;

import Pages.ShtefanPOM;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShtefanLogoutSteps{

    ShtefanPOM sp = new ShtefanPOM();

    @Then("Click on logout button")
    public void clickOnLogoutButton() {
        sp.clickMethod(sp.getLogoutButton());
    }

    @Then("Click on browser back option")
    public void clickOnBrowserBackOption() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().back();
    }
}
