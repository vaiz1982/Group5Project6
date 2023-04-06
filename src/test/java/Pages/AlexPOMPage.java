package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlexPOMPage extends MyMethods {

    public AlexPOMPage() {
        PageFactory.initElements(BasicDriver.getDriver(), this);


    }
}
