package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import static java.awt.SystemColor.menu;

public class CarDealersPage extends Utility {
    private static final Logger log = LogManager.getLogger(CarDealersPage.class.getName());

    public CarDealersPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Find a Car Dealership Near You')]")
    WebElement carDealerText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='dealerResults']")
    List<WebElement> dealersName;

    @FindBy(xpath = "//span[contains(text(),'Next')]")
    WebElement nextbuttoncontinue;


    public String verifyCarDealerText() {
       return getTextFromElement(carDealerText);

    }
    public void dealersNameDisplay(){
        while (nextbuttoncontinue.isDisplayed() == true){
            for(WebElement name :dealersName){

                if (name.getText().equalsIgnoreCase(String.valueOf(menu))){

                    Assert.assertTrue(true);
                    return;
                }
                else {
                    Assert.assertFalse(false);
                }
            }
            nextbuttoncontinue.click();
        }
    }


    }

