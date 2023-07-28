package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buySell;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCar;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement used;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Find a Dealer')]")
    WebElement findDealer;

    public void mouseHooverToBuySell(){
        mouseHoverToElement(buySell);
    }

    public void clickOnSearchCar(){
        clickOnElement(searchCar);
    }

    public void clickOnUsed(){
        clickOnElement(used);
    }

    public void clickOnFindDealer(){
        clickOnElement(findDealer);
    }
}
