package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinitions.FoxtonsHooks;
import testrunners.projectProperties;
import utilities.CommonMethods;

import java.time.Duration;

public class VerifyEmailPage {

    private WebDriver driver;

    public VerifyEmailPage(WebDriver driver) {
        this.driver = driver;
    }
    public static String VerifyEmailURL = FoxtonsHooks.HOST.replace(projectProperties.getProperty("URL_REPLACE"), "") + "account";
    public static String Logout ="//div[@class='MuiBox-root css-0']";
    public static String verifyAccountInfoXPath = "//p[contains(.,'email')]";
    public static String resendVerifyEmailButtonXPath = "//button[contains(.,'I haven’t received an email')]";
    public static String resendVerifyEmailInfoXPath = "";

    public void validate(){
        CommonMethods.I_AmWait(driver,Logout);
    }

    public void verifyAccountPageIsOpened() {
        try {
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
            wdw.until(ExpectedConditions.urlToBe(VerifyEmailURL));
        } catch (TimeoutException e) {}
    }

    public boolean isVerifyAccountInfoPresent() {
        CommonMethods.I_AmWait(driver, verifyAccountInfoXPath);
        if (driver.findElement(By.xpath(verifyAccountInfoXPath)).isDisplayed()) { return true; }
        else return false;
    }

    public void clickResendVerifyEmailButton() {
        CommonMethods.I_AmWait(driver, resendVerifyEmailButtonXPath);
        driver.findElement(By.xpath(resendVerifyEmailButtonXPath)).click();
    }

    public boolean isResendVerifyEmailInfoPresent(String email) {
        resendVerifyEmailInfoXPath = "//div[@class='MuiBox-root css-0'][contains(.,'" + email + "')]";
        CommonMethods.I_AmWait(driver, resendVerifyEmailInfoXPath);
        if (driver.findElement(By.xpath(resendVerifyEmailInfoXPath)).isDisplayed()) { return true; }
        else return false;
    }
}
