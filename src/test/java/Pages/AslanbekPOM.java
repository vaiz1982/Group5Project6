package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AslanbekPOM extends MyMethods {
    public AslanbekPOM() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(linkText = "Forgotten Password")
    private WebElement forgotPassword;

    @FindBy(id = "input-email")
    private WebElement forgotPasswordEmail;

    @FindBy(css = "input[type='submit']")
    private WebElement continueBtnForgotPassword;

    @FindBy(css = ".btn.btn-default.btn-lg")
    private WebElement searchButton;

    @FindBy(css = "#search>input")
    private WebElement searchField;

    @FindBy(id = "input-limit")
    private WebElement showAmountSearchPage;

    @FindBy(className = "image")
    private List<WebElement> itemsResultFromSearch;

    @FindBy(linkText = "Desktops")
    private WebElement desktopsMenuOption;

    @FindBy(linkText = "Show All Desktops")
    private WebElement showAllDesktops;

    @FindBy(id = "grid-view")
    private WebElement gridViewOption;

    @FindBy(css = ".fa.fa-exchange")
    private WebElement compareThisProduct;

    @FindBy(linkText = "product comparison")
    private WebElement productComparisonLink;

    @FindBy(xpath = "//div[text()='Compare this Product']")
    private WebElement compareThisProductToolTip;

    @FindBy(css = ".alert.alert-success.alert-dismissible")
    private WebElement successMessageProductComparison;

    @FindBy(className = "img-thumbnail")
    private List<WebElement> itemsResultFromComparison;

    @FindBy(linkText = "iMac")
    private WebElement productImacAfterSearch;

    @FindBy(id = "input-quantity")
    private WebElement productQuantity;

    @FindBy(id = "button-cart")
    private WebElement addToCartWithQuantity;

    @FindBy(partialLinkText = "Reviews")
    private WebElement reviewTabInProductDisplay;

    @FindBy(id = "button-review")
    private WebElement continueButtonOnProductDisplayReview;

    @FindBy(xpath = "//*[contains(text(),'Warning: Please select a review rating!')]")
    private WebElement warningMessageOnReviewOnProductDisplay;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    private WebElement addToCartButtonOnProductDisplayed;

    @FindBy(id = "cart")
    private WebElement cartBlackButton;

    @FindBy(xpath = "(//ul[@class=\"dropdown-menu pull-right\"]//a)[1]")
    private WebElement productImageUnderCartBlackToggleBox;

    public WebElement getForgotPassword() {
        return forgotPassword;
    }

    public WebElement getForgotPasswordEmail() {
        return forgotPasswordEmail;
    }

    public WebElement getContinueBtnForgotPassword() {
        return continueBtnForgotPassword;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getShowAmountSearchPage() {
        return showAmountSearchPage;
    }

    public List<WebElement> getItemsResultFromSearch() {
        return itemsResultFromSearch;
    }

    public WebElement getDesktopsMenuOption() {
        return desktopsMenuOption;
    }

    public WebElement getShowAllDesktops() {
        return showAllDesktops;
    }

    public WebElement getGridViewOption() {
        return gridViewOption;
    }

    public WebElement getCompareThisProduct() {
        return compareThisProduct;
    }

    public WebElement getProductComparisonLink() {
        return productComparisonLink;
    }

    public WebElement getCompareThisProductToolTip() {
        return compareThisProductToolTip;
    }

    public WebElement getSuccessMessageProductComparison() {
        return successMessageProductComparison;
    }

    public List<WebElement> getItemsResultFromComparison() {
        return itemsResultFromComparison;
    }

    public WebElement getProductImacAfterSearch() {
        return productImacAfterSearch;
    }

    public WebElement getProductQuantity() {
        return productQuantity;
    }

    public WebElement getAddToCartWithQuantity() {
        return addToCartWithQuantity;
    }

    public WebElement getReviewTabInProductDisplay() {
        return reviewTabInProductDisplay;
    }

    public WebElement getContinueButtonOnProductDisplayReview() {
        return continueButtonOnProductDisplayReview;
    }

    public WebElement getWarningMessageOnReviewOnProductDisplay() {
        return warningMessageOnReviewOnProductDisplay;
    }

    public WebElement getAddToCartButtonOnProductDisplayed() {
        return addToCartButtonOnProductDisplayed;
    }

    public WebElement getCartBlackButton() {
        return cartBlackButton;
    }

    public WebElement getProductImageUnderCartBlackToggleBox() {
        return productImageUnderCartBlackToggleBox;
    }
}
