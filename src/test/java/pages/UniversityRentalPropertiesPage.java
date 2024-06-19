package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;

import java.time.Duration;
import java.util.List;

public class UniversityRentalPropertiesPage {
    private WebDriver driver;
    public UniversityRentalPropertiesPage(WebDriver driver) {
        this.driver = driver;
    }
    public static String UniversityRentalPropertiesURL = FoxtonsHooks.HOST.replace(projectProperties.getProperty("URL_REPLACE"), "") + "students/university";

    // Page elements
    public static String heroBanner = "//*[@id=\"heroBanner\"]";
    public static String heroBannerHeadingElement = "//h1[@id='universities']";
    public static String heroBannerSubtextElement = "//section[@id='heroBanner']//div/p";
    public static String foldHeadingElement = "//h2[contains(@class,'MuiTypography-root MuiTypography-h2 css')]";
    public static String universityCardElements = "//div[contains(@class,'MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-4 css')]";
    public static String universityFirstCardElement = universityCardElements + "[1]";
    public static String dataAndLinkOnOneUniversityCardElements = universityFirstCardElement + "//p";
    public static String dataAndLinkOnAllUniversityCardsElements = universityCardElements + "//p";
    public static String universitySearchParametersLinkElements = "//a[contains(@href,'/students/university/')]";
    public static String loadingElement = "//p[contains(.,'Loading')]";
    public static String nextPageButtonElement = "//button[@aria-label='Go to next page']";
    public static String previousPageButtonElement = "//button[@aria-label='Go to previous page']";
    public static String pageNumberButtonElements = "//button[contains(@class,'MuiPaginationItem-page')]";

    // Page actions

    // Opening the University Rental Properties page
    public void accessUniversityRentalPropertiesPage() { driver.get(UniversityRentalPropertiesURL); }

    public void findHeroBanner() { driver.findElement(By.xpath(heroBanner)).isDisplayed(); }

    public String findHeadingOnHeroBanner() {
        driver.findElement(By.xpath(heroBannerHeadingElement)).isDisplayed();
        return driver.findElement(By.xpath(heroBannerHeadingElement)).getText();
    }

    public String findSubtextOnHeroBanner() {
        driver.findElement(By.xpath(heroBannerSubtextElement)).isDisplayed();
        return driver.findElement(By.xpath(heroBannerSubtextElement)).getText();
    }

    public void scrollDownToTheFoldHeading() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(foldHeadingElement)));
    }

    public String findTheFoldHeadingOnASection() {
        driver.findElement(By.xpath(foldHeadingElement)).isDisplayed();
        return driver.findElement(By.xpath(foldHeadingElement)).getText();
    }

    public void scrollDownToTheUniversityListing() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath(universityFirstCardElement)));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(universityFirstCardElement)));
    }

    public List<WebElement> findTheUniversityListing() { return driver.findElements(By.xpath(universityCardElements)); }

    public List<WebElement> findNameAddressPostalCodeAndFindAccommodationLinkOnOneUniversityCard() {
        return driver.findElements(By.xpath(dataAndLinkOnOneUniversityCardElements));
    }

    public String storeHrefAttributeOfFindAccommodationLink() {
        List<WebElement> universitySearchParametersLinks = driver.findElements(By.xpath(universitySearchParametersLinkElements));
        return universitySearchParametersLinks.get(0).getAttribute("href");
    }

    public void scrollDownToTheNextPageButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(nextPageButtonElement)));
    }

    public boolean nextButtonEnabled() {
        return driver.findElement(By.xpath(nextPageButtonElement)).isEnabled();
    }

    public void waitForUniversityCardsToLoad() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loadingElement)));
        wdw.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(loadingElement)));
    }

    public void clickOnNextPageButton() {
        driver.findElement(By.xpath(nextPageButtonElement)).click();
        waitForUniversityCardsToLoad();
    }

    public boolean previousButtonEnabled() {
        return driver.findElement(By.xpath(previousPageButtonElement)).isEnabled();
    }

    public void clickOnPreviousPageButton() {
        driver.findElement(By.xpath(previousPageButtonElement)).click();
        waitForUniversityCardsToLoad();
    }

    public List<WebElement> findDirectPageNumberElements() {
        return driver.findElements(By.xpath(pageNumberButtonElements));
    }
}
