package stepdefinitions;

import BrowsersDriver.FoxtonsBrowserDrivers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.UniversityRentalPropertiesPage;
import utilities.CommonMethods;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static org.testng.Assert.*;

public class UniversityRentalPropertiesSD {
    WebDriver driver = FoxtonsBrowserDrivers.getDriver();
    UniversityRentalPropertiesPage uniRentProp = new UniversityRentalPropertiesPage(driver);

    public static String hrefAttributeOfFindAccommodationLink = null;

    @When("User accesses the University Rental Properties URL")
    public void userAccessesTheUniversityRentalPropertiesURL() {
        driver.manage().deleteAllCookies(); //delete all cookies
        CommonMethods.clickCookie(driver);
        driver.get(FoxtonsHooks.HOST);
        uniRentProp.accessUniversityRentalPropertiesPage();
    }

    @Then("User should navigate to the University Rental Properties page")
    public void verifyNavigationToTheUniversityRentalPropertiesPage() {
        String actualURL = driver.getCurrentUrl();
        String ExpectedURL = uniRentProp.UniversityRentalPropertiesURL;
        CommonMethods.assertCustomEquals(actualURL, ExpectedURL);
    }

    @When("User sees the hero image on the University Rental Properties page")
    public void userSeesTheHeroImageOnTheUniversityRentalPropertiesPage() { uniRentProp.findHeroBanner(); }

    @Then("User should see proper heading and subtext on the hero image on the University Rental Properties page")
    public void verifyPresenceOfHeadingAndASubtextOnTheHeroImageOnTheUniversityRentalPropertiesPage() {
        assertFalse(uniRentProp.findHeadingOnHeroBanner().isEmpty());
        assertFalse(uniRentProp.findSubtextOnHeroBanner().isEmpty());
    }

    @When("User scrolls down below the hero image on the University Rental Properties page")
    public void userScrollsDownBelowTheHeroImageOnTheUniversityRentalPropertiesPage() {
        uniRentProp.scrollDownToTheFoldHeading();
    }

    @Then("User should see the section with a fold heading on the University Rental Properties page")
    public void verifyTheSectionHasAFoldHeadingOnTheUniversityRentalPropertiesPage() {
        assertFalse(uniRentProp.findTheFoldHeadingOnASection().isEmpty());
    }

    @When("User scrolls down below the fold heading in a section on the University Rental Properties page")
    public void userScrollsDownBelowTheFoldHeadingInASectionOnTheUniversityRentalPropertiesPage() {
        uniRentProp.scrollDownToTheUniversityListing();
    }

    @Then("User should see the section with a fold heading lists all universities and colleges on the University Rental Properties page")
    public void verifyTheSectionListsAllUniversitiesAndCollegesOnTheUniversityRentalPropertiesPage() {
        List<WebElement> universityList = uniRentProp.findTheUniversityListing();
        assertFalse(universityList.isEmpty());
    }

    @Then("User should see name of the institution on a university card on the University Rental Properties page")
    public void verifyNameOfTheInstitutionOnAUniversityCardOnTheUniversityRentalPropertiesPage() {
        List<WebElement> dataAndLinkOnTheUniversityCard = uniRentProp.findNameAddressPostalCodeAndFindAccommodationLinkOnOneUniversityCard();
        assertFalse(dataAndLinkOnTheUniversityCard.get(0).getText().isEmpty());
    }

    @Then("User should see address of the institution on a university card on the University Rental Properties page")
    public void verifyAddressOfTheInstitutionOnAUniversityCardOnTheUniversityRentalPropertiesPage() {
        List<WebElement> dataAndLinkOnTheUniversityCard = uniRentProp.findNameAddressPostalCodeAndFindAccommodationLinkOnOneUniversityCard();
        assertFalse(dataAndLinkOnTheUniversityCard.get(1).getText().isEmpty());
        assertFalse(dataAndLinkOnTheUniversityCard.get(2).getText().isEmpty());
    }

    @Then("User should see postal code of the institution on a university card on the University Rental Properties page")
    public void verifyPostalCodeOfTheInstitutionOnAUniversityCardOnTheUniversityRentalPropertiesPage() {
        List<WebElement> dataAndLinkOnTheUniversityCard = uniRentProp.findNameAddressPostalCodeAndFindAccommodationLinkOnOneUniversityCard();
        assertFalse(dataAndLinkOnTheUniversityCard.get(3).getText().isEmpty());
    }

    @Then("User should see a find accommodation link on a university card on the University Rental Properties page")
    public void verifyPresenceOfAFindAccommodationLinkOnAUniversityCardOnTheUniversityRentalPropertiesPage() {
        List<WebElement> dataAndLinkOnTheUniversityCard = uniRentProp.findNameAddressPostalCodeAndFindAccommodationLinkOnOneUniversityCard();
        try {
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
            wdw.until(ExpectedConditions.elementToBeClickable(dataAndLinkOnTheUniversityCard.get(4)));
        } catch (TimeoutException toe) {
            toe.printStackTrace();
        }
        assert dataAndLinkOnTheUniversityCard.get(4) != null;
    }

    @When("User clicks on the Find Accommodation link on a university card on the University Rental Properties page")
    public void userClicksOnTheFindAccommodationLinkOnAUniversityCardOnTheUniversityRentalPropertiesPage() {
        String hrefAttr = uniRentProp.storeHrefAttributeOfFindAccommodationLink();
        hrefAttributeOfFindAccommodationLink = hrefAttr;
        uniRentProp.findNameAddressPostalCodeAndFindAccommodationLinkOnOneUniversityCard().get(4).click();
    }

    @Then("User should be taken to a page with search parameters with the university's location on the University Rental Properties page")
    public void verifyNavigationToAPageWithSearchParametersWithTheUniversityLocationOnTheUniversityRentalPropertiesPage() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = hrefAttributeOfFindAccommodationLink;
        try {
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
            wdw.until(ExpectedConditions.urlToBe(hrefAttributeOfFindAccommodationLink));
        } catch (TimeoutException toe) {
            toe.printStackTrace();
        }
        CommonMethods.assertCustomEquals(actualURL, expectedURL);
    }

    @Then("User should see that the university cards are displayed in a two rows and three columns per page format on the University Rental Properties page")
    public void verifyTheUniversityCardsAreDisplayedInA2RowsAnd3ColumnsPerPageFormatOnTheUniversityRentalPropertiesPage() {
        List<WebElement> universityList = uniRentProp.findTheUniversityListing();
        int xcoords[] = new int[universityList.size()];
        int ycoords[] = new int[universityList.size()];
        boolean twoRows = false;
        boolean threeColumns = false;

        for (int i = 0; i < universityList.size(); i++) {
            xcoords[i] = universityList.get(i).getLocation().x;
            ycoords[i] = universityList.get(i).getLocation().y;
            // System.out.println(xcoords[i] + " " + ycoords[i]);
        }

        // Getting unique elements from the ycoords array will show how many rows of university cards there are on the page.
        // So, putting all elements of the ycoords array into hashmap's key and then checking the keySet() size.
        // The hashmap contains only unique keys, so it will automatically remove the duplicate elements from the hashmap keySet,
        // and we will get the keySet() size equal to the number of rows of university cards which is expected to be 2.
        HashMap<Integer, Integer> distinctRows = new HashMap<Integer, Integer>();
        for (int j = 0; j < ycoords.length; j++) { distinctRows.put(ycoords[j],0); }
        // System.out.println(distinctRows.keySet().size());
        if (distinctRows.keySet().size() == 2) { twoRows = true; }

        // Same logic as number of rows goes for number of columns which is expected to be 3.
        HashMap<Integer, Integer> distinctColumns = new HashMap<Integer, Integer>();
        for (int j = 0; j < xcoords.length; j++) { distinctColumns.put(xcoords[j],0); }
        // System.out.println(distinctColumns.keySet().size());
        if (distinctColumns.keySet().size() == 3) { threeColumns = true; }

        assertTrue (twoRows && threeColumns);
    }

    @Then("User should navigate through the university list by selecting next pages on the University Rental Properties page")
    public void verifyNavigationThroughTheUniversityListBySelectingNextPagesOnTheUniversityRentalPropertiesPage() {
        uniRentProp.scrollDownToTheFoldHeading();
        uniRentProp.scrollDownToTheNextPageButton();
        boolean universityCardsPresentOnPage = false;
        long startTime = System.currentTimeMillis();
            while (uniRentProp.nextButtonEnabled()) {
            uniRentProp.clickOnNextPageButton();
            List<WebElement> numberOfUniversityCardsOnAPage = uniRentProp.findTheUniversityListing();
            if (numberOfUniversityCardsOnAPage.size() > 0) {
                // System.out.println(numberOfUniversityCardsOnAPage.size());
                universityCardsPresentOnPage = true;
            } else {
                universityCardsPresentOnPage = false;
                break;
            }
            // break out of the loop if 1 minute has been passed since the beginning of the loop
            if ((System.currentTimeMillis() - startTime) > 60000) break;
        }
        assertTrue(universityCardsPresentOnPage);
    }

    @Then("User should navigate through the university list by selecting previous pages on the University Rental Properties page")
    public void verifyNavigationThroughTheUniversityListBySelectingPreviousPagesOnTheUniversityRentalPropertiesPage() {
        uniRentProp.scrollDownToTheFoldHeading();
        uniRentProp.scrollDownToTheNextPageButton();
        boolean universityCardsPresentOnPage = false;
        long startTime = System.currentTimeMillis();

        // Reach the last page so that the previous button becomes enable and can be pressed multiple times
        while (uniRentProp.nextButtonEnabled()) {
            uniRentProp.clickOnNextPageButton();
            // break out of the loop if 1 minute has been passed since the beginning of the loop
            if ((System.currentTimeMillis() - startTime) > 60000) break;
        }

        while (uniRentProp.previousButtonEnabled()) {
            uniRentProp.clickOnPreviousPageButton();
            List<WebElement> numberOfUniversityCardsOnAPage = uniRentProp.findTheUniversityListing();
            if (numberOfUniversityCardsOnAPage.size() > 0) {
                // System.out.println(numberOfUniversityCardsOnAPage.size());
                universityCardsPresentOnPage = true;
            } else {
                universityCardsPresentOnPage = false;
                break;
            }
            // break out of the loop if 1 minute has been passed since the beginning of the loop
            if ((System.currentTimeMillis() - startTime) > 60000) break;
        }
        assertTrue(universityCardsPresentOnPage);
    }

    @Then("User should navigate through the university list by directly selecting the number of page on the University Rental Properties page")
    public void verifyNavigationThroughTheUniversityListByDirectlySelectingTheNumberOfPageOnTheUniversityRentalPropertiesPage() {
        uniRentProp.scrollDownToTheFoldHeading();
        uniRentProp.scrollDownToTheNextPageButton();
        boolean universityCardsPresentOnPage = false;
        long startTime = System.currentTimeMillis();

        List<WebElement> directPageNumberElements = uniRentProp.findDirectPageNumberElements();
        Random random = new Random();
        int rand = 0;
        while (true) {
            rand = random.nextInt(directPageNumberElements.size());
            if(rand !=0) break;
        }
        directPageNumberElements.get(rand).click();
        uniRentProp.waitForUniversityCardsToLoad();
        List<WebElement> numberOfUniversityCardsOnAPage = uniRentProp.findTheUniversityListing();
        if (numberOfUniversityCardsOnAPage.size() > 0) {
            universityCardsPresentOnPage = true;
        } else { universityCardsPresentOnPage = false; }
        assertTrue(universityCardsPresentOnPage);
    }

    @When("User scrolls down to the end of the University Rental Properties page")
    public void userScrollsDownToTheEndOfTheUniversityRentalPropertiesPage() {
        uniRentProp.scrollDownToTheFoldHeading();
        uniRentProp.scrollDownToTheNextPageButton();
        CommonMethods.scrollToBottom(driver);
    }
}
