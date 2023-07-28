package au.com.carsguide.steps;

import au.com.carsguide.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BuySteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHooverToBuySell();

    }

    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCar();
    }

    @Then("^I navigate to ‘new and used car search’ page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
        Assert.assertEquals(new NewAndUsedCarSearchPage().verifyToNavigateToNewAndUsedPage(), "New & Used Car Search - carsguide", "Not Displayed Message");

    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String selectAnyMake) throws Throwable {
        new NewAndUsedCarSearchPage().selectMakeMake(selectAnyMake);
        throw new PendingException();

    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCar();

    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) throws Throwable {
        new NewAndUsedCarSearchPage().selectCarModel(model);
        throw new PendingException();
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String yourLocation) throws Throwable {
        new NewAndUsedCarSearchPage().selectLocation(yourLocation);
        throw new PendingException();
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String priceMax) throws Throwable {
        new NewAndUsedCarSearchPage().selectPriceMax(priceMax);
        throw new PendingException();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String resultText) throws Throwable {
        Assert.assertEquals(new ResultPage().VerifyResult(), resultText);
        throw new PendingException();
    }

    @And("^I click 'used' link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsed();

    }

    @Then("^I navigate to 'Used Cars For Sale' page$")
    public void iNavigateToUsedCarsForSalePage() {
        Assert.assertEquals(new UsedCarForSalePage().verifyTOUsedCarPage(), "Used Cars For Sale", "Not Displayed");
    }

    @And("^I click 'Find a Dealer'$")
    public void iClickFindADealer() {
        new HomePage().clickOnFindDealer();
    }

    @Then("^I navigate to 'car-dealers' page$")
    public void iNavigateToCarDealersPage() {
        Assert.assertEquals(new CarDealersPage().verifyCarDealerText(), "Find a Car Dealership Near You", "Not Displayed");
    }

    @And("^I should see the names \"([^\"]*)\" are display on page$")
    public void iShouldSeeTheNamesAreDisplayOnPage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}

