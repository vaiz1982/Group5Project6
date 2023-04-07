package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HasanPOMPage extends MyMethods {
    public HasanPOMPage() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(id = "input-email")
    private WebElement loginEmailField;

    @FindBy(id = "input-password")
    private WebElement loginPasswordField;

    @FindBy(css = "input[type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccount;

    @FindBy(xpath = "//a[text()='Login']")
    private WebElement logInPage;

    @FindBy(xpath = "(//a[text()='Forgotten Password'])[1]")
    private WebElement forgottenPasswordPage;

    @FindBy(xpath = "//div[@id='content']/../..//p[text()='Enter the e-mail address associated with your account. Click submit to have a password reset link e-mailed to you.']")
    private WebElement enterEmailMessage;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement continueUnderNewCustomer;

    @FindBy(xpath = "//a[text()='Tablets']")
    private WebElement tabletsPage;

    @FindBy(xpath = "//a[text()='Cameras']")
    private WebElement camerasPage;

    @FindBy(xpath = "//a[text()='Phones & PDAs']")

    private WebElement phonesPage;

    @FindBy(xpath = "//a[text()='Software']")

    private WebElement softwarePage;

    @FindBy(xpath = "(//a[text()='Register'])[2]")
    private WebElement registerOnLoginPage;

    @FindBy(xpath = "(//a[text()='Forgotten Password'])[2]")
    private WebElement forgottenPasswordOnLoginPage;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logoutButton;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    private WebElement searchButton;

    @FindBy(id = "input-search")
    private WebElement searchCriteriaBox;

    @FindBy(id = "description")
    private WebElement searchDescriptionsCheckBox;

    @FindBy(id = "button-search")
    private WebElement searchButtonOnCriteriaPage;

    @FindBy(xpath = "//a[text()='iMac']")
    private WebElement searchResult;

    @FindBy(xpath = "//input[@name='search']")
    private WebElement searchBox;

    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    private WebElement searchButtonMainPage;

    @FindBy(xpath = "//h1[text()='Search - mac']")
    private WebElement searchMacHeader;

    @FindBy(xpath = "//a[text()='Desktops']")
    private WebElement desktops;
    @FindBy(xpath = "//a[text()='Show All Desktops']")
    private WebElement showAllDesktops;
    @FindBy(xpath = "//a[text()='Product Compare (0)']")
    private WebElement productCompareLink;

    @FindBy(xpath = "//div[@id='content']//p")
    private WebElement productCompareMessage;

    @FindBy(xpath = "//button[@data-original-title='Compare this Product']")
    private WebElement compareThisProductButton;

    @FindBy(xpath = "//a[text()='product comparison']")
    private WebElement productComparisonLink;

    @FindBy(xpath = "//div[@id='content']/h1")
    private WebElement productComparisonHeading;

    @FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
    private WebElement appleCinema30;

    @FindBy(xpath = "//a[text()='Reviews (0)']")
    private WebElement reviewsTab;

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    private WebElement yourNameOnReview;

    @FindBy(xpath = "//textarea[@id='input-review']")
    private WebElement yourReview;

    @FindBy(xpath = "//input[@value='4']")
    private WebElement radioButton4;

    @FindBy(xpath = "//button[text()='Continue']")
    private WebElement reviewContinueButton;

    @FindBy(xpath = "//div[text()=' Thank you for your review. It has been submitted to the webmaster for approval.']")
    private WebElement successfulReviewAlert;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    private WebElement addToCartForRelatedProductAppleCinema;

    @FindBy(xpath = "(//a[text()='iMac'])[2]")
    private WebElement addCartSuccessMessage;

    @FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[4]")
    private WebElement wishList;

    @FindBy(xpath = "//div[@id='content']//p")
    private WebElement wishListEmptyMessage;

    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    private WebElement blackCartButton;

    @FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[3]")
    private WebElement viewCartFromBlackCartButton;

    @FindBy(xpath = "//a[text()='shopping cart']")
    private WebElement shoppingCartLink;

    @FindBy(xpath = "//a[text()='Use Coupon Code ']")
    private WebElement useCouponCode;

    @FindBy(xpath = "//input[@value='Apply Coupon']")
    private WebElement applyCouponButton;

    @FindBy(xpath = "//div[text()=' Warning: Please enter a coupon code!']")
    private WebElement enterCouponCodeWarningMessage;

    @FindBy(xpath = "//button[text()='Add to Cart']")
    private WebElement addToCartButtonOnProductDisplayPage;

    @FindBy(xpath = "//a[text()='Use Gift Certificate ']")
    private WebElement useGiftCertificate;

    @FindBy(xpath = "//input[@id='input-voucher']")
    private WebElement placeHolderNameInTextField;

    public WebElement getMyAccount() {
        return myAccount;
    }

    public WebElement getLogInPage() {
        return logInPage;
    }

    public WebElement getForgottenPasswordPage() {
        return forgottenPasswordPage;
    }

    public WebElement getEnterEmailMessage() {
        return enterEmailMessage;
    }

    public WebElement getContinueUnderNewCustomer() {
        return continueUnderNewCustomer;
    }

    public WebElement getTabletsPage() {
        return tabletsPage;
    }

    public WebElement getCamerasPage() {
        return camerasPage;
    }

    public WebElement getPhonesPage() {
        return phonesPage;
    }

    public WebElement getSoftwarePage() {
        return softwarePage;
    }

    public WebElement getRegisterOnLoginPage() {
        return registerOnLoginPage;
    }

    public WebElement getForgottenPasswordOnLoginPage() {
        return forgottenPasswordOnLoginPage;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getSearchCriteriaBox() {
        return searchCriteriaBox;
    }

    public WebElement getSearchDescriptionsCheckBox() {
        return searchDescriptionsCheckBox;
    }

    public WebElement getSearchButtonOnCriteriaPage() {
        return searchButtonOnCriteriaPage;
    }

    public WebElement getSearchResult() {
        return searchResult;
    }

    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getSearchButtonMainPage() {
        return searchButtonMainPage;
    }

    public WebElement getSearchMacHeader() {
        return searchMacHeader;
    }

    public WebElement getDesktops() {
        return desktops;
    }

    public WebElement getShowAllDesktops() {
        return showAllDesktops;
    }

    public WebElement getProductCompareLink() {
        return productCompareLink;
    }

    public WebElement getProductCompareMessage() {
        return productCompareMessage;
    }

    public WebElement getCompareThisProductButton() {
        return compareThisProductButton;
    }

    public WebElement getProductComparisonLink() {
        return productComparisonLink;
    }

    public WebElement getProductComparisonHeading() {
        return productComparisonHeading;
    }

    public WebElement getAppleCinema30() {
        return appleCinema30;
    }

    public WebElement getReviewsTab() {
        return reviewsTab;
    }

    public WebElement getYourNameOnReview() {
        return yourNameOnReview;
    }

    public WebElement getYourReview() {
        return yourReview;
    }

    public WebElement getRadioButton4() {
        return radioButton4;
    }

    public WebElement getReviewContinueButton() {
        return reviewContinueButton;
    }

    public WebElement getSuccessfulReviewAlert() {
        return successfulReviewAlert;
    }

    public WebElement getAddCartSuccessMessage() {
        return addCartSuccessMessage;
    }

    public WebElement getWishList() {
        return wishList;
    }

    public WebElement getWishListEmptyMessage() {
        return wishListEmptyMessage;
    }

    public WebElement getBlackCartButton() {
        return blackCartButton;
    }

    public WebElement getViewCartFromBlackCartButton() {
        return viewCartFromBlackCartButton;
    }

    public WebElement getShoppingCartLink() {
        return shoppingCartLink;
    }

    public WebElement getUseCouponCode() {
        return useCouponCode;
    }

    public WebElement getApplyCouponButton() {
        return applyCouponButton;
    }

    public WebElement getEnterCouponCodeWarningMessage() {
        return enterCouponCodeWarningMessage;
    }

    public WebElement getAddToCartForRelatedProductAppleCinema() {
        return addToCartForRelatedProductAppleCinema;
    }

    public WebElement getAddToCartButtonOnProductDisplayPage() {
        return addToCartButtonOnProductDisplayPage;
    }

    public WebElement getUseGiftCertificate() {
        return useGiftCertificate;
    }

    public WebElement getPlaceHolderNameInTextField() {
        return placeHolderNameInTextField;
    }

    public WebElement getLoginEmailField() {
        return loginEmailField;
    }

    public WebElement getLoginPasswordField() {
        return loginPasswordField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
}
