package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class DouaaPage extends MyMethods {
    public DouaaPage() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='My Account']")
    WebElement myAccount;
    @FindBy(xpath = "//span[text()='My Account']/../..//a[text()='Login']")
    WebElement loginUnderMyAccount;
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement returningCustomerText;
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'Logout')]")
    WebElement logoutUnderMyAccount;
    @FindBy(id = "input-email")
    WebElement emailField;
    @FindBy(id = "input-password")
    WebElement passwordField;
    @FindBy(css = "input[type='submit']")
    WebElement loginButton;
    @FindBy(xpath = "//div[@class='form-group']//a[contains(text(),'Forgotten Password')]")
    WebElement forgottenPasswordLink;
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement searchField;
    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    WebElement searchButton;
    @FindBy(xpath = "//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']")
    List<WebElement> searchProductItems;
    @FindBy(id = "list-view")
    WebElement listViewButton;
    @FindBy(id = "grid-view")
    WebElement gridViewButton;

    public void clickingOnMyAccount() {
        clickMethod(myAccount);
    }

    public void gotoLoginPage() {
        clickMethod(loginUnderMyAccount);
    }

    public void enteringEmailAddress(String email) {
        sendKeysMethod(emailField, email);
    }

    public void enteringPassword(String password) {
        sendKeysMethod(passwordField, password);
    }

    public void clickingOnLoginButton() {
        clickMethod(loginButton);
    }

    public void clickingOnLogoutButton() {
        clickMethod(logoutUnderMyAccount);
    }

    public void verifyUserCannotLogin() {
        logoutUnderMyAccount.isDisplayed();
    }

    public void verifyUserInLoginPage() {
        returningCustomerText.isDisplayed();
    }

    public void clickingOnForgottenPasswordLink() {
        clickMethod(forgottenPasswordLink);
    }

    public void verifyUserInForgotPasswordPage() {
        Assert.assertTrue(BasicDriver.getDriver().getCurrentUrl().contains("forgotten"));
    }

    public void enteringSearchTerm(String searchText) {
        sendKeysMethod(searchField, searchText);
    }

    public void clickingOnSearchButton() {
        clickMethod(searchButton);
    }

    public void verifyMoreThanOneProductIsAvailable() {
        Assert.assertTrue(searchProductItems.size() > 1);
    }
}
