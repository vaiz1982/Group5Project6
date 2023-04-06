package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShtefanPOM extends MyMethods {
    public ShtefanPOM() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'Logout')]")
    private WebElement logoutButton;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement forgotPasswordEmailBox;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButtonForgotPassword;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']//a[contains(text(),'Tablets')]")
    private WebElement tabletsPage;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']//a[contains(text(),'Software')]")
    private WebElement softwarePage;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']//a[contains(text(),'Phones & PDAs')]")
    private WebElement phonesPage;
    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[7]/a")
    private WebElement camerasPage;
    @FindBy(xpath = "//a[normalize-space()='MP3 Players']")
    private WebElement mp3playerPage;
    @FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchBox;
    @FindBy(xpath = "//i[@class='fa fa-search']")
    private WebElement searchButton;

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    public WebElement getForgotPasswordEmailBox() {
        return forgotPasswordEmailBox;
    }

    public WebElement getContinueButtonForgotPassword() {
        return continueButtonForgotPassword;
    }

    public WebElement getTabletsPage() {
        return tabletsPage;
    }

    public WebElement getSoftwarePage() {
        return softwarePage;
    }

    public WebElement getPhonesPage() {
        return phonesPage;
    }

    public WebElement getCamerasPage() {
        return camerasPage;
    }

    public WebElement getMp3playerPage() {
        return mp3playerPage;
    }

    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }
}
