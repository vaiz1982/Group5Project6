package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SercanPOMPage extends MyMethods {

    public SercanPOMPage() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(id = "input-email")
    private WebElement emailTextBox;

    @FindBy(id = "input-password")
    private WebElement passwordTextBox;

    @FindBy(xpath = "//span[normalize-space()='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = "//a[normalize-space()='Login']")
    private WebElement loginLink;

    @FindBy(css = "input[value='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private WebElement passwordWarningMessage;

    @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Password']")
    private WebElement changePasswordButton;

    @FindBy(id = "input-confirm")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;

    @FindBy(linkText = "Logout")
    private WebElement logoutButton;

    @FindBy(linkText = "Forgotten Password")
    private WebElement forgottenPasswordButton;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private WebElement emailWarningMessage;

    @FindBy(linkText = "Site Map")
    private WebElement siteMapButton;

    @FindBy(xpath = "//a[normalize-space()='Search']")
    private WebElement searchLink;

    @FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchBox;

    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    private WebElement searchButton;

    @FindBy(className = "img-responsive")
    private List<WebElement> searchResults;

    @FindBy(xpath = "//div[@id='content']//div[1]//div[position() <= 4]//div[3]//button[3]")
    private List<WebElement> compareButtons;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement compareSuccessMessage;

    @FindBy(xpath = "//a[normalize-space()='product comparison']")
    private WebElement productComparisonLink;

    @FindBy(xpath = "//strong[normalize-space()='Product Details']")
    private WebElement productDetails;

    @FindBy(linkText = "Wish List")
    private WebElement wishListLink;

    @FindBy(xpath = "//img[@title='iMac']")
    private WebElement iMacResult;

    @FindBy(xpath = "//button[@class='btn btn-default']//i[@class='fa fa-heart']")
    private WebElement addToWishlist;

    @FindBy(xpath = "//a[normalize-space()='wish list']")
    private WebElement wishListFromSuccessMessage;


    @FindBy(className = "img-thumbnail")
    List<WebElement> allProducts;

    @FindBy(xpath = "//tbody/tr/td[position() > 1 and position() < 6]/input[1]")
    List<WebElement> addToCartButtons;

    @FindBy(linkText = "Remove")
    List<WebElement> removeButtons;

    @FindBy(className = "description")
    List<WebElement> allDescriptions;

    @FindBy(xpath = "//i[@class='fa fa-exchange']")
    private WebElement compareButtonInSearchResult;

    @FindBy (linkText = "iMac")
    private WebElement iMacResultText;

    @FindBy (linkText = "Apple Cinema 30\"")
    private WebElement appleCinema;

    @FindBy (xpath = "//li[normalize-space()='Reward Points: 100']")
    private WebElement rewardPoints;

    public WebElement getWishListLink() {
        return wishListLink;
    }

    public List<WebElement> getAllDescriptions() {
        return allDescriptions;
    }

    public WebElement getCompareButtonInSearchResult() {
        return compareButtonInSearchResult;
    }

    public WebElement getProductDetails() {
        return productDetails;
    }

    public List<WebElement> getAllProducts() {
        return allProducts;
    }

    public List<WebElement> getAddToCartButtons() {
        return addToCartButtons;
    }

    public List<WebElement> getRemoveButtons() {
        return removeButtons;
    }

    public WebElement getProductComparisonLink() {
        return productComparisonLink;
    }

    public WebElement getCompareSuccessMessage() {
        return compareSuccessMessage;
    }

    public List<WebElement> getCompareButtons() {
        return compareButtons;
    }

    public WebElement getForgottenPasswordButton() {
        return forgottenPasswordButton;
    }

    public WebElement getEmailWarningMessage() {
        return emailWarningMessage;
    }

    public WebElement getEmailTextBox() {
        return emailTextBox;
    }

    public WebElement getPasswordWarningMessage() {
        return passwordWarningMessage;
    }

    public WebElement getPasswordTextBox() {
        return passwordTextBox;
    }

    public WebElement getMyAccountButton() {
        return myAccountButton;
    }

    public WebElement getLoginLink() {
        return loginLink;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getChangePasswordButton() {
        return changePasswordButton;
    }

    public WebElement getConfirmPasswordField() {
        return confirmPasswordField;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    public WebElement getSiteMapButton() {
        return siteMapButton;
    }

    public WebElement getSearchLink() {
        return searchLink;
    }

    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public List<WebElement> getSearchResults() {
        return searchResults;
    }

    public WebElement getIMacResult() {
        return iMacResult;
    }

    public WebElement getAddToWishlist() {
        return addToWishlist;
    }

    public WebElement getWishListFromSuccessMessage() {
        return wishListFromSuccessMessage;
    }

    public WebElement getiMacResultText() {
        return iMacResultText;
    }


    public WebElement getAppleCinema() {
        return appleCinema;
    }

    public WebElement getRewardPoints() {
        return rewardPoints;
    }
}

