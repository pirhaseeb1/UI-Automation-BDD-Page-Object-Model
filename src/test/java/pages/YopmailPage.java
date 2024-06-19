package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YopmailPage {
    static WebDriver driver;
    public YopmailPage(WebDriver driver) { this.driver = driver; }

    // Page elements

    public static String yopmailHome = "https://yopmail.com/";
    public static String yopmailInbox = yopmailHome + "wm";
    public static String loginTextboxXPath = "//input[@id='login']";
    public static String loginButtonXPath = "//button[@class='md']";
    public static String verifyFoxtonsAccountEmailMessageXPath = "";
    public static String CTAInTheEmailXPath = "";
    public static String yopmailWindowHandle = "";

    // Page actions

    public void openYopmailInANewTab() {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(yopmailHome);
        yopmailWindowHandle = driver.getWindowHandle();
        try {
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
            wdw.until(ExpectedConditions.urlToBe(yopmailHome));
        } catch (TimeoutException e) {}
    }

    public void enterEmailAddressOnYopmailAndOpenInbox(String emailAddress) {
        try {
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
            wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(loginTextboxXPath)));
        } catch (TimeoutException e) {}

        driver.findElement(By.xpath(loginTextboxXPath)).sendKeys(emailAddress);
        driver.findElement(By.xpath(loginButtonXPath)).click();

        try {
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
            wdw.until(ExpectedConditions.urlToBe(yopmailInbox));
        } catch (TimeoutException e) {}
    }

    public void locateAndOpenFoxtonsEmailOnYopmail(String phraseInEmailSubject) {
        driver.switchTo().window(yopmailWindowHandle);
        driver.switchTo().frame("ifinbox");
        verifyFoxtonsAccountEmailMessageXPath = "(//div[@class='m']//div[contains(.,'" + phraseInEmailSubject + "')])[1]";

        try {
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
            wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(verifyFoxtonsAccountEmailMessageXPath)));
        } catch (TimeoutException e) {}
        driver.findElement(By.xpath(verifyFoxtonsAccountEmailMessageXPath)).click();
    }

    public void clickCTAInTheFoxtonsEmailOnYopmail(String phraseOnCTA) {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("ifmail");
        CTAInTheEmailXPath = "//span[contains(.,'" + phraseOnCTA + "')]";

        try {
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
            wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(CTAInTheEmailXPath)));
        } catch (TimeoutException e) {}
        driver.findElement(By.xpath(CTAInTheEmailXPath)).click();
    }
}
