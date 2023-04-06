package StepDefinitons;

import Pages.ED_TC_POM;
import Utilities.BasicDriver;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.time.Duration;

public class ED_TC_Steps {


    ED_TC_POM ed = new ED_TC_POM();
    WebDriverWait wait= new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(30));   // since is static we call by name of metod

    @When("Click on My Account Dropmenu")
    public void clickOnMyAccountDropmenu() {
        ed.clickMethod(ed.getMyAccount());

    }

    @And("Click on Login option")
    public void clickOnLoginOption() throws InterruptedException {
        Thread.sleep(2000);
        ed.clickMethod(ed.getLoginOptions());
    }

    @And("Enter valid email address into the E-Mail Address")
    public void enterValidEmailAddressIntoTheEMailAddress() {
        ed.sendKeysMethod(ed.getEmailF(), "pavanoltraining@gmail.com");
    }

    @And("Enter valid password into the Password")
    public void enterValidPasswordIntoThePassword() {
        ed.sendKeysMethod(ed.getPasswordF(), "12345");
    }

    @And("Click on Login button")
    public void clickOnLoginButton() throws InterruptedException {
        ed.clickMethod(ed.getLoginButt());
    }

    @And("Click on Browser back button")
    public void clickOnBrowserBackButton() {
        BasicDriver.getDriver().navigate().back();
    }

    @Then("User should not logged out")
    public void userShouldNotLoggedOut() {
        Assert.assertTrue(ed.getCheckingMessage().isDisplayed());
    }
    // First Scenario (TS_002)  Logout Functionality

    @Then("Login page UI should adhere to the UI checklist")
    public void loginPageUIShouldAdhereToTheUIChecklist() {
        Assert.assertTrue(ed.getCheckList().isDisplayed());
    }
    // test 2

    @Then("Logout functionality should work correctly in all the supported environments")
    public void logoutFunctionalityShouldWorkCorrectlyInAllTheSupportedEnvironments() {
ed.clickMethod(ed.getMyAccount());
Assert.assertTrue(ed.getLogoutF().isDisplayed());
    }
    // test 3

    @When("Enter any existing product name into the Search text box field")
    public void enterAnyExistingProductNameIntoTheSearchTextBoxField() {
        ed.sendKeysMethod(ed.getSearchText(),"iMac");
    }

    @And("Click on the button having search icon")
    public void clickOnTheButtonHavingSearchIcon() {

        ed.clickMethod(ed.getSearchIcon());
    }

    @And("Select List option")
    public void selectListOption() {
        ed.clickMethod(ed.getListOption());
    }

    @And("Click on the Image of the Product and name of the product")
    public void clickOnTheImageOfTheProductAndNameOfTheProduct() {
        ed.clickMethod(ed.getiMacFoto());
        BasicDriver.getDriver().navigate().back();
        ed.clickMethod(ed.getiMacProdName());
    }

    @And("Repeat Steps one to two and Select Grid option")
    public void repeatStepsOneToTwoAndSelectGridOption() {
        BasicDriver.getDriver().navigate().back();
        ed.getSearchText().clear();
        enterAnyExistingProductNameIntoTheSearchTextBoxField();
        clickOnTheButtonHavingSearchIcon();
        ed.clickMethod(ed.getGridOption());

    }



    @Then("Single product should be dislayed in the")
    public void singleProductShouldBeDislayedInThe() {
        Assert.assertTrue(ed.getiMacHeader().isDisplayed());
    }

    @Then("User should be navigated to the Product Display Page of the product")
    public void userShouldBeNavigatedToTheProductDisplayPageOfTheProduct() {

        Assert.assertTrue(ed.getiMacHeader().isDisplayed());
    }

    @Then("Single product should be dislayed in the Grid view without any problems and all the options  are working")
    public void singleProductShouldBeDislayedInTheGridViewWithoutAnyProblemsAndAllTheOptionsAreWorking() {

        Assert.assertTrue(ed.getiMacHeader().isDisplayed());
        Assert.assertTrue(ed.getAddToCartButton().isDisplayed());
        Assert.assertTrue(ed.getAmountSelect().isDisplayed());

    }
    // test 4


    @And("Click on the Product displayed in the Search results")
    public void clickOnTheProductDisplayedInTheSearchResults() {
        ed.clickMethod(ed.getSearchButton());
    }

    @And("Hover the mouse cursor on Compare this Product option from the displayed Product Display Page")
    public void hoverTheMouseCursorOnCompareThisProductOptionFromTheDisplayedProductDisplayPage() {
        Actions actions = new Actions(BasicDriver.getDriver());
        actions.moveToElement(ed.getCompareButton()).build();
        actions.perform();
    }

    @And("Select Compare this Product option")
    public void selectCompareThisProductOption() {
        ed.clickMethod(ed.getCompareButton());
    }

    @And("Click on product comparision link from the displayed success message")
    public void clickOnProductComparisionLinkFromTheDisplayedSuccessMessage() {
        ed.clickMethod(ed.getCompareLink());

    }

    @Then("Tool tip with the text")
    public void toolTipWithTheText() {

        Assert.assertTrue(ed.getCompareButton().isDisplayed());

    }

    @And("Success message with text")
    public void successMessageWithText() {
        Assert.assertTrue(ed.getSuccessCompareMessage().isDisplayed());
    }

    @And("User should be taken to the Product Comparison page with the details of the Product that we have added for comparision.")
    public void userShouldBeTakenToTheProductComparisonPageWithTheDetailsOfTheProductThatWeHaveAddedForComparision() {

        Assert.assertTrue(ed.getProductComparisonPlat().isDisplayed());
        Assert.assertTrue(ed.getAddToCartComparisonButton().isDisplayed());
    }

    @And("Select Compare this Product option from the displayed Product Display Page")
    public void selectCompareThisProductOptionFromTheDisplayedProductDisplayPage() {
        ed.clickMethod(ed.getCompareButton());

    }

    @And("Click on the Product Name link in the displayed success message")
    public void clickOnTheProductNameLinkInTheDisplayedSuccessMessage() {
        ed.clickMethod(ed.getiMacLink());
    }

    @And("Click on the Product Comparison link in the displayed success message")
    public void clickOnTheProductComparisonLinkInTheDisplayedSuccessMessage() {
        BasicDriver.getDriver().navigate().back();
        ed.clickMethod(ed.getCompareLink());
    }

    @Then("User should be navigated to the respective Product Display Page")
    public void userShouldBeNavigatedToTheRespectiveProductDisplayPage() {
        String expRes = "iMac";
        String actRes = BasicDriver.getDriver().getTitle();
        Assert.assertEquals(actRes,expRes);
    }

    @Then("User shluld be taken to the Prdocut Comparison page")
    public void userShluldBeTakenToThePrdocutComparisonPage() {
       String acRes = BasicDriver.getDriver().getTitle();
       String exRes = "Product Comparison";
       Assert.assertEquals(acRes,exRes);

    }

    @And("Click on the main bigger sized Thumbnail image displayed on the Product Display Page")
    public void clickOnTheMainBiggerSizedThumbnailImageDisplayedOnTheProductDisplayPage() {
        ed.clickMethod(ed.getProdInYStore());
        ed.clickMethod(ed.getNormalSizeProductPhoto());
    }

    @And("Click on < and > options")
    public void clickOnAndOptions() {
        ed.clickMethod(ed.getLeft());
        ed.clickMethod(ed.getRight());


    }

    @And("Click on x option or press ESC keyboard key when the thumbnails are displayed in Light box view")
    public void clickOnXOptionOrPressESCKeyboardKeyWhenTheThumbnailsAreDisplayedInLightBoxView() {
        ed.clickMethod(ed.getxClose());
    }

    @And("Click on the normal sized Thumbnail images and repeat the steps fife to six")
    public void clickOnTheNormalSizedThumbnailImagesAndRepeatTheStepsFifeToSix() {
        ed.clickMethod(ed.getNormalSizeProductPhoto());
        ed.clickMethod(ed.getLeft());
        ed.clickMethod(ed.getRight());
        ed.clickMethod(ed.getxClose());
    }

    @Then("Light box view of the main Thumbnail image should be displayed with options to view the previous and next Thumnail images in Light box view.")
    public void lightBoxViewOfTheMainThumbnailImageShouldBeDisplayedWithOptionsToViewThePreviousAndNextThumnailImagesInLightBoxView() {

       Assert.assertTrue(ed.getLightBox1().isDisplayed());
       Assert.assertTrue(ed.getLightBox2().isDisplayed());
    }

    @Then("User should be able to navigate to other thumbnail images in the Light box view")
    public void userShouldBeAbleToNavigateToOtherThumbnailImagesInTheLightBoxView() {
        ed.clickMethod(ed.getNormalSizeProductPhoto());
        Assert.assertTrue(ed.getRight().isDisplayed());
        Assert.assertTrue(ed.getLeft().isDisplayed());
        ed.clickMethod(ed.getxClose());
        // ???????????????????????????????????????
    }

    @Then("Light box view should close and the focus should go to the Product Display Page.")
    public void lightBoxViewShouldCloseAndTheFocusShouldGoToTheProductDisplayPage() {
        ed.clickMethod(ed.getNormalSizeProductPhoto());
        ed.clickMethod(ed.getxClose());
        String expTitle = "iMac";
        String actualTitle= BasicDriver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expTitle);
    }

    @Then("Light box view of the selected Thumbnail image should be displayed with options to view the previous and next Thumnail images in Light box view.  User should be able to navigate to other thumbnail images in the Light box view. Light box view should close and the focus should go to the Product Display Page.")
    public void lightBoxViewOfTheSelectedThumbnailImageShouldBeDisplayedWithOptionsToViewThePreviousAndNextThumnailImagesInLightBoxViewUserShouldBeAbleToNavigateToOtherThumbnailImagesInTheLightBoxViewLightBoxViewShouldCloseAndTheFocusShouldGoToTheProductDisplayPage() {
        Assert.assertTrue(ed.getNormalSizeProductPhoto().isDisplayed());
    }

    @And("Click on Write a review link under Add to Cart button of the Product Display page")
    public void clickOnWriteAReviewLinkUnderAddToCartButtonOfTheProductDisplayPage() {
        ed.clickMethod(ed.getAddToCartAndeProduct());
        ed.clickMethod(ed.getiMacLink());
        ed.clickMethod(ed.getWriteAReview());

    }

    @Then("Reviews tab in the Product Display page should come to the focus.")
    public void reviewsTabInTheProductDisplayPageShouldComeToTheFocus() {
        Assert.assertTrue(ed.getFormReview().isDisplayed());
    }

    @And("Click on Add to Cart button")
    public void clickOnAddToCartButton() {
        ed.clickMethod(ed.getAddToCartAndeProduct());
    }

    @And("Click on Product Name link from the displayed success page")
    public void clickOnProductNameLinkFromTheDisplayedSuccessPage() {
        ed.clickMethod(ed.getiMacLink());
    }

    @Then("User should be taken to the Product Display page of the Product")
    public void userShouldBeTakenToTheProductDisplayPageOfTheProduct() {
        Assert.assertTrue(ed.getProductInfoInProductPage().isDisplayed());
    }

    @Then("Product  Display page functionality should work correctly in all the supported environments")
    public void productDisplayPageFunctionalityShouldWorkCorrectlyInAllTheSupportedEnvironments() {
    }

    @When("Hover the mouse on any of the menu option say Desktops")
    public void hoverTheMouseOnAnyOfTheMenuOptionSayDesktops()  {
      ed.clickMethod(ed.getDesktopsMenuOption());


    }

    @And("Click on Show All Desktops option")
    public void clickOnShowAllDesktopsOption() {
        ed.clickMethod(ed.getShowAllDesktops());
    }

    @And("Select Mac subcategory option from the left side options")
    public void selectMacSubcategoryOptionFromTheLeftSideOptions() {
       ed.clickMethod(ed.getMacSubcategory());
    }

    @And("Click on Add to Wish List option that is availble on any of the Products of the displayed Category or Sub-category pages")
    public void clickOnAddToWishListOptionThatIsAvailbleOnAnyOfTheProductsOfTheDisplayedCategoryOrSubCategoryPages() {
    }

    @And("Click on the wish list! link in the displayed success message")
    public void clickOnTheWishListLinkInTheDisplayedSuccessMessage() {
    }

    @Then("Product should be successfully displayed in the My Wish List page")
    public void productShouldBeSuccessfullyDisplayedInTheMyWishListPage() {
    }

    @When("One product is added to My Wish List page")
    public void oneProductIsAddedToMyWishListPage() {
        enterAnyExistingProductNameIntoTheSearchTextBoxField();
       clickOnTheButtonHavingSearchIcon();
     ed.clickMethod(ed.getWishListAnderProduct());


        ed.sendKeysMethod(ed.getSearchText(),"iPhone");
        clickOnTheButtonHavingSearchIcon();
        ed.clickMethod(ed.getWishListAnderProduct());

        ed.clickMethod(ed.getWishListLink());

    }

    @When("Click on Modify your wish list option")
    public void clickOnModifyYourWishListOption() {
        ed.clickMethod(ed.getRemoveX());
    }

    @And("Click on Add to Cart icon option")
    public void clickOnAddToCartIconOption() {
    }

    @And("Click on Add to Cart button in the displayed Product Display page")
    public void clickOnAddToCartButtonInTheDisplayedProductDisplayPage() {
        ed.clickMethod(ed.getAddToCartAndeProduct());
    }

    @And("Click on the shopping cart! link in the displayed success message")
    public void clickOnTheShoppingCartLinkInTheDisplayedSuccessMessage() {
        ed.clickMethod(ed.getShoppCartLink());
    }

    @And("Enter a new quantity into the Quantity field of the Product in the displayed Shopping Cart page")
    public void enterANewQuantityIntoTheQuantityFieldOfTheProductInTheDisplayedShoppingCartPage() {
      //  wait.until(ExpectedConditions.visibilityOf(ed.getQuantity()));
  //  ed.getQuantity().clear();
    ed.sendKeysMethod(ed.getQuantity(),"2");
    }

    @And("Click on Update icon option")
    public void clickOnUpdateIconOption() {
        ed.clickMethod(ed.getUpdateButton());
    }

    @Then("add product to sh cart and navigate to shopCart page")
    public void addProductToShCartAndNavigateToShopCartPage() {
        enterAnyExistingProductNameIntoTheSearchTextBoxField();
        clickOnTheButtonHavingSearchIcon();
        clickOnAddToCartButton();
clickOnTheShoppingCartLinkInTheDisplayedSuccessMessage();
    }

    @When("Click on Estimate Shipping & Taxes section")
    public void clickOnEstimateShippingTaxesSection() {
        ed.clickMethod(ed.getEstimateShippingTaxes());
    }

    @And("Select any Country from the Country dropdown field")
    public void selectAnyCountryFromTheCountryDropdownField() {
        Select select = new Select(ed.getCountry());
        select.selectByVisibleText("United States");
    }

    @And("Select any State from the Region and State field")
    public void selectAnyStateFromTheRegionAndStateField() {
        Select select1 = new Select(ed.getStates());
        select1.selectByVisibleText("California");
    }

    @And("Click on Get Quotes button")
    public void clickOnGetQuotesButton() {
        ed.clickMethod(ed.getGetQuotes());
    }

    @And("Select the radio button and Click on Apply Shipping button")
    public void selectTheRadioButtonAndClickOnApplyShippingButton() {
        Assert.assertTrue(ed.getDialogWindow().isDisplayed());
    }

    @Then("Please select the preferred shipping method to use on this order dialog should be displayed.")
    public void pleaseSelectThePreferredShippingMethodToUseOnThisOrderDialogShouldBeDisplayed() {

        ed.clickMethod(ed.getFlatSihippingRateRadioButton());
        ed.clickMethod(ed.getApplyShippingButton());
    }

    @Then("Flat Shipping Rate - ${double} radio button  should be displayed in the displayed dialog and is not selected by default")
    public void flatShippingRate$RadioButtonShouldBeDisplayedInTheDisplayedDialogAndIsNotSelectedByDefault(int arg0, int arg1) {
        Assert.assertTrue(ed.getFlatSihippingRateRadioButton().isDisplayed());
    }

    @Then("Flat Shipping Rate should be displayed and added to the Total Price")
    public void flatShippingRateShouldBeDisplayedAndAddedToTheTotalPrice() {
        Assert.assertTrue(ed.getFlatRateText().isDisplayed());
        Assert.assertTrue(ed.getFifeDollars().isDisplayed());
    }

    @When("Check the UI of the functionality related to Shopping Cart")
    public void checkTheUIOfTheFunctionalityRelatedToShoppingCart() {
        ed.clickMethod(ed.getShoppingCartHeaderLane());
        Assert.assertTrue(ed.getsCFunctional().isDisplayed());
        Assert.assertTrue(ed.getCotinueInShpoFunc().isDisplayed());
        BasicDriver.getDriver().navigate().back();

    }

    @Then("Proper UI adhering to the UI checklist should be displayed for the Shopping Cart functionality")
    public void properUIAdheringToTheUIChecklistShouldBeDisplayedForTheShoppingCartFunctionality() {
        Assert.assertTrue(ed.getCheckoutHeaderOption().isDisplayed());
        Assert.assertTrue(ed.getFunctionalCheckList().isDisplayed());
    }

    @When("Click on Checkout header option")
    public void clickOnCheckoutHeaderOption() {
        ed.clickMethod(ed.getCheckoutHeaderOption());
    }

    @Then("User should be taken to an empty Shopping Cart page instead of Checkout page")
    public void userShouldBeTakenToAnEmptyShoppingCartPageInsteadOfCheckoutPage() {
        Assert.assertTrue(ed.getShoppingCartText().isDisplayed());
        String expMessage = "Your shopping cart is empty!";
      String actual =  ed.getTextMethod(ed.getEmptyCartMessage());
        Assert.assertEquals(actual,expMessage,"test is failed");
    }

    @And("Click on Add to Cart button on the Product displayed in the Search results")
    public void clickOnAddToCartButtonOnTheProductDisplayedInTheSearchResults() {
    }



    @And("Click on Checkout button in the Shopping Cart page")
    public void clickOnCheckoutButtonInTheShoppingCartPage() {
        ed.clickMethod(ed.getCheckoutInShopCartPage());
    }

    @And("Click on Continue button")
    public void clickOnContinueButton() {
        ed.clickMethod(ed.getContinueButton());
    }

    @And("Select I want to use a new address radio option")
    public void selectIWantToUseANewAddressRadioOption() {
        ed.clickMethod(ed.getCheckBoxShipping());
       ed.clickMethod(ed.getContinueRegisterButton());
    }

    @Then("Proper field level warning messages should be displayed for all the mandatory fields in the Delivery Details section")
    public void properFieldLevelWarningMessagesShouldBeDisplayedForAllTheMandatoryFieldsInTheDeliveryDetailsSection() {
        Assert.assertTrue(ed.getWarningMessage().isDisplayed());
    }

    @When("Click on Site Map link in the Footer options")
    public void clickOnSiteMapLinkInTheFooterOptions() {
        ed.clickMethod(ed.getSiteMap());
    }

    @And("Click on My Account link in the displayed Site Map page")
    public void clickOnMyAccountLinkInTheDisplayedSiteMapPage() {
        ed.clickMethod(ed.getMyAccountLinc());
    }

    @Then("User should be taken to My Account page")
    public void userShouldBeTakenToMyAccountPage() {
        Assert.assertTrue(ed.getNewCustomerRegister().isDisplayed());
    }


    @Then("Success message with text for wish list")
    public void successMessageWithTextForWishList() {

    }

    @Then("Success message with text for shopping cart")
    public void successMessageWithTextForShoppingCart() {

    }

    @Then("Success message with text for modified")
    public void successMessageWithTextForModified() {
     Assert.assertTrue(ed.getSuccessMessage1().isDisplayed());


    }

    @And("Don't enter anything into the fields of Delivery Details Section of Checkout page")
    public void donTEnterAnythingIntoTheFieldsOfDeliveryDetailsSectionOfCheckoutPage() {
    }

    @Then("Flat Shipping Rate radio button  should be displayed in the displayed dialog and is not selected by default")
    public void flatShippingRateRadioButtonShouldBeDisplayedInTheDisplayedDialogAndIsNotSelectedByDefault() {
        selectTheRadioButtonAndClickOnApplyShippingButton();
    }

    @Then("Success message with text for shipping")
    public void successMessageWithTextForShipping() {
        Assert.assertTrue(ed.getShoppEstSuccess().isDisplayed());
    }
}