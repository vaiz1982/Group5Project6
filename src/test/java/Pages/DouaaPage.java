package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
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
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'My Account')]")
    WebElement myAccountUnderMyAccount;
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
    List<WebElement> searchProductItemsInGrid;
    @FindBy(xpath = "//div[@class='product-layout product-list col-xs-12']")
    List<WebElement> searchProductItemsInList;
    @FindBy(id = "list-view")
    WebElement listViewButton;
    @FindBy(id = "grid-view")
    WebElement gridViewButton;
    @FindBy(xpath = "//div[@class='caption']//a[contains(text(),'iMac')]")
    WebElement iMacProductNameLink;
    @FindBy(xpath = "//div[@class='image']//img[@title='iMac']")
    WebElement iMacProductImageLink;
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    WebElement addToCartButton;
    @FindBy(xpath = "(//button[@type='button'])[11]")
    WebElement addToWishListButton;
    @FindBy(xpath = "(//button[@type='button'])[15]")
    WebElement addToCompareButton;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement addToCompareSuccessText;
    @FindBy(xpath = "//a[normalize-space()='product comparison']")
    WebElement productComparisonLink;
    @FindBy(xpath = "//strong[normalize-space()='Product Details']")
    WebElement productDetailsLabelInProductComparisonPage;
    @FindBy(xpath = "//input[@value='Add to Cart']")
    List<WebElement> addToCartButtonInProductComparisonPage;
    @FindBy(xpath = "//a[contains(text(),'Remove')]")
    List<WebElement> removeButtonInProductComparisonPage;
    @FindBy(xpath = "//h1[normalize-space()='iMac']")
    WebElement productName;
    @FindBy(xpath = "//li[normalize-space()='Brands']")
    WebElement productBrand;
    @FindBy(xpath = "//li[normalize-space()='Product Code: Product 14']")
    WebElement productCode;
    @FindBy(xpath = "//a[normalize-space()='0 reviews']")
    WebElement reviewInfo;
    @FindBy(xpath = "//span[normalize-space()='Shopping Cart']")
    WebElement shoppingCartButton;
    @FindBy(xpath = "(//img[@title='iMac'])[2]")
    WebElement productImageFromShoppingCart;
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartFromSuccessMessage;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement shoppingCartSuccessMessage;
    @FindBy(xpath = "//a[normalize-space()='Account']")
    WebElement accountBreadCrumb;
    @FindBy(xpath = "(//input[@name='quantity[126029]'])[1]")
    WebElement productQuantity;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement updateProductQuantity;
    @FindBy(xpath = "//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]")
    WebElement shoppingCartEmpty;
    @FindBy(xpath = "//a[normalize-space()='Estimate Shipping & Taxes']")
    WebElement estimateShippingAndTaxes;
    @FindBy(xpath = "//select[@id='input-country']")
    WebElement selectCountry;
    @FindBy(xpath = "//select[@id='input-zone']")
    WebElement selectState;
    @FindBy(xpath = "//input[@id='input-postcode']")
    WebElement postcode;
    @FindBy(xpath = "//button[@id='button-quote']")
    WebElement getQuoteButton;
    @FindBy(xpath = "//div[@id='modal-shipping']")
    WebElement shippingModal;
    @FindBy(xpath = "//h4[contains(text(),'Please select the preferred shipping method to use')]")
    WebElement shippingMethodText;
    @FindBy(xpath = "//label[normalize-space()='Flat Shipping Rate - $8.00']")
    WebElement flatRateText;
    @FindBy(xpath = "//input[@name='shipping_method']")
    WebElement flatRateRadioButton;
    @FindBy(xpath = "//input[@id='button-shipping']")
    WebElement applyShippingButton;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement shippingEstimateText;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement checkoutButton;
    @FindBy(xpath = "//h1[normalize-space()='Checkout']")
    WebElement checkoutPage;
    @FindBy(xpath = "//input[@id='button-payment-address']")
    WebElement continuePaymentAddressButton;
    @FindBy(xpath = "//input[@id='button-shipping-address']")
    WebElement continueShippingAddressButton;
    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement commentTextArea;
    @FindBy(xpath = "//input[@id='button-shipping-method']")
    WebElement continueShippingMethodButton;
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continuePaymentMethodButton;
    @FindBy(xpath = "//textarea[normalize-space()='test']")
    WebElement validatingTestText;
    @FindBy(xpath = "//input[@name='agree']")
    WebElement checkbox;
    @FindBy(xpath = "//input[@id='button-confirm']")
    WebElement confirmOrderButton;
    @FindBy(xpath = "//h1[normalize-space()='Your order has been placed!']")
    WebElement orderSuccessfulText;
    @FindBy(xpath = "//div[@id='product-product']//div[@class='btn-group']//button[1]")
    WebElement wishlistButton;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement wishlistSuccessMessage;
    @FindBy(xpath = "//a[normalize-space()='wish list']")
    WebElement wishlistLink;
    @FindBy(xpath = "//a[normalize-space()='iMac']")
    WebElement iMacProductInWishList;
    @FindBy(xpath = "//a[normalize-space()='Samsung SyncMaster 941BW']")
    WebElement samsungSyncMasterProductInWishList;
    @FindBy(xpath = "//img[@title='Samsung SyncMaster 941BW']")
    WebElement samsungSyncMasterProductImageLink;


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

    public void verifyMoreThanOneProductIsAvailableInGrid() {
        Assert.assertTrue(searchProductItemsInGrid.size() > 1);
    }

    public void verifyMoreThanOneProductIsAvailableInList() {
        Assert.assertTrue(searchProductItemsInList.size() > 1);
    }

    public void clickingOnListView() {
        clickMethod(listViewButton);
    }

    public void clickingOnGridView() {
        clickMethod(gridViewButton);
    }

    public void clickingOnProductNameAndVerifyItNavigatesToTheProductPage() {
        clickMethod(iMacProductNameLink);
        navigateToPreviousPage();
        Assert.assertTrue(BasicDriver.getDriver().getCurrentUrl().contains("Mac"));
    }

    public void clickingOnProductName() {
        clickMethod(iMacProductNameLink);
    }
    public void clickingOnSecondProductName() {
        clickMethod(samsungSyncMasterProductImageLink);
    }


    public void clickingOnProductImageAndVerifyItNavigatesToTheProductPage() {
        clickMethod(iMacProductImageLink);
        navigateToPreviousPage();
        Assert.assertTrue(BasicDriver.getDriver().getCurrentUrl().contains("Mac"));
    }

    public void verifyAddToCartWishlistAndCompareButton() {
        addToCartButton.isDisplayed();
        addToWishListButton.isDisplayed();
        addToCompareButton.isDisplayed();
    }

    public void navigateToPreviousPage() {
        BasicDriver.getDriver().navigate().back();
    }

    public void mouseHover(WebElement element) {
        Actions actions = new Actions(BasicDriver.getDriver());
        actions.moveToElement(element).perform();
    }

    public void verifyTooltip(WebElement element, String expectedTooltip) {
        mouseHover(element);
        String actualTooltip = element.getAttribute("data-original-title");
        Assert.assertTrue(actualTooltip.contains(expectedTooltip));
    }

    public void clickingOnCompareProduct() {
        clickMethod(BasicDriver.getDriver().findElement(By.xpath("//button[3]")));
    }

    public void VerifyAddToCompareSuccessText() {
        addToCompareSuccessText.isDisplayed();
    }

    public void clickingOnProductComparisonLink() {
        clickMethod(productComparisonLink);
    }

    public void verifyProductDetailsInProductComparisonPage() {
        productDetailsLabelInProductComparisonPage.isDisplayed();
    }

    public void verifySingleProductInProductComparisonPage() {
        Assert.assertTrue(addToCartButtonInProductComparisonPage.size() < 2);
    }

    public void verifyAddToCartAndRemoveButtonIsAvailable() {
        BasicDriver.getDriver().findElement(By.xpath("//input[@value='Add to Cart']")).isDisplayed();
        BasicDriver.getDriver().findElement(By.xpath("//a[normalize-space()='Remove']")).isDisplayed();
    }

    public void verifyProductNameBrandAndCode() {
        productName.isDisplayed();
        productBrand.isDisplayed();
        productCode.isDisplayed();
    }

    public void verifyReviewAvailability() {
        reviewInfo.isDisplayed();
    }

    public void clickingOnAddToCartButtonInProductDisplayPage() {
        BasicDriver.getDriver().findElement(By.xpath("//button[@id='button-cart']")).click();
    }

    public void clickingOnShoppingCart() {
        clickMethod(shoppingCartButton);
    }

    public void clickingOnProductImageFromShoppingCart() {
        clickMethod(productImageFromShoppingCart);
    }

    public void verifyShoppingCartSuccessMessage() {
        shoppingCartSuccessMessage.isDisplayed();
    }

    public void ClickingOnShoppingCartFromSuccessMessage() {
        clickMethod(shoppingCartFromSuccessMessage);
    }

    public void productDisplayedInShoppingCart() {
        BasicDriver.getDriver().findElement(By.xpath("(//a[contains(text(),'iMac')])[2]")).isDisplayed();
    }

    public void verifyAccountBreadCrumb() {
        accountBreadCrumb.isDisplayed();
    }

    public void clickingOnMyAccountUnderMyAccount() {
        clickMethod(myAccountUnderMyAccount);
    }

    public void inputtingProductQuantity() {
        productQuantity.clear();
        sendKeysMethod(productQuantity, "0");
    }

    public void clickingOnProductUpdate() {
        clickMethod(updateProductQuantity);
    }

    public void verifyShoppingCartMessage() {
        shoppingCartEmpty.isDisplayed();
    }

    public void clickingOnEstimateShippingAndTaxes() {
        clickMethod(estimateShippingAndTaxes);
    }

    public void selectingCountry(String country) {
        Select selectingCountry = new Select(selectCountry);
        clickMethod(selectCountry);
        selectingCountry.selectByVisibleText(country);
    }

    public void selectingState(String state) {
        Select selectingState = new Select(selectState);
        clickMethod(selectState);
        selectingState.selectByVisibleText(state);
    }

    public void enteringPostCode(String postCode) {
        sendKeysMethod(postcode, postCode);
    }

    public void clickingOnGetQuote() {
        clickMethod(getQuoteButton);
    }

    public void verifyShippingMethodTextIsDisplayed() {
        shippingMethodText.isDisplayed();
    }

    public void verifyFlatRateTextIsDisplayed() {
        flatRateText.isDisplayed();
        Assert.assertFalse(flatRateRadioButton.isSelected());
    }

    public void clickingOnFlatRateRadioButton() {
        clickMethod(flatRateRadioButton);
        clickMethod(applyShippingButton);
    }

    public void verifyShippingEstimateText() {
        shippingEstimateText.isDisplayed();
    }

    public void verifyFlatRateIsDisplayedAndAdded() {
        BasicDriver.getDriver().findElement(By.xpath("(//td[contains(text(),'$5.00')])[2]")).isDisplayed();
        BasicDriver.getDriver().findElement(By.xpath("(//td[contains(text(),'$105.00')])[2]")).isDisplayed();
    }

    public void clickingOnCheckoutButton() {
        clickMethod(checkoutButton);
    }

    public void verifyUserInTheCheckoutPage() {
        checkoutPage.isDisplayed();
    }

    public void clickingOnContinuePaymentAddressButton() {
        clickMethod(continuePaymentAddressButton);
    }

    public void clickingOnContinueShippingAddressButton() {
        clickMethod(continueShippingAddressButton);
    }

    public void enteringCommentInTextArea() {
        sendKeysMethod(commentTextArea, "test");
    }

    public void clickingOnContinueShippingMethodButton() {
        clickMethod(continueShippingMethodButton);
    }

    public void clickingOnContinuePaymentMethodButton() {
        clickMethod(continuePaymentMethodButton);
    }

    public void verifyUserComment() {
        validatingTestText.isDisplayed();
    }

    public void clickingOnCheckbox() {
        clickMethod(checkbox);
    }

    public void clickingOnConfirmOrderButton() {
        clickMethod(confirmOrderButton);
    }

    public void verifyOrderSuccessfulText() {
        orderSuccessfulText.isDisplayed();
    }

    public void clickingOnWishlistButton() {
        clickMethod(wishlistButton);
    }

    public void clickingOnWishlistLink() {
        clickMethod(wishlistLink);
    }

    public void verifyIMacProductInWishList() {
        iMacProductInWishList.isDisplayed();
    }

    public void verifySamsungSyncMasterProductInWishList() {
        samsungSyncMasterProductInWishList.isDisplayed();
    }

    public void verifyWishlistSuccessMessage() {
        wishlistSuccessMessage.isDisplayed();
    }

    public void clearSearchField() {
        searchField.clear();
    }
}
