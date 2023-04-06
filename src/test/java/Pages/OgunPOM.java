package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OgunPOM extends MyMethods {

    public OgunPOM() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = "(//a[text()='Logout'])[2]")
    private WebElement rightColumnLogout;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement rightColumnLogoutContinueButton;

    @FindBy(xpath = "//a[text()='Your Store']")
    private WebElement yourStoreHeaderHomePage;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private WebElement wrongInputWarning;

    @FindBy(xpath = "(//a[text()='Forgotten Password'])[1]")
    private WebElement forgottenButtonUnderPassword;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement forgottenContinueButton;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private WebElement forgottenPasswordWarning;

    @FindBy(xpath = "//input[@class='form-control input-lg']")
    private WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"content\"]/p[2]")
    private WebElement cartEmptyAlert;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
    private WebElement desktopsHeader;

    @FindBy(xpath = "//a[text()='Show All Desktops']")
    private WebElement showAllDesktopsButton;

    @FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[1]")
    private WebElement compareThisProductButton;

    @FindBy(xpath = "//a[text()='Product Compare (1)']")
    private WebElement productCompareLinkAssert1;

    @FindBy(css = ".alert.alert-success.alert-dismissible")
    private WebElement successMessageAssert2;

    @FindBy(xpath = "//a[text()='product comparison']")
    private WebElement productComparisonLinkInTheSuccessMessage;

    @FindBy(xpath = "//h1[text()='Product Comparison']")
    private WebElement productComparisonHeader;

    @FindBy(xpath = "//input[@value='Add to Cart']")
    private WebElement addToCartButtonInTheProductComparisonPage;

    @FindBy(xpath = "//a[text()='Remove']")
    private WebElement removeButtonInTheProductComparisonPage;

    @FindBy(xpath = "//img[@class='img-responsive']")
    private WebElement iMacPictureLink;

    @FindBy(xpath = "//h2[text()='$122.00']")
    private WebElement iMacPriceWithTax;

    @FindBy(xpath = "//li[text()='Ex Tax: $100.00']")
    private WebElement iMacPriceWithoutTax;

    @FindBy(xpath = "//a[text()='0 reviews']")
    private WebElement xReviews;

    @FindBy(xpath = "//button[text()='Add to Cart']")
    private WebElement addToCartButtonForIMac;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement successMessageForImac;

    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    private WebElement blackAddToCartButton;

    @FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[3]")
    private WebElement viewCartButton;

    @FindBy(xpath = "(//a[text()='iMac'])[2]")
    private WebElement iMacInTheShoppingCart;

    @FindBy(xpath = "(//button[@data-original-title='Add to Wish List'])[1]")
    private WebElement addToWishListButton;

    @FindBy(xpath = "//a[text()='wish list']")
    private WebElement wishListInTheSuccessMessage;

    @FindBy(xpath = "//a[text()='My Wish List']")
    private WebElement myWishListHeader;




    public WebElement getMyAccountButton() {return myAccountButton;
    }
    public WebElement getRightColumnLogout() {return rightColumnLogout;
    }

    public WebElement getRightColumnLogoutContinueButton() {return rightColumnLogoutContinueButton;
    }
    public WebElement getYourStoreHeaderHomePage() {return yourStoreHeaderHomePage;
    }

    public WebElement getEmailInput() {return emailInput;
    }

    public WebElement getPasswordInput() {return passwordInput;
    }

    public WebElement getLoginButton() {return loginButton;
    }

    public WebElement getWrongInputWarning() {return wrongInputWarning;
    }

    public WebElement getForgottenButtonUnderPassword() {return forgottenButtonUnderPassword;
    }

    public WebElement getForgottenContinueButton() {return forgottenContinueButton;
    }

    public WebElement getForgottenPasswordWarning() {return forgottenPasswordWarning;
    }

    public WebElement getSearchBox() {return searchBox;
    }

    public WebElement getCartEmptyAlert() {return cartEmptyAlert;
    }

    public WebElement getDesktopsHeader() {return desktopsHeader;
    }

    public WebElement getShowAllDesktopsButton() {return showAllDesktopsButton;
    }

    public WebElement getCompareThisProductButton() {return compareThisProductButton;
    }

    public WebElement getProductCompareLinkAssert1() {return productCompareLinkAssert1;
    }

    public WebElement getSuccessMessageAssert2() {return successMessageAssert2;
    }

    public WebElement getProductComparisonLinkInTheSuccessMessage() {return productComparisonLinkInTheSuccessMessage;
    }

    public WebElement getProductComparisonHeader() {return productComparisonHeader;
    }

    public WebElement getAddToCartButtonInTheProductComparisonPage() {return addToCartButtonInTheProductComparisonPage;
    }

    public WebElement getRemoveButtonInTheProductComparisonPage() {return removeButtonInTheProductComparisonPage;
    }

    public WebElement getiMacPictureLink() {return iMacPictureLink;
    }

    public WebElement getiMacPriceWithTax() {return iMacPriceWithTax;
    }

    public WebElement getiMacPriceWithoutTax() {return iMacPriceWithoutTax;
    }

    public WebElement getxReviews() {return xReviews;
    }

    public WebElement getAddToCartButtonForIMac() {return addToCartButtonForIMac;
    }

    public WebElement getSuccessMessageForImac() {return successMessageForImac;
    }

    public WebElement getBlackAddToCartButton() {return blackAddToCartButton;
    }

    public WebElement getViewCartButton() {return viewCartButton;
    }

    public WebElement getiMacInTheShoppingCart() {return iMacInTheShoppingCart;
    }

    public WebElement getAddToWishListButton() {return addToWishListButton;
    }

    public WebElement getWishListInTheSuccessMessage() {return wishListInTheSuccessMessage;
    }

    public WebElement getMyWishListHeader() {return myWishListHeader;
    }
}


