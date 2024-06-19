package pages;

import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;
import utilities.CommonMethods;

import java.time.Duration;

public class ForgotPasswordPage {

    private WebDriver driver;
    public ForgotPasswordPage(WebDriver driver) { this.driver = driver; }

    // Page elements
    public static String forgotPasswordURL = FoxtonsHooks.HOST.replace(projectProperties.getProperty("URL_REPLACE"), "") + "auth/forgotpassword";
    public static String accountOverviewURL = FoxtonsHooks.HOST.replace(projectProperties.getProperty("URL_REPLACE"), "") + "account/overview";
    public static String forgotPasswordCTAXPath = "//a[contains(.,'Forgot Password?')]";
    public static String forgotPasswordEmailTextboxXPath = "//input[@id='email']";
    public static String resetPasswordInfoXPath = "//p[contains(.,'email')]";
    public static String continueCTAXPath = "//button[@type='submit']";

    // Page actions
    public void isForgotPasswordCTAPresent() {
        CommonMethods.I_AmWait(driver, forgotPasswordCTAXPath);
        driver.findElement(By.xpath(forgotPasswordCTAXPath)).isDisplayed();
    }

    public boolean isForgotPasswordCTAClickable() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement element = wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(forgotPasswordCTAXPath)));
        if (element.isDisplayed()) { return true; }
        else return false;
    }

    public void clickForgotPasswordCTA() {
        CommonMethods.I_AmWait(driver, forgotPasswordCTAXPath);
        driver.findElement(By.xpath(forgotPasswordCTAXPath)).click();
        try {
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
            wdw.until(ExpectedConditions.urlToBe(forgotPasswordURL));
        } catch (TimeoutException e) {}
    }

    public void accessForgotPasswordPage() {
        driver.get(forgotPasswordURL);
        try {
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
            wdw.until(ExpectedConditions.urlToBe(forgotPasswordURL));
        } catch (TimeoutException e) {}
        CommonMethods.clickCookie(driver);
    }

    public void accountOverviewPageIsOpened() {
        try {
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
            wdw.until(ExpectedConditions.urlToBe(accountOverviewURL));
        } catch (TimeoutException e) {}
    }

    public void enterForgotPasswordEmail(String email) {
        driver.findElement(By.xpath(forgotPasswordEmailTextboxXPath)).sendKeys(email);
    }

    public boolean isContinueCTAClickable() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement element = wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(continueCTAXPath)));
        if (element.isDisplayed()) { return true; }
        else return false;
    }

    public void clickContinueCTA() {
        driver.findElement(By.xpath(continueCTAXPath)).click();
    }

    public boolean isResetPasswordInfoPresent() {
        CommonMethods.I_AmWait(driver, resetPasswordInfoXPath);
        if (driver.findElement(By.xpath(resetPasswordInfoXPath)).isDisplayed()) { return true; }
        else return false;
    }
}
