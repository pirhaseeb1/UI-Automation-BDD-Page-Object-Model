package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.MyFoxtonsPage;
import utilities.CommonMethods;

import static org.testng.Assert.assertEquals;

public class MyFoxtonsSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();

    MyFoxtonsPage myFoxtonsPage  = new MyFoxtonsPage(driver);

    //    Scenario 1
    @Given("User on Home Screen")
    public void user_on_Home_Screen() {
    }

    @When("User access Foxtons Page")
    public void user_access_Foxtons_Page() {

        HomePage home = new HomePage(driver);
        home.clickCTA();
    }

    @When("User clicks on Sign In button")
    public void user_clicks_on_Sign_In_button() {
        //MyFoxtonsPage foxton  = new MyFoxtonsPage(driver);
        myFoxtonsPage.clickSignIn();
    }


    @Then("User should navigate to Login Screen")
    public void user_should_navigate_to_Login_Screen() {
        String actualURL = driver.getCurrentUrl();
        CommonMethods.assertCustomEquals(actualURL, MyFoxtonsPage.ExpectedURL_SignIn);
        driver.quit();
    }

    //    Scenario 2
    @When("User clicks on Regiser button")
    public void user_clicks_on_Regiser_button() {
       // MyFoxtonsPage foxton =  new MyFoxtonsPage(driver);
        myFoxtonsPage.clickRegister();
    }


    @Then("User should navigate to Registration Screen")
    public void user_should_navigate_to_Registration_Screen() {
        String actualURL = driver.getCurrentUrl();
        assertEquals (actualURL, MyFoxtonsPage.ExpectedURL_Register);
        driver.quit();
    }

//    Scenario 3

    @When ("User clicks on My Foxtons Landlord Card")
    public void user_clicks_on_My_Foxtons_Landlord_Card(){
      //  MyFoxtonsPage foxton =  new MyFoxtonsPage(driver);
       myFoxtonsPage.clickLandLordCard();
    }

    @Then("User should naviate to My Foxtons Landlord Screen")
    public void user_should_naviate_to_My_Foxtons_Landlord_Screen() {
        String actualURL = driver.getCurrentUrl();
        assertEquals (actualURL, MyFoxtonsPage.ExecptedURL_Landlord);
        driver.quit();
    }

    //    Scenario 4
    @When("User clicks on My Foxtons Seller Card")
    public void user_clicks_on_My_Foxtons_Seller_Card() {
      //  MyFoxtonsPage foxton =  new MyFoxtonsPage(driver);
        myFoxtonsPage.clickSellerCard();
    }

    @Then("User should naviate to My Foxtons Seller Screen")
    public void user_should_naviate_to_My_Foxtons_Seller_Screen() {
        String actualURL = driver.getCurrentUrl();
        assertEquals (actualURL, MyFoxtonsPage.ExecptedURL_Seller);
        driver.quit();
    }

    //    Scenario 5
    @When("User clicks on My Foxtons Rental Card")
    public void user_clicks_on_My_Foxtons_Rental_Card() {
      //  MyFoxtonsPage foxton =  new MyFoxtonsPage(driver);
        myFoxtonsPage.clickRentalCard();
    }

    @Then("User should naviate to My Foxtons Rental Screen")
    public void user_should_naviate_to_My_Foxtons_Rental_Screen() {
        String actualURL = driver.getCurrentUrl();
        assertEquals (actualURL, MyFoxtonsPage.ExpectedURL_Rental);
        driver.quit();
    }

    //    Scenario 6
    @When("User clicks on My Foxtons Buyer Card")
    public void user_clicks_on_My_Foxtons_Buyer_Card() {
       // MyFoxtonsPage foxton =  new MyFoxtonsPage(driver);
        myFoxtonsPage.clickBuyerCard();
    }

    @Then("User should naviate to My Foxtons Buyer Screen")
    public void user_should_naviate_to_My_Foxtons_Buyer_Screen() {
        String actualURL = driver.getCurrentUrl();
        assertEquals (actualURL, MyFoxtonsPage.ExpectedURL_Buyer);
        driver.quit();
    }
}
