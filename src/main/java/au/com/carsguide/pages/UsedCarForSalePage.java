package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsedCarForSalePage extends Utility {
    private static final Logger log = LogManager.getLogger(UsedCarForSalePage.class.getName());

    public UsedCarForSalePage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Used Cars For Sale']")
    WebElement searchUsedCar;


    public String verifyTOUsedCarPage(){
        return getTextFromElement(searchUsedCar);
    }
}
