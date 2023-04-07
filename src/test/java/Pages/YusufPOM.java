package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YusufPOM extends MyMethods {


    public YusufPOM() {
        PageFactory.initElements(BasicDriver.getDriver(), this);}

    @FindBy(css = "input[type='submit']")
    private WebElement loginButton;
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private WebElement warningMessage;
    @FindBy(xpath = "//aside[@id='column-right']//a[text()='Forgotten Password']")
    private WebElement forgottenPassword;
    @FindBy(css = "button[class='btn btn-default btn-lg']")
    private WebElement clickButton;
    @FindBy(id = "input-search")
    private WebElement inputSearch;
    @FindBy(id = "button-search")
    private WebElement buttonSearch;
    @FindBy(linkText = "iMac")
    private WebElement searchedProduct;
    @FindBy(linkText = "Desktops")
    private WebElement hoverOverDesktops;
    @FindBy(linkText = "Show All Desktops")
    private WebElement clickShowAllDesktops;
    @FindBy(linkText = "Product Compare (0)")
    private WebElement clickProductCompareLink;




    public WebElement getWarningMessage() {
        return warningMessage;
    }

    public WebElement getForgottenPassword() {
        return forgottenPassword;
    }

    public WebElement getClickButton() {
        return clickButton;
    }

    public WebElement getInputSearch() {
        return inputSearch;
    }

    public WebElement getButtonSearch() {
        return buttonSearch;
    }

    public WebElement getSearchedProduct() {
        return searchedProduct;
    }

    public WebElement getHoverOverDesktops() {
        return hoverOverDesktops;
    }

    public WebElement getClickShowAllDesktops() {
        return clickShowAllDesktops;
    }

    public WebElement getClickProductCompareLink() {
        return clickProductCompareLink;
    }

    public WebElement getLoginButton() {
        return loginButton;

    }
}
