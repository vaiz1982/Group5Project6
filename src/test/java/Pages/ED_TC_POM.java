package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class ED_TC_POM extends MyMethods {
    public ED_TC_POM() {
    PageFactory.initElements(BasicDriver.getDriver(), this);
}
@FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccount;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
    private WebElement loginOptions;

    @FindBy(id = "input-email")
    private WebElement emailF;

    @FindBy(id = "input-password")
    private WebElement passwordF;

    @FindBy(css = "input[type='submit']")
    private WebElement loginButt;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/p/strong")
    private WebElement checkingMessage;




    @FindBy(xpath = "//*[@id=\"column-right\"]")
    private WebElement checkList;



    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
    private WebElement logoutF;

    @FindBy(xpath = "//input[@name='search']")
    private WebElement searchText;

    @FindBy(xpath = "//*[@id=\"search\"]/span/button")
    private WebElement searchIcon;

    @FindBy(xpath = "//*[@id=\"list-view\"]")
    private WebElement listOption;

    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div/div/div[1]/a/img")
    private WebElement iMacFoto;

    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a")
    private WebElement iMacProdName;


    @FindBy(xpath = "//*[@id=\"grid-view\"]")
    private WebElement gridOption;


    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[1]/a")
    private WebElement singleElement;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/h1")
    private WebElement iMacHeader;

    @FindBy(id = "button-cart")
    private WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"input-quantity\"]")
    private WebElement amountSelect;

    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[3]")
    private WebElement compareButton;

    @FindBy(id = "button-search")
    private WebElement searchButton;

@FindBy(xpath = "//*[@id=\"product-search\"]/div[1]/a[2]")
private WebElement compareLink;

@FindBy(xpath = "//*[@id=\"content\"]/table/tbody[2]/tr/td[2]/input")
private WebElement addToCartComparisonButton;

@FindBy(xpath = "//*[@id=\"product-search\"]/div[1]")
private WebElement successCompareMessage;

@FindBy(xpath = "//*[@id=\"content\"]")
private WebElement productComparisonPlat;

    @FindBy(xpath = "/html/body/footer/div/div/div[2]/ul/li[3]/a")
    private WebElement siteMap;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/ul/li[2]/a")
    private WebElement myAccountLinc;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div")
    private WebElement newCustomerRegister;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[5]/a/span")
    private WebElement checkoutHeaderOption;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    private WebElement shoppingCartText;

@FindBy(xpath = "//*[@id=\"content\"]/p")
private WebElement emptyCartMessage;

@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]/span")
private WebElement addToCartAndeProduct;

@FindBy(xpath = "//*[@id=\"product-search\"]/div[1]/a[1]")
private WebElement iMacLink;

@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]")
private WebElement productInfoInProductPage;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/div[3]/p/a[2]")
    private WebElement writeAReview;

@FindBy(id = "form-review")
private WebElement formReview;

@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[4]/a/span")
private WebElement shoppingCartHeader;

@FindBy(xpath = "/html/body/div[2]/div/button[1]")
private WebElement left;

@FindBy(xpath = "/html/body/div[2]/div/button[2]")
private WebElement right;

@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/button")
private WebElement xClose;

@FindBy(xpath = "//*[@id='content']/div[1]/div[1]/ul[1]/li[2]/a/img")
private WebElement lightBox1;

@FindBy(xpath = "//*[@id='content']/div[1]/div[1]/ul[1]/li[1]/a")
private WebElement normalSizeProductPhoto;

@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[3]/a/img")
private WebElement lightBox2;

@FindBy(xpath = "//*[@id='content']/div[3]/div/div/div[1]/a/img")
private WebElement prodInYStore;

    @FindBy(linkText = "Desktops")
    private WebElement desktopsMenuOption;

    @FindBy(linkText = "Show All Desktops")
    private WebElement showAllDesktops;

@FindBy(linkText = "- Mac (1)")
private WebElement macSubcategory;

@FindBy(xpath = "//button[@data-original-title=\"Add to Wish List\"]")
private WebElement wishListAnderProduct;

@FindBy(linkText = "wish list")
private WebElement wishListLink;

@FindBy(linkText = "shopping cart")
private WebElement shoppCartLink;

@FindBy(xpath = "//button[@data-original-title='Update']")
private WebElement updateButton;

@FindBy(xpath = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input")
private WebElement quantity;

@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
private WebElement successMessage1;

@FindBy(xpath = "//span[text()='Shopping Cart']")
private WebElement shoppingCartHeaderLane;

@FindBy(xpath = "//div[h1='Shopping Cart']")
private WebElement sCFunctional;

@FindBy(xpath = "//a[text()='Continue']")
private WebElement cotinueInShpoFunc;

@FindBy(id = "content")
private WebElement functionalCheckList;

@FindBy(xpath = "//span[text()=\"Wish List (2)\"]")
private WebElement wishListHeader;

@FindBy(xpath = "//*[@id=\"content\"]/div[1]/table/tbody/tr[2]/td[6]/a")
private WebElement removeX;

@FindBy(xpath = "//a[text()='Checkout']")
private WebElement checkoutInShopCartPage;

@FindBy(xpath = "//input[@value='Continue']")
private WebElement continueButton;

@FindBy(xpath = "//input[@id='button-register']")
private WebElement continueRegisterButton;

@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
private WebElement warningMessage;

@FindBy(xpath = "//input[@name='shipping_address']")
private WebElement checkBoxShipping;

@FindBy(xpath = "//*[@id=\"accordion\"]/div[2]/div[1]/h4/a")
//xpath = "//*[@id='accordion']/div[2]/div[1]"
private WebElement estimateShippingTaxes;

@FindBy(id = "input-country")
private WebElement country;

@FindBy(id = "input-zone")
private WebElement states;

@FindBy(id = "button-quote")
private WebElement getQuotes;

@FindBy(xpath = "//input[@name='shipping_method']")
private WebElement flatSihippingRateRadioButton;

@FindBy(id = "button-shipping")
private WebElement applyShippingButton;

@FindBy(xpath = "//div[@class='modal-content']")
private WebElement dialogWindow;

@FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
private WebElement shoppEstSuccess;

@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/table/tbody/tr[2]/td[1]/strong")
private WebElement flatRateText;

@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/table/tbody/tr[2]/td[2]")
private WebElement fifeDollars;

    public WebElement getFlatRateText() {
        return flatRateText;
    }

    public WebElement getFifeDollars() {
        return fifeDollars;
    }

    public WebElement getEstimateShippingTaxes() {
        return estimateShippingTaxes;
    }

    public WebElement getCountry() {
        return country;
    }

    public WebElement getStates() {
        return states;
    }

    public WebElement getGetQuotes() {
        return getQuotes;
    }

    public WebElement getFlatSihippingRateRadioButton() {
        return flatSihippingRateRadioButton;
    }

    public WebElement getApplyShippingButton() {
        return applyShippingButton;
    }

    public WebElement getDialogWindow() {
        return dialogWindow;
    }

    public WebElement getShoppEstSuccess() {
        return shoppEstSuccess;
    }

    public WebElement getContinueRegisterButton() {
        return continueRegisterButton;
    }

    public WebElement getCheckBoxShipping() {
        return checkBoxShipping;
    }

    public WebElement getWarningMessage() {
        return warningMessage;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getCheckoutInShopCartPage() {
        return checkoutInShopCartPage;
    }

    public WebElement getRemoveX() {
        return removeX;
    }

    public WebElement getWishListHeader() {
        return wishListHeader;
    }

    public WebElement getFunctionalCheckList() {
        return functionalCheckList;
    }

    public WebElement getsCFunctional() {
        return sCFunctional;
    }

    public WebElement getCotinueInShpoFunc() {
        return cotinueInShpoFunc;
    }

    public WebElement getShoppingCartHeaderLane() {
        return shoppingCartHeaderLane;
    }

    public WebElement getSuccessMessage1() {
        return successMessage1;
    }

    public WebElement getUpdateButton() {
        return updateButton;
    }

    public WebElement getQuantity() {
        return quantity;
    }

    /**
     *  @FindBy()
    private WebElement
     */


    public WebElement getShoppCartLink() {
        return shoppCartLink;
    }



    public WebElement getWishListLink() {
        return wishListLink;
    }


    public WebElement getWishListAnderProduct() {
        return wishListAnderProduct;
    }


    public WebElement getMacSubcategory() {
        return macSubcategory;
    }

    public WebElement getShowAllDesktops() {
        return showAllDesktops;
    }

    public WebElement getDesktopsMenuOption() {
        return desktopsMenuOption;
    }


    public WebElement getProdInYStore() {
        return prodInYStore;
    }


    public WebElement getShoppingCartHeader() {
        return shoppingCartHeader;
    }

    public WebElement getLeft() {
        return left;
    }

    public WebElement getRight() {
        return right;
    }

    public WebElement getxClose() {
        return xClose;
    }

    public WebElement getLightBox1() {
        return lightBox1;
    }

    public WebElement getNormalSizeProductPhoto() {
        return normalSizeProductPhoto;
    }

    public WebElement getLightBox2() {
        return lightBox2;
    }


    public WebElement getFormReview() {
        return formReview;
    }


    public WebElement getWriteAReview() {
        return writeAReview;
    }


    public WebElement getAddToCartAndeProduct() {
        return addToCartAndeProduct;
    }

    public WebElement getiMacLink() {
        return iMacLink;
    }

    public WebElement getProductInfoInProductPage() {
        return productInfoInProductPage;
    }


    public WebElement getEmptyCartMessage() {
        return emptyCartMessage;
    }


    public WebElement getCheckoutHeaderOption() {
        return checkoutHeaderOption;
    }

    public WebElement getShoppingCartText() {
        return shoppingCartText;
    }


    public WebElement getSiteMap() {
        return siteMap;
    }

    public WebElement getMyAccountLinc() {
        return myAccountLinc;
    }

    public WebElement getNewCustomerRegister() {
        return newCustomerRegister;
    }

    public WebElement getProductComparisonPlat() {
        return productComparisonPlat;
    }

    public WebElement getSuccessCompareMessage() {
        return successCompareMessage;
    }

    public WebElement getAddToCartComparisonButton() {
        return addToCartComparisonButton;
    }

    public WebElement getCompareLink() {
        return compareLink;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getCompareButton() {
        return compareButton;
    }


    public WebElement getSingleElement() {
        return singleElement;
    }

    public WebElement getiMacHeader() {
        return iMacHeader;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public WebElement getAmountSelect() {
        return amountSelect;
    }


    public WebElement getGridOption() {
        return gridOption;
    }


    public WebElement getListOption() {
        return listOption;
    }

    public WebElement getiMacFoto() {
        return iMacFoto;
    }

    public WebElement getiMacProdName() {
        return iMacProdName;
    }



    public WebElement getCheckingMessage() {
        return checkingMessage;
    }


    public WebElement getCheckList() {
        return checkList;
    }

    public WebElement getSearchText() {
        return searchText;
    }

    public WebElement getSearchIcon() {
        return searchIcon;
    }



    public WebElement getLogoutF() {
        return logoutF;
    }


    public WebElement getMyAccount() {
        return myAccount;
    }

    public WebElement getLoginOptions() {
        return loginOptions;
    }

    public WebElement getEmailF() {
        return emailF;
    }

    public WebElement getPasswordF() {
        return passwordF;
    }

    public WebElement getLoginButt() {
        return loginButt;
    }
}
