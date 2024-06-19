package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;
import utilities.CommonMethods;

import java.time.Duration;

public class InstructFoxtonsPage {
    private WebDriver driver;
    public InstructFoxtonsPage(WebDriver driver) {
        this.driver = driver;
    }
    public static String InstructFoxtonsURL = FoxtonsHooks.HOST.replace(projectProperties.getProperty("URL_REPLACE"), "") + "landlord/contact/instruct/lettings";

    // Page elements
    public static String subheadingElement = "//div//p[@class='message-text']";

    public static String headingElement = "//h1[@id='instruct-foxtons']";
    public static String rentalPriceTextFieldElement = "//input[@id='price']";
    public static String dateFieldElement = "//input[@placeholder='yyyy-mm-dd']";
    public static String calendarElement = "//div[@class='MuiCalendarPicker-root css-1brzq0m']";
    public static String dateTodayFromCalendarElement = "//button[contains(@class,'MuiPickersDay-today')]";
    public static String postcodeFieldElement = "//input[@id='postcode']";
    public static String findUKAddressCTAElement = "//button[contains(@class,'MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-fullWidth MuiButtonBase-root')]";
    public static String selectAddressDropdownElement = "//input[@id='address']";
    public static String firstAddressInTheSelectAddressDropdownElement = "//li[@id='address-option-0']";
    public static String titlesDropdownElement = "//select[@name='title']";
    public static String firstNameTextFieldElement = "//input[@id='first-name']";
    public static String lastNameTextFieldElement = "//input[@id='last-name']";
    public static String emailTextFieldElement = "//input[@id='email']";
    public static String phoneTextFieldElement = "//input[@id='phone']";
    public static String checkboxElement = "//input[@type='checkbox']";
    public static String sendRequestButtonElement = "//button[@type='submit']";
    public static String thankYouHeadingElement = "//h1[@id='thank-you']";
    public static String subheadingUponFormSubmissionElement = "//p[contains(.,'We will contact you shortly with full details')]";
    public static String myFoxtonsCTAElement = "//a[contains(.,'View my foxtons features')]";
    public static String alexanderHallCTAElement = "//a[contains(.,'Visit Alexander Hall')]";

    // Page Actions

    // Opening the Instruct Foxtons page
    public void accessInstructFoxtonsPage() {
        CommonMethods.clickCookie(driver);
        driver.get(InstructFoxtonsURL);

    }

    // Entering some text in the Rental Price text field
    public void enterTextInRentalPriceTextField(String rentalPrice) {
        driver.findElement(By.xpath(rentalPriceTextFieldElement)).sendKeys(rentalPrice);
    }

    // CLicking on When do you need tenants field
    public void clickOnDateElementToOpenCalendar() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dateFieldElement)));

        // Even if we click on the dateFieldElement successfully, the calendarElement was still not loaded into the DOM.
        // So keep clicking the dateFieldElement until the calendarElement is displayed but not for more than 3 sec.
        long startTime = System.currentTimeMillis();
        do {
            if ((System.currentTimeMillis() - startTime) > 3000) break;
            driver.findElement(By.xpath(dateFieldElement)).click();
        } while (!driver.findElement(By.xpath(calendarElement)).isDisplayed());
    }

    public void clickOnDateElement() {
        driver.findElement(By.xpath(dateFieldElement)).click();
    }


    // Picking the current date from the calendar on When do you need tenants field
    // provided that the calendar is already opened, otherwise the operation will fail
    public void pickTodaysDateFromDateElement() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dateTodayFromCalendarElement)));
        driver.findElement(By.xpath(dateTodayFromCalendarElement)).click();
    }

    public void enterTextInPostcodeTextField(String postcode) {
        driver.findElement(By.xpath(postcodeFieldElement)).sendKeys(postcode);
    }

    public void clickOnFindUKAddressCTA() {
        driver.findElement(By.xpath(findUKAddressCTAElement)).click();
    }

    public void clickOnSelectAddressDropdown() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectAddressDropdownElement)));
        driver.findElement(By.xpath(selectAddressDropdownElement)).click();
    }

    public void selectFirstAddressInSelectAddressDropdown() {
        driver.findElement(By.xpath(firstAddressInTheSelectAddressDropdownElement)).click();
    }

    public void enterTextInFirstNameTextField(String firstName) {
        driver.findElement(By.xpath(firstNameTextFieldElement)).sendKeys(firstName);
    }

    public void enterTextInLastNameTextField(String lastName) {
        driver.findElement(By.xpath(lastNameTextFieldElement)).sendKeys(lastName);
    }

    public void enterTextInEmailTextField(String email) {
        driver.findElement(By.xpath(emailTextFieldElement)).sendKeys(email);
    }

    public void enterTextInPhoneTextField(String phone) {
        driver.findElement(By.xpath(phoneTextFieldElement)).sendKeys(phone);
    }

    public void clickOnSendRequestButton() {
        driver.findElement(By.xpath(sendRequestButtonElement)).click();
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(thankYouHeadingElement)));
    }
}