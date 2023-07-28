package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarSearchPage extends Utility {

    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    public NewAndUsedCarSearchPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'New & Used Car Search - carsguide')]")
    WebElement navigateText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement selectMake;

    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement carModel;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement priceMax;

    @CacheLookup
    @FindBy (xpath = "//input[@id='search-submit']")
    WebElement findMyCarButton;

    public String verifyToNavigateToNewAndUsedPage() {
       return getTextFromElement(navigateText);

    }

    public void selectMakeMake(String selectCar) {
        selectByValueFromDropDown(selectMake, selectCar);
    }

    public void selectCarModel(String model) {
        selectByValueFromDropDown(carModel, model);
    }

    public void selectLocation(String yourLocation) {
        selectByValueFromDropDown(location, yourLocation);
    }

    public void selectPriceMax(String price) {
        selectByValueFromDropDown(priceMax, price);

    }
    public void clickOnFindMyNextCar(){
        clickOnElement(findMyCarButton);
    }

}
