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

public class SignOutPage {

    private WebDriver driver;
    public SignOutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Page elements
    public static String confirmLogoutPaneXPath = "(//div[contains(@class,'MuiBox-root css')][contains(.,'Are you sure')])[2]";
    public static String confirmLogoutButtonXPath = "(//*[text()='Logout'])[2]";
    public static String usernameOnTopLeftXPath = "//div[contains(@class,'MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-')]";
    public static String LoginURLStage = projectProperties.getProperty("STAGE_URL") + "auth/login";
    public static String LoginURLQA =projectProperties.getProperty("QA_URL") + "auth/login";
    public static String cancelLogoutButtonXPath = "//button[contains(.,'Cancel')]";
    public static String URLBeforeClickingCancel = "";

    // Page Actions

    public void clickUsernameOnTopLeft() {
        CommonMethods.I_AmWait(driver, usernameOnTopLeftXPath);
        driver.findElement(By.xpath(usernameOnTopLeftXPath)).click();
    }

    public boolean isConfirmLogoutPaneDisplayed() {
        CommonMethods.I_AmWait(driver, confirmLogoutPaneXPath);
        return driver.findElement(By.xpath(confirmLogoutPaneXPath)).isDisplayed();
    }

    public void clickLogoutOnConfirmationPane() {
        CommonMethods.I_AmWait(driver, confirmLogoutButtonXPath);
        driver.findElement(By.xpath(confirmLogoutButtonXPath)).click();
    }

    public boolean isLoginURLFound() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        String hostURL = FoxtonsHooks.HOST;
        if (hostURL.equals(projectProperties.getProperty("STAGE_AUTH_URL"))) {
            wdw.until(ExpectedConditions.urlToBe(LoginURLStage));
            return true;
        } else if (hostURL.equals(projectProperties.getProperty("QA_AUTH_URL"))) {
            wdw.until(ExpectedConditions.urlToBe(LoginURLQA));
            return true;
        } else { return false; }
    }

    public void clickCancelOnConfirmationPane() {
        CommonMethods.I_AmWait(driver, cancelLogoutButtonXPath);
        URLBeforeClickingCancel = driver.getCurrentUrl();
        driver.findElement(By.xpath(cancelLogoutButtonXPath)).click();
    }

    public boolean isUsernameOnTopLeftDisplayed() {
        CommonMethods.I_AmWait(driver, usernameOnTopLeftXPath);
        return driver.findElement(By.xpath(usernameOnTopLeftXPath)).isDisplayed();
    }
}

//div[contains(@class,'MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-')]